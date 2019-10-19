package exercise25;


import exercise21.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPrimeTest extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(21,7),//getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
                Arguments.of(7,7),//getLargestPrime (7); should return 7 since 7 itself is prime number
                Arguments.of(4,2),//getLargestPrime (4); should return 2 since 2 is the largest prime (2*2 = 4)
                Arguments.of(217,31),//getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
                Arguments.of(0,-1),//getLargestPrime (0); should return -1 since 0 does not have any prime numbers
                Arguments.of(45,5),//getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
                Arguments.of(-1,-1)//getLargestPrime (-1); should return -1 since the parameter is negative
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getLargestPrime(int num, int largestPrimeFactor){
        assertEquals(largestPrimeFactor,LargestPrime.getLargestPrime(num));
    }
}