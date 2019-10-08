package examples.polymorphism;

public class DDLJ extends Movie {
    @Override
    public String getName() {
        return "Dil Wale Dulahniya Lejayenge";
    }

    @Override
    public void plot() {
        System.out.println("Raj ne Simaran se kiya pyar. Uspe khadoos \"Mogambo\" ka eitraaj");
    }
}
