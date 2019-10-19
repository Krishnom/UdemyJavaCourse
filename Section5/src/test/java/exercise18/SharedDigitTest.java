package exercise18;


import exercise21.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharedDigitTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(12, 23, true),//hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
                Arguments.of(9, 99, false),//hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
                Arguments.of(15, 55, true)//hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void hasSharedDigit(int num1, int num2, boolean hasSharedDigit) {
        assertEquals(hasSharedDigit, SharedDigit.hasSharedDigit(num1,num2));
    }
}