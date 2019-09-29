package exercise7;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TeenNumberCheckerTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index}->{0},{1},{2} has teen number? {3}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {15, 99, 29, true},//hasTeen(15, 99, 29);  should return true since 15 is in range 13 - 19
                {23, 15, 42, true},//hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
                {9, 99, 19, true},//hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
                {22, 23, 34, false},//hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
        });
    }

    private final int num1;
    private final int num2;
    private final int num3;
    private final boolean hasTeen;

    public TeenNumberCheckerTest(int num1, int num2, int num3, boolean hasTeen) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.hasTeen = hasTeen;
    }

    @Test
    public void hasTeen() {
        assertEquals(hasTeen, TeenNumberChecker.hasTeen(num1, num2, num3));
    }
}