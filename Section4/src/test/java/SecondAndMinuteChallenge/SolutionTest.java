package SecondAndMinuteChallenge;

import exercise9.TestHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(-1,10,"Invalid Value"), //minutes < 0 returns "Invalid value"
                Arguments.of(1,60, "Invalid Value"), //Invalid seconds value(sec <= 59 && sec >=0)
                Arguments.of(1,-1, "Invalid Value"), //Negative seconds value
                Arguments.of(1,-1, "Invalid Value"), //Negative seconds value
                Arguments.of(1,-1, "Invalid Value"), //Negative seconds value
                Arguments.of(61,50, "01h 01m 50s"), //valid value returns time in format "XXh YYm ZZs"
                Arguments.of(0,50, "00h 00m 50s"), //valid value returns time in format "XXh YYm ZZs"
                Arguments.of(60,50, "01h 00m 50s"), //valid value returns time in format "XXh YYm ZZs"
                Arguments.of(2060,50, "34h 20m 50s") //valid value returns time in format "XXh YYm ZZs"
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getDurationString(int minute, int seconds, String durationString){
        Assertions.assertEquals(durationString, Solution.getDurationString(minute, seconds));
    }

    @SuppressWarnings("EmptyMethod")
    @Test
    @Disabled("TODO: Not able to find a way to inject two different data into one JUnit Test")
    public void testGetDurationString() {
        //TODO: how to use two data in single data driven test
    }
}