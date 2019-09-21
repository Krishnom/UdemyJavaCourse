package excercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    /**
     * shouldWakeUp (true, 1); → should return true
     * shouldWakeUp (false, 2); → should return false since the dog is not barking.
     * shouldWakeUp (true, 8); → should return false, since it's not before 8.
     * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
     */
    @Test
    void shouldWakeUpAt1WhenDogIsBarking() {
        assertTrue(BarkingDog.shouldWakeUp(true,1));
    }

    @Test
    void shouldNotWakeUpAt2WhenDogIsNotBarking() {
        assertFalse(BarkingDog.shouldWakeUp(false,2));
    }


    @Test
    void shouldNotWakeUpAt8SinceItsTimeToSleep() {
        assertFalse(BarkingDog.shouldWakeUp(true,8));
    }


    @Test
    void shouldNotWakeUpForInvalidHours() {
        assertFalse(BarkingDog.shouldWakeUp(true,8));
    }
}