package exercise31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WallTest {

    //area is zero for width and height set to 0
    @Test
    public void areaIs0WhenWidthAndHeightIsZero() {
        Wall wall = new Wall(0, 0);
        assertEquals(0.0, wall.getArea(), 0.0);
    }

    @Test
    public void areaIs0WhenWidthIsNegative() {
        Wall wall = new Wall(-1, 10);
        assertEquals(0.0, wall.getArea(), 0.0);
    }

    @Test
    public void areaIs0WhenHeightIsNegative() {
        Wall wall = new Wall(10, -1);
        assertEquals(0.0, wall.getArea(), 0.0);
    }

    @Test
    public void areaIs_121_When_WidthIs_11_and_HeightIs_11() {
        Wall wall = new Wall(11.0, 11.0);
        assertEquals(121.0, wall.getArea(), 0.0);
    }

    @Test
    public void defaultAreaIsZero() {
        Wall wall = new Wall();
        assertEquals(0.0, wall.getArea(), 0.0);
    }
}