package SecondAndMinuteChallenge;

public class Solution {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(int minute, int seconds) {
        if (minute < 0) {
            return INVALID_VALUE_MESSAGE;
        } else if (seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int hours = minute / 60;
            minute %= 60;
            return getTimeString(hours) + "h " + getTimeString(minute) + "m " + seconds + "s";
        }
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }

    //returns value in xx format
    private static String getTimeString(int val) {
        if (val < 10) {
            return "0" + val;
        }
        return "" + val;
    }
}
