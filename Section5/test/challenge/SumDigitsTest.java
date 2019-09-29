package challenge;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumDigitsTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="Test{index} sumOfDigitIn{0} is {1}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,1},
                {12,3},
                {1234, 10},
                {9999,36},
                {9000, 9}
        });
    }

    private final int num;
    private final int digitSum;

    public SumDigitsTest(int num, int digitSum) {
        this.num = num;
        this.digitSum = digitSum;
    }


    @Test
    public void getDigitSum() {
        assertEquals(digitSum,SumDigits.getDigitSum(num));
    }
}