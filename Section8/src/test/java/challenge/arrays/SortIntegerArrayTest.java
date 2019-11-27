package challenge.arrays;

import org.junit.jupiter.api.Test;

import static challenge.arrays.SortIntegerArray.printArray;

public class SortIntegerArrayTest extends TestHelper {
    @Test
    public void arraySortingIsAsExpected() {
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        String expectedOutput = "[6, 5, 4, 3, 2, 1]";

        SortIntegerArray.sortArray(inputArray);
        printArray(inputArray);
        assertSysout(expectedOutput);
    }

    @Test
    public void arraySortingForAlreadySortedIsAsExpected() {
        int[] inputArray = {5, 4, 3, 2, 1};
        String expected = "[5, 4, 3, 2, 1]";
        SortIntegerArray.sortArray(inputArray);
        printArray(inputArray);
        assertSysout(expected);
    }

    @Test
    public void arraySortingForAllSameIsAsExpected() {
        int[] inputArray = {1, 1, 1, 1, 1};
        String expected = "[1, 1, 1, 1, 1]";
        SortIntegerArray.sortArray(inputArray);
        printArray(inputArray);
        assertSysout(expected);
    }
}
