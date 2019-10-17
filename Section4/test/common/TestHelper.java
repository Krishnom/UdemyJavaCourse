package common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.*;

import static org.junit.Assert.assertEquals;

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
        setInputContent("");
        System.setIn(inputContent);
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
        this.inputContent = new ByteArrayInputStream(input.getBytes());
    }

    //Before running tests that depends on user input, user must have to set this
    @SuppressWarnings("EmptyMethod")
    public void setInputContent() {
        //TODO: enable setting input from file
    }
}
