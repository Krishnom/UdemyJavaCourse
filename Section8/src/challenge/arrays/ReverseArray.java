package challenge.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        //Check if algo works for even digits
        System.out.println("Checking if algo works for even digits");
        System.out.println("Array actual\n" + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Array reversed\n" + Arrays.toString(array));

        System.out.println("--------------------------------------------");
        //Check if algo works for odd digits
        System.out.println("Checking if algo works for odd digits");
        System.out.println("Array actual\n" + Arrays.toString(array2));
        reverseArray(array2);
        System.out.println("Array reversed\n" + Arrays.toString(array2));
    }

    private static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - (i + 1)];
            array[length - (i + 1)] = temp;
        }
    }
}
