package exercise10;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

public class IntEqualityPrinterTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index}: {0},{1},{2} -> {3}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1, "All numbers are equal"},
                {1, 1, 2, "Neither all are equal or different"},
                {-1, -1, -1, "Invalid Value"},
                {1, 2, 3, "All numbers are different"}
        });
    }

    private int num1;
    private int num2;
    private int num3;
    private String expectedString;

    public IntEqualityPrinterTest(int num1, int num2, int num3, String expectedString) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.expectedString = expectedString;
    }

    /*
        printEqual(1, 1, 1); should print text All numbers are equal
        printEqual(1, 1, 2); should print text Neither all are equal or different
        printEqual(-1, -1, -1); should print text Invalid Value
        printEqual(1, 2, 3); should print text All numbers are different
         */
    @Test
    public void printEqual() {
        IntEqualityPrinter.printEqual(num1,num2,num3);
        assertSysout(expectedString);
    }
}