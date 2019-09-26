package exercise20;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GreatestCommonDivisorTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="Test{index} GreatestCommonDivisor({0},{1}) -> {2}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {25,15,5},//getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
                {12,30,6},//getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
                {9,18,-1},//getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
                {81,153,9}//getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
        });
    }

    int num1,num2,gcd;

    public GreatestCommonDivisorTest(int num1, int num2, int gcd) {
        this.num1 = num1;
        this.num2 = num2;
        this.gcd = gcd;
    }

    @Test
    public void getGreatestCommonDivisor() {
        assertEquals(gcd, GreatestCommonDivisor.getGreatestCommonDivisor(num1,num2));
    }
}