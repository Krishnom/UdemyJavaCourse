package exercise10;

import common.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IntEqualityPrinterTest extends TestHelper {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 1, 1, "All numbers are equal"),
                Arguments.of(1, 1, 2, "Neither all are equal or different"),
                Arguments.of(-1, -1, -1, "Invalid Value"),
                Arguments.of(1, 2, 3, "All numbers are different")
        );
    }

    /*
        printEqual(1, 1, 1); should print text All numbers are equal
        printEqual(1, 1, 2); should print text Neither all are equal or different
        printEqual(-1, -1, -1); should print text Invalid Value
        printEqual(1, 2, 3); should print text All numbers are different
         */
    @ParameterizedTest
    @MethodSource("data")
    public void printEqual(int num1, int num2, int num3, String expectedString) {
        IntEqualityPrinter.printEqual(num1, num2, num3);
        assertSysout(expectedString);
    }
}