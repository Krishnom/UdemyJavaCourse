package exercise14;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SumOddRangeTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name = "Test{index}->SumOfallOdd {0}->{1} is {2}")
    public static Iterable<Object> data(){
        return Arrays.asList(new Object[][]{
                {1,100,2500}, //sumOdd(1, 100); → should return 2500
                {-1,100, -1}, //sumOdd(-1, 100); → should return -1
                {100,100,0}, //sumOdd(100, 100); → should return 0
                {13,13,13}, //    sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
                {100,-100,-1}, //    sumOdd(100, -100); → should return -1
                {100,1000, 247500}, //    sumOdd(100, 1000); → should return 247500
        });
    }

    private final int firstNum;
    private final int lastNum;
    private final int sumOfOdds;

    public SumOddRangeTest(int firstNum, int lastNum, int sumOfOdds) {
        this.firstNum = firstNum;
        this.lastNum = lastNum;
        this.sumOfOdds = sumOfOdds;
    }


    @Test
    public void sumOdd() {
        assertEquals(sumOfOdds,SumOddRange.sumOdd(firstNum,lastNum));
    }
}