package exercise16;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int firstDigit;
        int lastDigit = number % 10;
        number /= 10;

        if (number == 0) {
            firstDigit = lastDigit;
            return firstDigit + lastDigit;
        } else {

            while ((number / 10) != 0) {
                number /= 10;
            }

            firstDigit = number;

        }

        return firstDigit + lastDigit;

    }
}