package exercise22;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PerfectNumberTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index} {0} is perfect number? {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {6, true},//isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
                {28, true},//isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
                {5, false},//isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
                {-1, false}//isPerfectNumber(-1); should return false since the number is < 1
        });
    }

    private final int num;
    private final boolean isPerfect;

    public PerfectNumberTest(int num, boolean isPerfect) {
        this.num = num;
        this.isPerfect = isPerfect;
    }

    @Test
    public void isPerfectNumber() {
        assertEquals(isPerfect, PerfectNumber.isPerfectNumber(num));
    }
}