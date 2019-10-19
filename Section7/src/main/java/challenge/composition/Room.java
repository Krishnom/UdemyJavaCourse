package challenge.composition;

public class Room {
    private Door door;
    private Wall walls;
    private Furniture furniture;
    private Fan fan;
    private Light light;
    private String name;

    public Room(Door door, Wall walls, Furniture furniture, Fan fan, Light light, String name) {
        this.door = door;
        this.walls = walls;
        this.furniture = furniture;
        this.fan = fan;
        this.light = light;
        this.name = name;
    }

    public void unlock() {
        door.unlock();
        System.out.println("You are in " + name);
        light.increaseBrightness(6);
        fan.spin();
    }
}
