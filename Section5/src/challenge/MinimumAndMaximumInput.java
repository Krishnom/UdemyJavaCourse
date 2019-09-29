package challenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAndMaximumInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        scanner.close();
    }
}
