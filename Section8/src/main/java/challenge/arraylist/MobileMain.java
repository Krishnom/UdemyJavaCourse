package challenge.arraylist;

import java.util.Scanner;

public class MobileMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Mobile mobile = new Mobile("Krishnom", "+91-4444555566");

    public static void main(String[] args) {
        printUsage();
        boolean quit = false;
        while (!quit) {
            System.out.print("Enter a Choice: ");
            int option = scanner.nextInt();
            scanner.nextLine(); //flush CRLF
            switch (option) {
                case 1:
                    printUsage();
                    break;
                case 2:
                    mobile.printAllContacts();
                    break;
                case 3:
                    createNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    searchContact();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    private static void searchContact() {
        System.out.print("Enter contact name to search: ");
        String name = scanner.nextLine();
        System.out.println(mobile.getContact(name));
    }

    private static void removeContact() {
        System.out.print("Enter contact name to remove: ");
        String name = scanner.nextLine();
        mobile.removeContact(name);
    }

    private static void updateContact() {
        System.out.print("Enter current contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new contact name : ");
        String newName = scanner.nextLine();
        mobile.modifyContact(name, newName);
    }

    private static void createNewContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phone = scanner.nextLine();
        mobile.addContact(new Contact(name, phone));
    }

    private static void printUsage() {
        System.out.println("Mobile Phone Directory\n" +
                "1.\tPrint Choices\n" +
                "2.\tPrint all contacts.\n" +
                "3.\tStore contact.\n" +
                "4.\tUpdate a contact\n" +
                "5.\tRemove a contact\n" +
                "6.\tFind a contact with name\n" +
                "7.\tQuit.");
    }
}
