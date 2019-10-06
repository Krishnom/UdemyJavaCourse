package exercise36;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuboidTest {

    @Test
    public void areaOfRectangleWithWidth10AndLength10Is100() {
        Rectangle rectangle = new Rectangle(10,10);
        assertEquals(100.0, rectangle.getArea(),0.0);
    }

    @Test
    public void volumeOfCuboidWithWidth10Length10AndHeight10Is1000() {
        Cuboid cuboid = new Cuboid(10.0,10.0,10.0);
        assertEquals(1000.0, cuboid.getVolume(),0.0);
    }

    @Test public void zeroValueIsSetForInvalidValues(){
        Cuboid cuboid = new Cuboid(-1.0,-1.0,-1.0);

        assertEquals(0.0, cuboid.getHeight(), 0.0);
        assertEquals(0.0, cuboid.getLength(), 0.0);
        assertEquals(0.0, cuboid.getWidth(), 0.0);
    }

    @Test public void assertHeightIsSetCorrectly(){
        Cuboid cuboid = new Cuboid(1.0,1.0,1.0);

        assertEquals(1.0, cuboid.getHeight(), 0.0);
    }
}