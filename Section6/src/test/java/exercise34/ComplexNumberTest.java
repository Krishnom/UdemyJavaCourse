package exercise34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexNumberTest {
    private ComplexNumber complexNumber;

    @BeforeEach
    public void init() {

        complexNumber = new ComplexNumber(1.0, 2.0);
    }

    @Test
    public void addingRealAndImaginaryAsFieldsProducesExpectedResults() {
        complexNumber.add(1.0, 1.0);
        assertEquals(2.0, complexNumber.getReal(), 0.0);
        assertEquals(3.0, complexNumber.getImaginary(), 0.0);
    }

    @Test
    public void addingComplexNumberProducesExpectedResults() {
        complexNumber.add(new ComplexNumber(1.0, 1.0));
        assertEquals(2.0, complexNumber.getReal(), 0.0);
        assertEquals(3.0, complexNumber.getImaginary(), 0.0);
    }

    @Test
    public void subtractingRealAndImaginaryAsFieldsProducesExpectedResults() {
        complexNumber.subtract(1.0, 1.0);
        assertEquals(0.0, complexNumber.getReal(), 0.0);
        assertEquals(1.0, complexNumber.getImaginary(), 0.0);
    }

    @Test
    public void subtractingComplexNumberProducesExpectedResults() {
        complexNumber.subtract(new ComplexNumber(1.0, 1.0));
        assertEquals(0.0, complexNumber.getReal(), 0.0);
        assertEquals(1.0, complexNumber.getImaginary(), 0.0);
    }
}