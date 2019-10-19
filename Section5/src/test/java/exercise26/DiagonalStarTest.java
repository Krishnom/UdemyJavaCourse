package exercise26;

import exercise21.TestHelper;
import org.junit.jupiter.api.Test;

public class DiagonalStarTest extends TestHelper {

    @Test public void printSquareStar8(){
        DiagonalStar.printSquareStar(8);
        String star8 = "********\r\n" +
                "**    **\r\n" +
                "* *  * *\r\n" +
                "*  **  *\r\n" +
                "*  **  *\r\n" +
                "* *  * *\r\n" +
                "**    **\r\n" +
                "********";
        assertSysout(star8);
    }
    @Test public void printSquareStar5(){
        DiagonalStar.printSquareStar(5);
        String star5 = "*****\r\n" +
                "** **\r\n" +
                "* * *\r\n" +
                "** **\r\n" +
                "*****";
        assertSysout(star5);
    }

}