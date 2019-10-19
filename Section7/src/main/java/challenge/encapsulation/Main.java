package challenge.encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(false, 170);
        Printer printerDuplex = new Printer(true, 170);
        printer.printPage(17);
        printer.printPage(200);

        printer.refillToner(30);
        printer.printPage(1);
        printer.printPage(100);


        System.out.println("=====================================================\n\n\n");
        printerDuplex.printPage(17);
        printerDuplex.printPage(200);

        printerDuplex.refillToner(30);
        printerDuplex.printPage(1);
        printerDuplex.printPage(100);
    }
}
