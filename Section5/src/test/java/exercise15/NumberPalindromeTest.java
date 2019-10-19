package exercise15;


import exercise21.TestHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberPalindromeTest extends TestHelper {

    public static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(-1221, true), //isPalindrome(-1221); → should return true
                Arguments.of(707,true),//isPalindrome(707); → should return true
                Arguments.of(11212,false)//isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void isPalindrome(int num, boolean isPalindrome) {
        assertEquals(isPalindrome, NumberPalindrome.isPalindrome(num));
    }
}