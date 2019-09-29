package exercise18;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SharedDigitTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="Test{index}->{0} and {1} has shared digit? {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {12, 23, true},//hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
                {9, 99, false},//hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
                {15, 55, true},//hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
        });
    }

    private final int num1;
    private final int num2;
    private final boolean hasSharedDigit;

    public SharedDigitTest(int num1, int num2, boolean hasSharedDigit) {
        this.num1 = num1;
        this.num2 = num2;
        this.hasSharedDigit = hasSharedDigit;
    }

    @Test
    public void hasSharedDigit() {
        assertEquals(hasSharedDigit, SharedDigit.hasSharedDigit(num1,num2));
    }
}