import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void subtract() {
        assertEquals(1, calculator.subtract(2,1));
    }

    @Test
    public void multiply() {
        assertEquals(9, calculator.multiply(3,3));
    }

    @Test
    public void divide() {
        assertEquals(4.0, calculator.divide(8.0,2.0), 0.0);
    }
}
