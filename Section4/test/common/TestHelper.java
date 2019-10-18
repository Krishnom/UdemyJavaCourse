package common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelper {
    private PrintStream sysOut;
    private InputStream sysIn;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayInputStream inputContent;

    @BeforeEach
    public void setUpStreams() {
        sysOut = System.out;
        sysIn = System.in;
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void revertStreams() {
        System.setOut(sysOut);
        System.setIn(sysIn);
    }

    protected void assertSysout(String sysout) {
        assertEquals(sysout, outContent.toString().strip());
    }

    //Before running tests that depends on user input, user must have to set this
    protected void setInputContent(String input) {
        //TODO: this is not working at all. Need to fix
        inputContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputContent);
    }
}
