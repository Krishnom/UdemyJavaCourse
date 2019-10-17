package exercise6;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualSumCheckerTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 1, 1, false),
                Arguments.of(1, 1, 2, true),
                Arguments.of(1, -1, 0, true)
        );
    }

    /**
     * hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
     * hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
     * hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0
     */
    @ParameterizedTest
    @MethodSource("data")
    public void hasEqualSum(int val1, int val2, int sum, boolean isEqual) {
        assertEquals(isEqual, EqualSumChecker.hasEqualSum(val1, val2, sum));
    }
}