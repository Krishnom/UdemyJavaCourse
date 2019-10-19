package challenge.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = getRandomCar();

        car.startEngine();
        car.accelerate();
        car.brake();
    }

    private static Car getRandomCar() {
        int randomNum = (int) (Math.random() * 3 + 1); // we have only 3 cars
        System.out.println("Random car # " + randomNum);
        switch (randomNum) {
            case 1:
                return new Car(4, "Car");
            case 2:
                return new Scorpio(6, "SUV", "Automatic");
            case 3:
                return new WaggonR(4);
            default:
                return null;
        }
    }
}
