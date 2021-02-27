package exercise.collection;

public class TheatreMain {
    public static void main(String[] args) throws Exception {
        Theatre theatre = new Theatre("Kalptaru", 10, 12);

        System.out.println("Welcome to " + theatre.getTheatreName());

        theatre.reserveSeat("A10");
        theatre.reserveSeat("A02");
        theatre.reserveSeat("H12");
        theatre.reserveSeat("J12");
        theatre.reserveSeat("K-12"); //Invalid seat

        theatre.cancelSeat("A10");
        //try to cancel seat that is not reserved
        if (!theatre.cancelSeat("A11")) {
            System.out.println("Seat Cancellation failed. Possibly because seat is already reserved");
        }
    }
}
