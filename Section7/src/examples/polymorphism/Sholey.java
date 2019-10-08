package examples.polymorphism;

public class Sholey extends Movie {
    @Override
    public String getName() {
        return "Sholey";
    }

    @Override
    public void plot() {
        System.out.println("Thakur gabbar ki lega");
        System.out.println("Phir gabbar thakur ki lega");
        System.out.println("Basanti kutto ke samne nachegi aur fir Veeru mar jayega");
    }
}
