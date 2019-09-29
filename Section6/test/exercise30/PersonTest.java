package exercise30;

import common.ParameterizedTestHelper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest{

    Person person;

    @Before
    public void init() {
        person = new Person();
        person.setAge(30);
        person.setFirstName("Om");
        person.setLastName("Paliwal");
    }

    @Test
    public void personWithAge12isNotTeen() {
        person.setAge(12);
        assertFalse(person.isTeen());
    }

    @Test
    public void personWithAge20isNotTeen() {
        person.setAge(20);
        assertFalse(person.isTeen());
    }

    @Test
    public void personWithAge18isTeen() {
        person.setAge(18);
        assertTrue(person.isTeen());
    }

    @Test
    public void fullNameIsFirstNameWhenLastNameIsEmpty() {
        person.setLastName("");
        assertTrue(person.getFullName().equals(person.getFirstName()));
    }

    @Test
    public void fullNameIsLastNameWhenFirstNameIsEmpty() {
        person.setFirstName("");
        assertTrue(person.getFullName().equals(person.getLastName()));
    }

    @Test
    public void fullNameIsEmptyWhenBothAreEmpty() {
        person.setFirstName("");
        person.setLastName("");
        assertTrue(person.getFullName().isBlank());//Blank considers whitespace also as empty
    }

    @Test
    public void defaultAgeForInvalidAgesIs0() {
        person.setAge(-5);
        assertEquals(0, person.getAge());
        person.setAge(101);
        assertEquals(0, person.getAge());
    }
}