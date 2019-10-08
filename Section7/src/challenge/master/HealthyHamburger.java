package challenge.master;

public class HealthyHamburger extends Hamburger {
    public HealthyHamburger(int basePrice) {
        super(basePrice, new Roll("Multigrain Roll", 50), new Meat("Salmon", 90), "Healthy Hamburger");
        this.maxAddOns = 6;
        this.extras = new AddOns[maxAddOns];
    }
}
