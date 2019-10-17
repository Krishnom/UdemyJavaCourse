package exercise29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void testSimpleCalculator() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        assertEquals(9.0, calculator.getAdditionResult(), 0.0);
        assertEquals(1.0, calculator.getSubtractionResult(), 0.0);
        assertEquals(20.0, calculator.getMultiplicationResult(), 0.0);
        assertEquals(1.25, calculator.getDivisionResult(), 0.0);

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        assertEquals(0.0, calculator.getMultiplicationResult(), 0.0);
        assertEquals(0.0, calculator.getDivisionResult(), 0.0);
    }

}