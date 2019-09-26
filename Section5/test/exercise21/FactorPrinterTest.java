package exercise21;

import common.ParameterizedTestHelper;
import exercise16.FirstLastDigitSum;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FactorPrinterTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="Test{index}-> {0} prints \"{1}\"")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {6,"1 2 3 6"},//printFactors(6); → should print 1 2 3 6
                {32, "1 2 4 8 16 32"},//printFactors(32); → should print 1 2 4 8 16 32
                {10,"1 2 5 10"},//printFactors(10); → should print 1 2 5 10
                {-1,"Invalid Value"}//printFactors(-1); → should print "Invalid Value" since number is < 1
        });
    }

    int num;
    String expectedOutput;

    public FactorPrinterTest(int num, String expectedOutput) {
        this.num = num;
        this.expectedOutput = expectedOutput;
    }

    @Test
    public void printFactors() {
        FactorPrinter.printFactors(num);
        assertSysout(expectedOutput);
    }
}