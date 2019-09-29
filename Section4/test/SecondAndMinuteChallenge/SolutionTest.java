package SecondAndMinuteChallenge;

import common.ParameterizedTestHelper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;


public class SolutionTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index} -> {0} min {1} sec returns {2}")
    public static Iterable<Object[]> dataForTwoParameterMethod(){
        return Arrays.asList(new Object[][]{
                {-1,10,"Invalid Value"}, //minutes < 0 returns "Invalid value"
                {1,60, "Invalid Value"}, //Invalid seconds value(sec <= 59 && sec >=0)
                {1,-1, "Invalid Value"}, //Negative seconds value
                {1,-1, "Invalid Value"}, //Negative seconds value
                {1,-1, "Invalid Value"}, //Negative seconds value
                {61,50, "01h 01m 50s"}, //valid value returns time in format "XXh YYm ZZs"
                {0,50, "00h 00m 50s"}, //valid value returns time in format "XXh YYm ZZs"
                {60,50, "01h 00m 50s"}, //valid value returns time in format "XXh YYm ZZs"
                {2060,50, "34h 20m 50s"}, //valid value returns time in format "XXh YYm ZZs"
        });
    }


    private final int minute;
    private final int seconds;
    private final String durationString;

    public SolutionTest(int minute, int seconds, String durationString) {
        this.minute = minute;
        this.seconds = seconds;
        this.durationString = durationString;
    }

    @Test
    public void getDurationString(){
        assertEquals(durationString, Solution.getDurationString(minute,seconds));
    }

    @SuppressWarnings("EmptyMethod")
    @Test
    @Ignore("TODO: Not able to find a way to inject two different data into one JUnit Test")
    public void testGetDurationString() {
        //TODO: how to use two data in single data driven test
    }
}