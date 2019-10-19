package exercise2;

import exercise9.TestHelper;
import org.junit.jupiter.api.Test;

public class MegaBytesConverterTest extends TestHelper {

    /**
     * printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
     * printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.
     * printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"
     */
    @Test
    public void assertCorrectValuesArePrintedFor2500() {

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        assertSysout("2500 KB = 2 MB and 452 KB");
    }

    @Test
    public void assertCorrectValuesArePrintedForInvalidValue() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        assertSysout("Invalid Value");
    }

    @Test
    public void assertCorrectValuesArePrintedFor5000() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        assertSysout("5000 KB = 4 MB and 904 KB");
    }
}