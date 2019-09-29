package exercise27;

import common.TestHelper;
import org.junit.Ignore;
import org.junit.Test;

public class InputCalculatorTest extends TestHelper {


    @Test
    @Ignore("Failing because sysin not working")
    public void input1() {
        String input1 = "1\n2\n3\n4\n5\na\n";
        setInputContent(input1);
        InputCalculator.inputThenPrintSumAndAverage();
        String expectedOut1 = "SUM = 15 AVG = 3";
        assertSysout(expectedOut1);
    }


    @Test
    @Ignore("Failing because sysin not working")
    public void input2() {
        String input2 = "hello\n";
        setInputContent(input2);
        InputCalculator.inputThenPrintSumAndAverage();
        String expectedOut2 = "SUM = 0 AVG = 0";
        assertSysout(expectedOut2);
    }

}