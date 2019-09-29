package exercise23;

import common.TestHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToWordsTest extends TestHelper {

    //numberToWords(123); should print "One Two Three".
    @Test
    public void printsOneTwoThreeFor123() {
        NumberToWords.numberToWords(123);
        assertSysout("One\r\nTwo\r\nThree");
    }

    //numberToWords(1010); should print "One Zero One Zero".
    @Test
    public void printsOneZeroOneZeroFor1010() {
        NumberToWords.numberToWords(1010);
        assertSysout("One\r\nZero\r\nOne\r\nZero");
    }

    //numberToWords(1000); should print "One Zero Zero Zero".
    @Test
    public void printsOneZeroZeroZeroFor1000() {
        NumberToWords.numberToWords(1000);
        assertSysout("One\r\nZero\r\nZero\r\nZero");
    }

    //numberToWords(-12); should print "Invalid Value" since the parameter is negative.
    @Test
    public void printsInvalidValueForMinus12() {
        NumberToWords.numberToWords(-12);
        assertSysout("Invalid Value");
    }

    //reverse(-121); should  return -121
    @Test
    public void reverseOfMinus121IsMinus121() {
        assertEquals(-121, NumberToWords.reverse(-121));
    }

    //reverse(1212); should return  2121
    @Test
    public void reverseOf1212Is2121() {
        assertEquals(2121, NumberToWords.reverse(1212));
    }

    //reverse(1234); should return 4321
    @Test
    public void reverseOf1234Is4321() {
        assertEquals(4321, NumberToWords.reverse(1234));
    }

    //reverse(100); should return 1
    @Test
    public void reverseOf100Is1() {
        assertEquals(1, NumberToWords.reverse(100));
    }


    //getDigitCount(0); should return 1 since there is only 1 digit
    @Test public void thereIs1DigitIn0(){
        assertEquals(1,NumberToWords.getDigitCount(0));
    }
    //getDigitCount(123); should return 3
    @Test public void thereAre3DigitIn123(){
        assertEquals(3,NumberToWords.getDigitCount(123));
    }
    //getDigitCount(-12); should return -1 since the parameter is negative
    @Test public void negativeValuesReturnsNegativeDigitCount(){
        assertEquals(-1,NumberToWords.getDigitCount(-12));
    }
    //getDigitCount(5200); should return 4 since there are 4 digits in the number
    @Test public void thereAre4DigitIn5200(){
        assertEquals(4,NumberToWords.getDigitCount(5200));
    }

}