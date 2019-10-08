package challenge.composition;

import examples.composition.Dimension;


public class Main {
    public static void main(String[] args) {
        Door door = new Door(new Dimension(10, 10, 1), "White", new Lock("Chickdoor", 10));
        Wall walls = new Wall(new Dimension(10, 10, 20), "Purple");
        Furniture furniture = new Furniture("Queen Size Bed", "Sangwan Wood", "Jet Black");
        Fan fan = new Fan("Hevells", 20, 8);
        Light light = new Light(1);
        Room bedroom = new Room(door, walls, furniture, fan, light, "Bedroom");
        bedroom.unlock();
    }
}
