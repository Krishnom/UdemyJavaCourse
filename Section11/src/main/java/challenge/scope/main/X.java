package challenge.scope.main;

import java.util.Scanner;

public class X {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number : ");
        challenge.scope.X x = new challenge.scope.X(X.x.nextInt());
        x.printTable();
    }
}
