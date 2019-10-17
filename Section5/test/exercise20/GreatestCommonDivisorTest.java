package exercise20;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorTest extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(25,15,5),//getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
                Arguments.of(12,30,6),//getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
                Arguments.of(9,18,-1),//getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
                Arguments.of(81,153,9)//getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getGreatestCommonDivisor(int num1, int num2, int gcd) {
        assertEquals(gcd, GreatestCommonDivisor.getGreatestCommonDivisor(num1,num2));
    }
}