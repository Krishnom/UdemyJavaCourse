package exercise6;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class EqualSumCheckerTest extends ParameterizedTestHelper {
    private final int val1;
    private final int val2;
    private final int sum;
    private final boolean isEqual;

    @Parameterized.Parameters(name = "Test{index} {0}+{1}={2} is {3}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1, false},
                {1, 1, 2, true},
                {1, -1, 0, true},
        });
    }

    public EqualSumCheckerTest(int val1, int val2, int sum, boolean isEqual) {
        this.val1 = val1;
        this.val2 = val2;
        this.sum = sum;
        this.isEqual = isEqual;
    }


    /**
     * hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
     * hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
     * hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0
     */
    @Test
    public void hasEqualSum() {
        assertEquals(isEqual, EqualSumChecker.hasEqualSum(val1, val2, sum));
    }
}