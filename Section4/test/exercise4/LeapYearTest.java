package exercise4;

import common.TestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class LeapYearTest extends TestHelper {

    private final int year;
    private final boolean isLeapYear;

    public LeapYearTest(int year, boolean isLeapYear) {
        this.year = year;
        this.isLeapYear = isLeapYear;
    }

    /*  isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
        isLeapYear(1600); → should return true since 1600 is a leap year
        isLeapYear(2017); → should return false since 2017 is not a leap year
        isLeapYear(2000);  → should return true because 2000 is a leap year
     */
    @Parameterized.Parameters(name = "Test={index} Is Year {0} Leap? {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {-1600, false},
                {1600, true},
                {2017, false},
                {2000, true},
                {2004, true},
        });
    }


    @Test
    public void isLeapYear() {
        assertEquals(isLeapYear,LeapYear.isLeapYear(year));
    }
}