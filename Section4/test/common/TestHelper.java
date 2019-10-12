package common;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestHelper {
    private PrintStream sysOut;
    private InputStream sysIn;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayInputStream inputContent;

    @Before
    public void setUpStreams() {
        sysOut = System.out;
        sysIn = System.in;
        System.setOut(new PrintStream(outContent));
    }

    @After
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
