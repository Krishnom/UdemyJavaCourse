package challenge;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DayOfTheWeekTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(0, "Sunday"),
                Arguments.of(6, "Saturday"),
                Arguments.of(7, "Invalid Day"),
                Arguments.of(-1, "Invalid Day")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void printDayOfWeekUsingSwitchCase(int day, String dayOfWeek) {
        DayOfTheWeek.printDayOfWeekUsingSwitchCase(day);
        assertSysout(dayOfWeek);
    }

    @ParameterizedTest
    @MethodSource("data")
    public void printDayOfWeekUsingIfElse(int day, String dayOfWeek) {
        DayOfTheWeek.printDayOfWeekUsingIfElse(day);
        assertSysout(dayOfWeek);
    }
}