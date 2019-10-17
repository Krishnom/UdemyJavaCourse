package challenge;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitsTest extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(1,1),
                Arguments.of(12,3),
                Arguments.of(1234, 10),
                Arguments.of(9999,36),
                Arguments.of(9000, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getDigitSum(int num, int digitSum) {
        assertEquals(digitSum,SumDigits.getDigitSum(num));
    }
}