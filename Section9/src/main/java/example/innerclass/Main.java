package example.innerclass;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Button button = new Button("Print");

    public static void main(String[] args) {
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " button clicked");
            }
        });

        start();
    }

    private static void start() {
        boolean quit = false;
        System.out.println("1. Click button\n2. Quit");
        while (!quit) {
            System.out.print("Enter Choice: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    button.onClick();
                    break;
                case 2:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
