package exercise.collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TheatreTest {
    private Theatre theatre;

    @BeforeEach
    public void setup() {
        theatre = new Theatre("Dummy", 10, 10);
    }

    @Test
    public void seatReservationSuccessfulWhenSeatIsUnreserved() throws Exception {
        assertTrue(theatre.reserveSeat("A01"));
    }


    @Test
    public void seatReservationFailsWhenASeatIsReserved() throws Exception {
        theatre.reserveSeat("A01");
        assertFalse(theatre.reserveSeat("A01"));
    }


    @Test
    public void seatReservationFailsWhenSeatNumberIsInvalid() throws Exception {
        assertFalse(theatre.reserveSeat("A#1"));
    }

    @Test
    public void seatCancellationSuccessfulWhenSeatIsReserved() throws Exception {
        theatre.reserveSeat("A01");
        assertTrue(theatre.cancelSeat("A01"));
    }


    @Test
    public void seatCancellationFailsWhenASeatIsUnReserved() throws Exception {
        assertFalse(theatre.cancelSeat("A01"));
    }


    @Test
    public void seatCancellationFailsWhenSeatNumberIsInvalid() throws Exception {
        assertFalse(theatre.cancelSeat("A#1"));
    }

}