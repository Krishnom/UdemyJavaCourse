package exercise9;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

public class MinutesToYearsDaysCalculatorTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index} {0} is {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {525600, "525600 min = 1 y and 0 d"},
                {1051200, "1051200 min = 2 y and 0 d"},
                {561600, "561600 min = 1 y and 25 d"},
                {-1, "Invalid Value"}
        });
    }

    private final long minutes;
    private final String expectedString;

    public MinutesToYearsDaysCalculatorTest(long minutes, String expectedString) {
        this.minutes = minutes;
        this.expectedString = expectedString;
    }

    /*
        printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
        printYearsAndDays(-1);  → should print "Invalid Value"
         */
    @Test
    public void printYearsAndDays() {
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        assertSysout(expectedString);
    }
}