package exercise15;

import common.ParameterizedTestHelper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NumberPalindromeTest extends ParameterizedTestHelper {

    @Parameterized.Parameters(name="{0} is palindrome? {1} ")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {-1221, true}, //isPalindrome(-1221); → should return true
                {707,true},//isPalindrome(707); → should return true
                {11212,false},//isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
        });
    }
    private final int num;
    private final boolean isPalindrome;

    public NumberPalindromeTest(int num, boolean isPalindrome) {
        this.num = num;
        this.isPalindrome = isPalindrome;
    }

    @Test
    public void isPalindrome() {
        assertEquals(isPalindrome, NumberPalindrome.isPalindrome(num));
    }
}