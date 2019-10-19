package challenge.composition;

import examples.composition.Dimension;

public class Wall {
    Dimension dimension;
    String color;

    public Wall(Dimension dimension, String color) {
        this.dimension = dimension;
        this.color = color;
    }

    public void paintWall(String color) {
        this.color = color;
        System.out.println("Applying " + color + " color to wall");
    }
}
