package challenge.inheritance;

public class Car extends Vehicle {

    private int gears;
    private int wheels;
    private int doors;
    private boolean isManual;

    public Car(String name, String size, int gears, int wheels, int doors, boolean isManual) {
        super(name, size);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
    }

    public void changeGear(int gear) {
        this.gears = gear;
        System.out.println("Car.changeGear() Car is shifted on "+this.gears + " gear");
    }

    public void changeVelocity(int speed, int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity() Car now running at "+this.currentVelocity+ " velocity");
    }
}
