package challenge.arrays;

import common.TestHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //when findMinWorks test runs first the readInput test hangs
public class MinElementTest extends TestHelper {

    @Test
    public void checkReadInputsWorks() {
        String input = "1\r\n2\r\n3\r\n4\r\n";
        setInputContent(input);
        int array[] = MinElement.readInteger(4);
        assertEquals(1, MinElement.findMin(array));
    }

    @Test
    public void findMinWorksForAllInteger() {
        int array[] = {1, -1, 0, 1212};
        assertEquals(-1, MinElement.findMin(array));
    }
}