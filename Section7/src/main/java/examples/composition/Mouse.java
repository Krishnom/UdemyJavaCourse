package examples.composition;

public class Mouse {
    private Button rightButton;
    private int numOfButton;
    private Button leftButton;
    private Button scroll;
    private String manufacturer;


    public Mouse(String manufacturer) {
        this.manufacturer = manufacturer;
        this.scroll = new Button("Scroll");
        this.leftButton = new Button("Left");
        this.rightButton = new Button("Right");
        this.numOfButton = 3;
    }

    public void clickRight(){
        rightButton.pressButton();
    }

    public void clickLeft(){
        leftButton.pressButton();
    }

    public void scroll(){
        scroll.pressButton();
    }

    public Button getRightButton() {
        return rightButton;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumOfButton() {
        return numOfButton;
    }

    public Button getLeftButton() {
        return leftButton;
    }

    public Button getScroll() {
        return scroll;
    }
}
