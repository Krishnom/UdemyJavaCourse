package exercise22;

class PerfectNumber {
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

        return divisorSum == num;
    }
}