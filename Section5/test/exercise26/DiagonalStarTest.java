package exercise26;

import common.TestHelper;
import org.junit.Test;

public class DiagonalStarTest extends TestHelper {
    String star8 = "********\r\n" +
            "**    **\r\n" +
            "* *  * *\r\n" +
            "*  **  *\r\n" +
            "*  **  *\r\n" +
            "* *  * *\r\n" +
            "**    **\r\n" +
            "********";

    String star5 = "*****\r\n" +
            "** **\r\n" +
            "* * *\r\n" +
            "** **\r\n" +
            "*****";
    @Test public void printSquareStar8(){
        DiagonalStar.printSquareStar(8);
        assertSysout(star8);
    }
    @Test public void printSquareStar5(){
        DiagonalStar.printSquareStar(5);
        assertSysout(star5);
    }

}