package exercise5;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalComparatorTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(-3.1756, -3.175, true),
                Arguments.of(3.175, 3.176, false),
                Arguments.of(3.0, 3.0, true),
                Arguments.of(-3.123, 3.123, false)
        );
    }

    /**
     * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
     * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
     * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
     * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
     */
    @ParameterizedTest
    @MethodSource("data")
    public void areEqualByThreeDecimalPlaces(double doubleVal1, double doubleVal2, boolean areEqualToThreeDecimals) {
        assertEquals(areEqualToThreeDecimals, DecimalComparator.areEqualByThreeDecimalPlaces(doubleVal1, doubleVal2));
    }
}