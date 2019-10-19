package examples.polymorphism;

public class Baazigar extends Movie {
    @Override
    public String getName() {
        return "Baazigar";
    }

    @Override
    public void plot() {
        System.out.println("Sharma ji ne Chopada ko apna business kho diya aur dukh me khudkhusi kar li\n " +
                "Sharma ji ke bete(Ajay) ne usaka badala lene kee kasam li.\n " +
                "Pehle madan ki beti seema ko pataya aur murder kar diya.\n" +
                " Fir uski behan(priya) ko pataya.\n" +
                "Kya Ajay apne baap ka badla Chopda se lene mein kamiyab hoga ?\n\n Janane k liye dekkhe " + getName());
    }
}
