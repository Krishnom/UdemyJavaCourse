package exercise9;

class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60L;
            long days = hours / 24L;  //Lets count total no of days
            long years = days / 365L;
            long remainingDays = days % 365L;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

}
