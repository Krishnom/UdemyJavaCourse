package exercise27;


import exercise21.TestHelper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class InputCalculatorTest extends TestHelper {
    @Test
    @Disabled("Failing because sysin not working")
    public void input1() {
        String input1 = "1\n2\n3\n4\n5\na\n";
        setInputContent(input1);
        InputCalculator.inputThenPrintSumAndAverage();
        String expectedOut1 = "SUM = 15 AVG = 3";
        assertSysout(expectedOut1);
    }

    @Test
    @Disabled("Failing because sysin not working")
    public void input2() {
        String input2 = "hello\n";
        setInputContent(input2);
        InputCalculator.inputThenPrintSumAndAverage();
        String expectedOut2 = "SUM = 0 AVG = 0";
        assertSysout(expectedOut2);
    }

}