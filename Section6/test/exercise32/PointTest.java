package exercise32;

import common.TestHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest extends TestHelper {

//    @Test public void setPostiveValueWhenXIsNegative(){
//        Point p = new Point(-1,1);
//
//        assertEquals(1,p.getX());
//    }
//
//
//    @Test public void setPostiveValueWhenYIsNegative(){
//        Point p = new Point(1,-1);
//
//        assertEquals(1,p.getY());
//    }
    @Test
    public void distanceBetween2And2isSqrtOf4() {
        Point p = new Point(2, 2);
        assertEquals(Math.sqrt(8), p.distance(), 0.0);
    }

    @Test
    public void distanceBetween2And2Against2And2IsZero() {
        Point p = new Point(2, 2);
        assertEquals(0, p.distance(2, 2), 0.0);
    }

    @Test
    public void distanceBetween2And2Against3And3IsZero() {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(3, 3);
        assertEquals(Math.sqrt(2), p1.distance(p2), 0.0);
    }
}