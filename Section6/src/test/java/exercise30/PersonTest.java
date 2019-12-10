package exercise30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest{

    Person person;

    @BeforeEach
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
        assertEquals(person.getFullName(), person.getFirstName());
    }

    @Test
    public void fullNameIsLastNameWhenFirstNameIsEmpty() {
        person.setFirstName("");
        assertEquals(person.getFullName(), person.getLastName());
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