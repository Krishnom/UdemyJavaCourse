package challenge.composition;

public class Fan {
    private String brand;
    private int power;
    private int fins;
    private boolean isRunning;

    public Fan(String brand, int power, int fins) {
        this.brand = brand;
        this.power = power;
        this.fins = fins;
        isRunning = false;
    }

    public void spin() {
        System.out.println("Fan is Spinning");
    }

    public void start() {
        spin();
    }

    public void turnOff() {
        isRunning = false;
        System.out.println("Fan stopped");
    }
}
