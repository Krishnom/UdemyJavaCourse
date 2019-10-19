package exercise17;


import exercise21.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenDigitSumTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(123456789, 20),    //getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
                Arguments.of(252, 4),   //getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
                Arguments.of(-22, -1)   //getEvenDigitSum(-22); → should return -1 since the number is negative
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getEvenDigitSum(int num, int sumOfEvenDigits) {
        assertEquals(sumOfEvenDigits,EvenDigitSum.getEvenDigitSum(num));
    }
}