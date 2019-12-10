package challenge.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MinElementTest extends TestHelper {

    @Test
    public void checkReadInputsWorks() {
        String input = "1\r\n2\r\n3\r\n4\r\n";
        setInputContent(input);
        int[] array = MinElement.readInteger(4);
        assertEquals(1, MinElement.findMin(array));
    }

    @Test
    public void findMinWorksForAllInteger() {
        int[] array = {1, -1, 0, 1212};
        assertEquals(-1, MinElement.findMin(array));
    }
}