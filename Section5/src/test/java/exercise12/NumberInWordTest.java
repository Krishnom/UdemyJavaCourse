package exercise12;


import exercise21.TestHelper;
import org.junit.jupiter.api.Test;
public class NumberInWordTest extends TestHelper {

    @Test
    public void printOneFor1() {
        NumberInWord.printNumberInWord(1);
        assertSysout("ONE");
    }

    @Test
    public void printOtherFor20() {
        NumberInWord.printNumberInWord(20);
        assertSysout("OTHER");
    }

    @Test
    public void printOtherForNegative1() {
        NumberInWord.printNumberInWord(-1);
        assertSysout("OTHER");
    }
}