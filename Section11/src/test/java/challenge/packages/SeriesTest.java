package challenge.packages;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeriesTest {

    public static Stream<Arguments> sumOfNNumberData() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(10, 55),
                Arguments.of(100000, 705082704),
                Arguments.of(-10, 0)
        );
    }

    public static Stream<Arguments> factorialData() {
        return Stream.of(
                Arguments.of(0, -1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(-1, -1)
        );
    }

    public static Stream<Arguments> fibonacciData() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(9, 34),
                Arguments.of(-1, 0)
        );
    }

    @ParameterizedTest(name = "Sum of first {0} numbers is {1}")
    @MethodSource("sumOfNNumberData")
    void nSum(int num, long sumOfN) {
        assertEquals(sumOfN, Series.nSum(num));
    }

    @ParameterizedTest(name = "Factorial of first {0} numbers is {1}")
    @MethodSource("factorialData")
    void factorial(int n, long factorialOfN) {
        assertEquals(factorialOfN, Series.factorial(n));
    }

    @ParameterizedTest(name = "{0}th fibonacci number is {1}")
    @MethodSource("fibonacciData")
    void fibonacci(int n, long nThFibonacci) {
        assertEquals(nThFibonacci, Series.fibonacci(n));
    }
}