package exercise3;

class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp;

        if (hourOfDay < 0 || hourOfDay > 23) {
            wakeUp = false;
        } else wakeUp = barking && (hourOfDay < 8 || hourOfDay > 22);

        return wakeUp;
    }
}