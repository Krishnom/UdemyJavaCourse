package challenge.polymorphism;

public class WaggonR extends Car {
    public WaggonR(int cylinders) {
        super(cylinders, "Maruti Waggon R");
        this.model = "LX";
        this.engine = "Hybrid";
    }


    @Override
    public void accelerate() {
        System.out.println(getFullName() + " -> accelerate");
    }

    @Override
    public void brake() {
        System.out.println(getFullName() + " -> apply break");
    }
}
