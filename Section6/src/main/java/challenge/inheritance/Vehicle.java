package challenge.inheritance;

public class Vehicle {
    int currentVelocity;
    int currentDirection;
    String name;
    String size;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move() is moving in " + this.currentDirection + " with " + this.currentVelocity + " Speed");
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer() Steering at " + this.currentDirection + " degree");
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void stop() {
        this.currentVelocity = 0;
        System.out.println("Vehicle.stop() Vehicle stopped");
    }
}
