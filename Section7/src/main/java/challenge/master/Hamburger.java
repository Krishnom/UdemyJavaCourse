package challenge.master;

public class Hamburger {
    protected int maxAddOns = 4;
    AddOns[] extras;
    private int basePrice;
    private int finalPrice;
    private Roll roll;
    private Meat meat;
    private String name;
    private int addOnCounts;

    public Hamburger(int basePrice, Roll roll, Meat meat, String name) {
        this.basePrice = basePrice;
        this.roll = roll;
        this.meat = meat;
        this.finalPrice = basePrice + roll.getPrice() + meat.getPrice();
        this.name = name;
        addOnCounts = 0;
        extras = new AddOns[maxAddOns];
    }

    public int topUp(AddOns addOn) {
        if (addOnCounts == maxAddOns) {
            System.out.println("Cannot add more than " + maxAddOns + " addon in " + getClass().getSimpleName());
            return -1;
        }

        extras[addOnCounts] = addOn;
        addOnCounts++;
        addToFinalPrice(addOn);
        return addOnCounts;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    void addToFinalPrice(AddOns extra) {
        finalPrice += extra.getPrice();
    }

    public AddOns[] getExtras() {
        return extras;
    }
}
