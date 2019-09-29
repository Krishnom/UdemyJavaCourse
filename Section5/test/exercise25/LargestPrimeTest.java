package exercise25;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LargestPrimeTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="Test{index} Largest Prime Factor For {0} is {1}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {21,7},//getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
                {7,7},//getLargestPrime (7); should return 7 since 7 itself is prime number
                {4,2},//getLargestPrime (4); should return 2 since 2 is the largest prime (2*2 = 4)
                {217,31},//getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
                {0,-1},//getLargestPrime (0); should return -1 since 0 does not have any prime numbers
                {45,5},//getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
                {-1,-1}//getLargestPrime (-1); should return -1 since the parameter is negative
        });
    }


    int num;
    int largestPrimeFactor;

    public LargestPrimeTest(int num, int largestPrimeFactor) {
        this.num = num;
        this.largestPrimeFactor = largestPrimeFactor;
    }

    @Test
    public void getLargestPrime(){
        assertEquals(largestPrimeFactor,LargestPrime.getLargestPrime(num));
    }
}