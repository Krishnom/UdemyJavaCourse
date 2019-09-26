package exercise13;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDaysInMonthTest {

    @Test
    public void year2000IsALeapYear() {
        assertTrue(NumberOfDaysInMonth.isLeapYear(2000));
    }

    @Test
    public void year1700IsNotALeapYear() {
        assertFalse(NumberOfDaysInMonth.isLeapYear(1700));
    }

    @Test
    public void yearNegative1IsNotAValidYear() {
        assertFalse(NumberOfDaysInMonth.isLeapYear(-1));
    }

    @Test
    public void jan2000Has31Days() {
        assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 2000));
    }

    @Test
    public void feb2000Has29Days() {
        assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 2000));
    }


    @Test
    public void feb1700Has28Days() {
        assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 1700));
    }

    @Test
    public void feb1701Has28Days() {
        assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 1701));
    }

    @Test
    public void april1701Has30Days() {
        assertEquals(30, NumberOfDaysInMonth.getDaysInMonth(4, 1701));
    }
}