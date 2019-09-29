package exercise27;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                count++;
                sum += num;
            } else {
                break;
            }
            scanner.nextLine();//to deal with newline
        }

        double average = (double) sum / count;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        scanner.close();
    }
}