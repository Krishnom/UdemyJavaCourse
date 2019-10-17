package exercise19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LastDigitCheckerTest {

    //hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
    @Test
    public void nums41and22and71ReturnsTrue() {
        assertTrue(LastDigitChecker.hasSameLastDigit(41, 22, 71));
    }

    //hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
    @Test
    public void nums23and32and42ReturnsTrue() {
        assertTrue(LastDigitChecker.hasSameLastDigit(23, 32, 42));
    }

    //hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
    @Test
    public void nums9and99and999ReturnsFalse() {
        assertFalse(LastDigitChecker.hasSameLastDigit(9, 99, 999));
    }

    //hasSameLastDigit (19, 98, 997); → should return false since 9 is not within the range of 10-1000
    @Test
    public void nums19and98and997ReturnsFalse() {
        assertFalse(LastDigitChecker.hasSameLastDigit(19, 98, 997));
    }

    @Test
    public void num9IsNotValid() {
        assertFalse(LastDigitChecker.isValid(9));
    }

    @Test
    public void num10IsValid() {
        assertTrue(LastDigitChecker.isValid(10));
    }

    @Test
    public void num1000IsValid() {
        assertTrue(LastDigitChecker.isValid(1000));
    }


    @Test
    public void num111IsValid() {
        assertTrue(LastDigitChecker.isValid(1000));
    }
}