package challenge.polymorphism;

public class Scorpio extends Car {
    public Scorpio(int cylinders, String model, String engine) {
        super(cylinders, "Mahindra Scorpio");
        this.model = model;
        this.engine = engine;
    }


    @Override
    public void startEngine() {
        System.out.println(getFullName() + " -> Starting engine");
    }

    @Override
    public void brake() {
        System.out.println(getFullName() + " -> Applying break");
    }
}
