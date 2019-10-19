package challenge.inheritance;

public class Ferrari extends Car {
    private int roadServiceMonths;

    public Ferrari(int roadServiceMonths) {
        super("Ferrari", "4WD", 5, 4, 2, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity <= 0) {
            stop();
            changeGear(0);
        } else if (newVelocity > 0 && newVelocity < 10) {
            changeGear(1);
        } else if (newVelocity >= 10 && newVelocity < 30) {
            changeGear(2);
        } else if (newVelocity >= 30 && newVelocity < 60) {
            changeGear(3);
        } else if (newVelocity > 60 && newVelocity < 90) {
            changeGear(4);
        } else if (newVelocity >= 90) {
            changeGear(5);
        }

        if (newVelocity >= 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
