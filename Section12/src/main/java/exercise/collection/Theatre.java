package exercise.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numOfRows, int numOfSeatsPerRow) {
        this.theatreName = theatreName;
        char lastSeat = (char) ('A' + numOfRows);
        for (char row = 'A'; row < lastSeat; row++) {
            for (int i = 1; i <= numOfSeatsPerRow; i++) {
                seats.add(new Seat(row + String.format("%02d", i)));
            }
        }
        /* for (Seat seat : seats) {
            System.out.println(seat.getName());
          }
        */
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat seat = getSeat(seatNumber);
        if (seat != null) {
            return seat.reserve();
        } else {
            System.out.println("Seat " + seatNumber + " not found.");
            return false;
        }
    }


    public boolean cancelSeat(String seatNumber) {
        Seat seat = getSeat(seatNumber);
        if (seat != null) {
            return seat.cancel();
        } else {
            System.out.println("Seat " + seatNumber + " not found.");
            return false;
        }
    }

    private Seat getSeat(String seatName) {
        int foundSeat = Collections.binarySearch(seats, new Seat(seatName), null); //this will return index of seat if found
        if (foundSeat >= 0) {
            return seats.get(foundSeat);
        } else {
            return null;
        }

//        for (Seat seat : seats) {
//            if (seat.getName().equals(seatName)) {
//                return seat;
//            }
//        }
//        return null;
    }

    private static class Seat implements Comparable<Seat> {
        private String name;
        private boolean reserved = false;

        public Seat(String seatName) {
            this.name = seatName;
        }

        public String getName() {
            return name;
        }

        public boolean cancel() {
            if (reserved) {
                reserved = false;
                System.out.println("Seat " + this.name + " is successfully cancelled");
                return true;
            } else {
                return false;
            }
        }

        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println("Seat " + this.name + " is successfully reserved");
                return true;
            }
            return false;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.name.compareToIgnoreCase(seat.getName());
        }
    }
}
