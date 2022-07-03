import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void newWaterBottle (){
        waterBottle = new WaterBottle();
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void reducesBy10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
//        be aware of false positives
    }

    @Test
    public void emptyToZero(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillTo100(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }

}
