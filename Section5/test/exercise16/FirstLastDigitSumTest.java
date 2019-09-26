package exercise16;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FirstLastDigitSumTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="Test{index}->Firstdigit+LastdigitIn{0}Is{1}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {252,4}, //sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
                {257,9},//sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
                {0,0},//sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
                {5,10},//sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
                {-10,-1}//sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
        });
    }

    int num;
    int sumOfFirstAndLast;

    public FirstLastDigitSumTest(int num, int sumOfFirstAndLast) {
        this.num = num;
        this.sumOfFirstAndLast = sumOfFirstAndLast;
    }

    @Test
    public void sumFirstAndLastDigit() {
        assertEquals(sumOfFirstAndLast, FirstLastDigitSum.sumFirstAndLastDigit(num));
    }
}