package challenge.master;

public class Main {
    static int baseBurgerPrice = 100;

    public static void main(String[] args) {
        Hamburger baseHam = getClassicBurger();
        Hamburger healthyHam = getHealthyBurger();
        Hamburger deluxeHam = getDeluxeBurger();
        System.out.println("Your total price for Base Ham is :" + baseHam.getFinalPrice());
        System.out.println("Your total price for Healthy Ham is :" + healthyHam.getFinalPrice());
        System.out.println("Your total price for Deluxe Ham is :" + deluxeHam.getFinalPrice());
    }

    private static Hamburger getDeluxeBurger() {
        return new DeluxeHamburger(baseBurgerPrice,
                new Roll("HoneyOat Bread", 50),
                new Meat("Crab", 50),
                "Bills Burgers Special");
    }

    private static Hamburger getHealthyBurger() {
        HealthyHamburger healthyHam = new HealthyHamburger(baseBurgerPrice);
        healthyHam.topUp(new AddOns("Extra Cheese", 20));
        healthyHam.topUp(new AddOns("Cucumber", 5));
        healthyHam.topUp(new AddOns("Lettuce", 5));
        healthyHam.topUp(new AddOns("Olives", 5));
        healthyHam.topUp(new AddOns("Jalapeno", 5));
        healthyHam.topUp(new AddOns("Tomato", 5));
        healthyHam.topUp(new AddOns("Roasted Garlic", 5));
        return healthyHam;
    }

    private static Hamburger getClassicBurger() {
        Hamburger baseHam = new Hamburger(baseBurgerPrice, new Roll("White Bread Roll", 10),
                new Meat("Pork", 20), "Classic Burger");
        baseHam.topUp(new AddOns("Tomato", 10));
        baseHam.topUp(new AddOns("Paneer", 10));
        baseHam.topUp(new AddOns("Capsicum", 10));
        baseHam.topUp(new AddOns("Jalapeno", 10));
        baseHam.topUp(new AddOns("Olives", 10));
        return baseHam;
    }
}
