package exercise16;


import exercise21.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstLastDigitSumTest extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(252,4), //sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
                Arguments.of(257,9),//sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
                Arguments.of(0,0),//sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
                Arguments.of(5,10),//sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
                Arguments.of(-10,-1)//sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void sumFirstAndLastDigit(int num, int sumOfFirstAndLast) {
        assertEquals(sumOfFirstAndLast, FirstLastDigitSum.sumFirstAndLastDigit(num));
    }
}