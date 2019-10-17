package exercise21;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FactorPrinterTest extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(6,"1 2 3 6"),//printFactors(6); → should print 1 2 3 6
                Arguments.of(32, "1 2 4 8 16 32"),//printFactors(32); → should print 1 2 4 8 16 32
                Arguments.of(10,"1 2 5 10"),//printFactors(10); → should print 1 2 5 10
                Arguments.of(-1,"Invalid Value")//printFactors(-1); → should print "Invalid Value" since number is < 1
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void printFactors(int num, String expectedOutput) {
        FactorPrinter.printFactors(num);
        assertSysout(expectedOutput);
    }
}