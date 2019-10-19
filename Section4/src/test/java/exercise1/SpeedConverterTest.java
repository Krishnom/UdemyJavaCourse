package exercise1;


import exercise9.TestHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SpeedConverterTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1.5, 1),      // toMilesPerHour(1.5); → should return value 1
                Arguments.of(10.25, 6),     // toMilesPerHour(10.25); → should return value 6
                Arguments.of(-5.6, -1),    // toMilesPerHour(-5.6); → should return value -1
                Arguments.of(25.42, 16),    // toMilesPerHour(25.42); → should return value 16
                Arguments.of(75.114, 47)   // toMilesPerHour(75.114); → should return value 47
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void printConversionPrintsExpectedString(double km, long miles) {
        SpeedConverter.printConversion(km);
        if (km > 0) {
            assertSysout(km + " km/h = " + Math.round(km / exercise1.SpeedConverter.conversionRate) + " mi/h");
        } else {
            assertSysout("Invalid Value");
        }
    }

    @ParameterizedTest
    @MethodSource("data")
    public void milesConversionIsAsExpected(double km, long miles) {
        Assertions.assertEquals(miles, exercise1.SpeedConverter.toMilesPerHour(km));
    }
}