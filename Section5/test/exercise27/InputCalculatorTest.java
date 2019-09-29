package exercise27;

import common.ParameterizedTestHelper;
import common.TestHelper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class InputCalculatorTest extends TestHelper {
    String input1 = "1\n2\n3\n4\n5\na\n";
    String expectedOut1 = "SUM = 15 AVG = 3";
    String input2 = "hello\n";
    String expectedOut2 = "SUM = 0 AVG = 0";


    @Test
    @Ignore("Failing because sysin not working")
    public void input1() {
        setInputContent(input1);
        InputCalculator.inputThenPrintSumAndAverage();
        assertSysout(expectedOut1);
    }


    @Test
    @Ignore("Failing because sysin not working")
    public void input2() {
        setInputContent(input2);
        InputCalculator.inputThenPrintSumAndAverage();
        assertSysout(expectedOut2);
    }

}