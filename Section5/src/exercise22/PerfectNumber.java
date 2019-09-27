package exercise22;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int divisorSum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divisorSum += i;
            }
        }

        if (divisorSum == num) {
            return true;
        } else {
            return false;
        }
    }
}