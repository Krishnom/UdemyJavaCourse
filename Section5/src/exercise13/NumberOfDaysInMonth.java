package exercise13;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (isaValidYear(year))
            return false;

        if (year % 4 == 0 && (year % 100 != 0))
            return true;
        else if (year % 4 != 0) return false;
        else if (year % 100 == 0 && year % 400 == 0)
            return true;
        else return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12)
            return -1;
        if (isaValidYear(year))
            return -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }

    private static boolean isaValidYear(int year) {
        return year < 1 || year > 9999;
    }
}