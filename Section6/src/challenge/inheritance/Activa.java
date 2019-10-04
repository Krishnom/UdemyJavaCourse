package challenge.inheritance;

public class Activa extends Scooty {

    public Activa(String name, String size) {
        super(name, size);
    }

    public void startEngine() {
        System.out.println("Starting Activa");
    }

    public void stopEngine() {
        System.out.println("Stopping Activa");
    }
}
