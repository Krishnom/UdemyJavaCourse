package examples.composition;

public class Case {
    private Dimension dimension;
    private String manufacturer;
    private int power;

    public Case(Dimension dimension, String manufacturer, int power) {
        this.dimension = dimension;
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
