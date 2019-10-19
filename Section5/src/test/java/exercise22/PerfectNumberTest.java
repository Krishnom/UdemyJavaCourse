package exercise22;


import exercise21.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectNumberTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(6, true),//isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
                Arguments.of(28, true),//isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
                Arguments.of(5, false),//isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
                Arguments.of(-1, false)//isPerfectNumber(-1); should return false since the number is < 1
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void isPerfectNumber(int num, boolean isPerfect) {
        assertEquals(isPerfect, PerfectNumber.isPerfectNumber(num));
    }
}