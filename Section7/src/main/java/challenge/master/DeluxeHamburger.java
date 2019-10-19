package challenge.master;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(int basePrice, Roll roll, Meat meat, String name) {
        super(basePrice, roll, meat, name);
        topUp(new AddOns("Chips", 20));
        topUp(new AddOns("Drinks", 20));
        this.maxAddOns = 0;
    }
}
