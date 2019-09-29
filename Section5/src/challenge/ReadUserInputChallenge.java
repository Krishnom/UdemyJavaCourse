package challenge;

import java.util.Scanner;

class ReadUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int i = 1;
        while (i <= 10) {
            System.out.println("Enter number #" + i);
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
