package exercise9;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MinutesToYearsDaysCalculatorTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(525600, "525600 min = 1 y and 0 d"),
                Arguments.of(1051200, "1051200 min = 2 y and 0 d"),
                Arguments.of(561600, "561600 min = 1 y and 25 d"),
                Arguments.of(-1, "Invalid Value")
        );
    }

    /*
        printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
        printYearsAndDays(-1);  → should print "Invalid Value"
         */
    @ParameterizedTest
    @MethodSource("data")
    public void printYearsAndDays(long minutes, String expectedString) {
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        assertSysout(expectedString);
    }
}