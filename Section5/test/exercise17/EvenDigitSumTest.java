package exercise17;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class EvenDigitSumTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index} SumOfEvenDigitsIn {0} is {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {123456789, 20},    //getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
                {252, 4},   //getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
                {-22, -1}   //getEvenDigitSum(-22); → should return -1 since the number is negative
        });
    }

    int num;
    int sumOfEvenDigits;

    public EvenDigitSumTest(int num, int sumOfEvenDigits) {
        this.num = num;
        this.sumOfEvenDigits = sumOfEvenDigits;
    }

    @Test
    public void getEvenDigitSum() {
        assertEquals(sumOfEvenDigits,EvenDigitSum.getEvenDigitSum(num));
    }
}