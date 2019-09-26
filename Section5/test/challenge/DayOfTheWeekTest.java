package challenge;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

public class DayOfTheWeekTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index} {0}th day is {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, "Sunday"},
                {6, "Saturday"},
                {7, "Invalid Day"},
                {-1, "Invalid Day"}
        });
    }

    int day;
    String dayOfWeek;

    public DayOfTheWeekTest(int day, String dayOfWeek) {
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    @Test
    public void printDayOfWeekUsingSwitchCase() {
        DayOfTheWeek.printDayOfWeekUsingSwitchCase(day);
        assertSysout(dayOfWeek);
    }

    @Test
    public void printDayOfWeekUsingIfElse() {
        DayOfTheWeek.printDayOfWeekUsingIfElse(day);
        assertSysout(dayOfWeek);
    }
}