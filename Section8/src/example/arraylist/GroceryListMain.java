package example.arraylist;

import java.util.Scanner;

public class GroceryListMain {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        printChoices();
        int choice;
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine(); //flush the newline char
            switch (choice) {
                case 1: //print available choices
                    printChoices();
                    break;
                case 2: //print list
                    groceryList.printGroceryItems();
                    break;
                case 3:
                    addToGroceryList();
                    break;
                case 4:
                    updateGroceryList();
                    break;
                case 5:
                    removeItemFromGroceryList();
                    break;
                case 6:
                    findItemInGroceryList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void findItemInGroceryList() {
        System.out.print("Enter item name to search: ");
        String item = scanner.nextLine();
        if (groceryList.findItem(item) != null) {
            System.out.println("Item " + item + " found in the list");
        } else {
            System.out.println("Item " + item + " not found in the list");
        }
    }

    private static void removeItemFromGroceryList() {
        System.out.print("Enter item to remove: ");
        groceryList.removeItem(scanner.nextLine());
    }

    private static void updateGroceryList() {
        System.out.print("Enter current item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter new item name: ");
        String newItem = scanner.nextLine();

        groceryList.modifyItem(itemName, newItem);
    }

    private static void addToGroceryList() {
        System.out.print("Enter item name: ");
        groceryList.addItem(scanner.nextLine());
    }

    private static void printChoices() {
        System.out.println("Grocery List\n" +
                "1.\tPrint Choices\n" +
                "2.\tPrint items in list.\n" +
                "3.\tAdd an item.\n" +
                "4.\tUpdate an item\n" +
                "5.\tRemove an item\n" +
                "6.\tFind an item in list\n" +
                "7.\tQuit.");
    }

}
