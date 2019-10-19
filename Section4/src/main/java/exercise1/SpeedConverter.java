package exercise1;

class SpeedConverter {
    static final double conversionRate = 1.609;
    public static void printConversion(double kilometersPerHours) {
        if (kilometersPerHours < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHours + " km/h = " + Math.round(kilometersPerHours / conversionRate) + " mi/h");
        }
    }

    public static long toMilesPerHour(double kilometersPerHours) {
        if (kilometersPerHours < 0) {
            return -1;
        }
        return Math.round(kilometersPerHours / conversionRate);
    }
}