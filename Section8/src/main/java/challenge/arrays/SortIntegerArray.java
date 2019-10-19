package challenge.arrays;

import java.util.Scanner;

public class SortIntegerArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegerArray(5);

        printArray(array);
        sortArray(array);
        System.out.println("Sorted array");
        printArray(array);
    }

    //using selection sort
    static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < (array.length - 1); i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    private static int[] getIntegerArray(int length) {
        int[] userInputArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter integer number " + (i + 1) + "\n");
            userInputArray[i] = scanner.nextInt();
        }
        return userInputArray;
    }
}
