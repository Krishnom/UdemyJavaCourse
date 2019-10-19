package exercise14;


import exercise21.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOddRangeTest extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(1,100,2500), //sumOdd(1, 100); → should return 2500
                Arguments.of(-1,100, -1), //sumOdd(-1, 100); → should return -1
                Arguments.of(100,100,0), //sumOdd(100, 100); → should return 0
                Arguments.of(13,13,13), //    sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
                Arguments.of(100,-100,-1), //    sumOdd(100, -100); → should return -1
                Arguments.of(100,1000, 247500) //    sumOdd(100, 1000); → should return 247500
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void sumOdd(int firstNum, int lastNum, int sumOfOdds) {
        assertEquals(sumOfOdds,SumOddRange.sumOdd(firstNum,lastNum));
    }
}