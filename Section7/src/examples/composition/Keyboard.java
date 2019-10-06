package examples.composition;

public class Keyboard {
    private int noOfButtons;
    private String manufacturer;

    public Keyboard(int noOfButtons, String manufacturer) {
        this.noOfButtons = noOfButtons;
        this.manufacturer = manufacturer;
    }

    public int getNoOfButtons() {
        return noOfButtons;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
