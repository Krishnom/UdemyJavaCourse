package challenge.arrays;

import java.util.Scanner;

public class MinElement {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("Enter num of integer to process ");
        count = scanner.nextInt();
        int[] array = readInteger(count);
        System.out.println("Minimum number is " + findMin(array));
    }

    static int[] readInteger(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " Integer number.");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + (array.length - i) + "] more to go:");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
