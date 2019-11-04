package exercise9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestHelper {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintStream sysOut;
    private InputStream sysIn;
    private ByteArrayInputStream inputContent;

    @BeforeEach
    public void setUpStreams() {
        System.setProperty("line.separator", "\n");
        sysOut = System.out;
        sysIn = System.in;
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void revertStreams() {
        System.setOut(sysOut);
        System.setIn(sysIn);
    }

    public void assertSysout(String sysout) {
        String actualOutput = outContent.toString().strip();

        //making string platform independent. Windows use CRLF(\r\n) as line seperator while linux uses LF(\n)
        actualOutput = actualOutput.replace("\r\n","\n");
        sysout = sysout.replace("\r\n","\n");

        Assertions.assertEquals(sysout, actualOutput);
    }

    //Before running tests that depends on user input, user must have to set this
    public void setInputContent(String input) {
        //TODO: this is not working at all. Need to fix
        inputContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputContent);
    }
}
