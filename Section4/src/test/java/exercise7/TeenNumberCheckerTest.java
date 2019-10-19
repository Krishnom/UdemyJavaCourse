package exercise7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TeenNumberCheckerTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(15, 99, 29, true),//hasTeen(15, 99, 29);  should return true since 15 is in range 13 - 19
                Arguments.of(23, 15, 42, true),//hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
                Arguments.of(9, 99, 19, true),//hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
                Arguments.of(22, 23, 34, false)//hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void hasTeen(int num1, int num2, int num3, boolean hasTeen) {
        Assertions.assertEquals(hasTeen, TeenNumberChecker.hasTeen(num1, num2, num3));
    }
}