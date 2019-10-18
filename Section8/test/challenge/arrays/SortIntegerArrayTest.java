package challenge.arrays;


import common.TestHelper;
import org.junit.Test;

import static challenge.arrays.SortIntegerArray.printArray;

public class SortIntegerArrayTest extends TestHelper {
    @Test
    public void arraySortingIsAsExpected() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] sortedInputArray = {5, 4, 3, 2, 1};

        SortIntegerArray.sortArray(inputArray);
        printArray(inputArray);
        assertSysout("5\r\n4\r\n3\r\n2\r\n1");
    }

    @Test
    public void arraySortingForAlreadySortedIsAsExpected() {
        int[] inputArray = {5, 4, 3, 2, 1};
        String expected = "5\r\n4\r\n3\r\n2\r\n1";
        SortIntegerArray.sortArray(inputArray);
        printArray(inputArray);
        assertSysout(expected);
    }

    @Test
    public void arraySortingForAllSameIsAsExpected() {
        int[] inputArray = {1, 1, 1, 1, 1};
        String expected = "1\r\n1\r\n1\r\n1\r\n1";
        SortIntegerArray.sortArray(inputArray);
        printArray(inputArray);
        assertSysout(expected);
    }
}