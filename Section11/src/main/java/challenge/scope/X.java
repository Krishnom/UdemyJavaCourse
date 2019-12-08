package challenge.scope;

//Multiplier Table class
public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void printTable() {
        System.out.println("Table of " + x);
        for (int x = 1; x <= 12; x++) {
            System.out.println(this.x + "\tX\t" + x + "\t=\t" + (x * this.x));
        }
    }
}
