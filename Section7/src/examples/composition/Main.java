package examples.composition;

public class Main {

    public static void main(String[] args) {
        Case thisCase = new Case(new Dimension(20,20,5), "Zebronix",240);
        Motherboard motherboard = new Motherboard(4,4,"Asus", "Xtreme", "Windows NT");
        Mouse mouse = new Mouse("Asus");
        Keyboard keyboard = new Keyboard(108, "Asus");

        Monitor monitor = new Monitor("UltraHD", "Dell", new Resolution(3840,2160), 32);
        PC myPC = new PC(motherboard,thisCase, mouse, keyboard, monitor);

        myPC.powerOn();

    }
}
