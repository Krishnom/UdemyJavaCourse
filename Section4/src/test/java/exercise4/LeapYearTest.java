package exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LeapYearTest {
    /*  isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
        isLeapYear(1600); → should return true since 1600 is a leap year
        isLeapYear(2017); → should return false since 2017 is not a leap year
        isLeapYear(2000);  → should return true because 2000 is a leap year
     */
    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(-1600, false),
                Arguments.of(1600, true),
                Arguments.of(2017, false),
                Arguments.of(2000, true),
                Arguments.of(2004, true)
        );
    }


    @ParameterizedTest
    @MethodSource("data")
    public void isLeapYear(int year, boolean isLeapYear) {
        Assertions.assertEquals(isLeapYear, LeapYear.isLeapYear(year));
    }
}