package challenge.polymorphism;

public class Car {
    protected String engine;
    String model;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        wheels = 4;
        engine = "Default";
        model = "Default";
    }

    public String getFullName() {
        return name + " " + model + " " + engine;
    }

    public void startEngine() {
        System.out.println(getFullName() + " -> startEngine");
    }

    public void accelerate() {
        System.out.println(getFullName() + " -> accelerate");
    }

    public void brake() {
        System.out.println(getFullName() + " -> apply break");
    }
}


