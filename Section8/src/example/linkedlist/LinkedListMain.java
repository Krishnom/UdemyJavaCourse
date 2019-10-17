package example.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListMain {
    static LinkedList<String> holidayDestinationList = new LinkedList<>();

    public static void main(String[] args) {
        addInOrder("Jodhpur");
        addInOrder("Jaipur");
        addInOrder("Kota");
        addInOrder("Udaipur");
        addInOrder("Ajmer");
        addInOrder("Bikaner");
        addInOrder("Pali");

        printHolidayDestination();
        chaloGhumne();
    }

    private static void chaloGhumne() {
        Scanner scanner = new Scanner(System.in);
        boolean chaloGhar = false;
        boolean goingForward = true;  ///  we have to track the direction. This is because in list next of previous is same element
        printChoices();
        ListIterator listIterator = holidayDestinationList.listIterator();
        while (!chaloGhar) {
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printChoices();
                    break;
                case 2:
                    if (!goingForward && listIterator.hasNext()) {
                        listIterator.next();
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Welcome to " + listIterator.next());
                    } else {
                        System.out.println("List khatam. Chale Ghar?");
                    }
                    break;
                case 3:
                    if (goingForward && listIterator.hasPrevious()) {
                        listIterator.previous();
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Welcome back to " + listIterator.previous());
                    } else {
                        System.out.println("List khatam. Chale Ghar?");
                    }
                    break;
                case 4:
                    printHolidayDestination();
                    break;
                case 5:
                    chaloGhar = true;
                    break;
            }
        }
        scanner.close();
    }

    private static void printChoices() {
        System.out.println("\n1:\tShow all options\n" +
                "2.\tNext City\n" +
                "3.\tPrevious City\n" +
                "4.\tPrint all destinations\n" +
                "5.\tChalo Ghar\n");
    }

    private static void addInOrder(String city) {
        //specifying <String> is important here otherwise you wont be able to use string functions
        ListIterator<String> listIterator = holidayDestinationList.listIterator();

        while (listIterator.hasNext()) {
            int comparision = listIterator.next().compareTo(city);
            if (comparision == 0) {
                System.out.println("City already present in list");
                return;
            } else if (comparision > 0) {
                listIterator.previous();
                listIterator.add(city);
                return;
            } else {
                //Nothing to do here as we have already moved to next element while comparing the city
            }
        }
        //If no element is lexicographically greater than the city argument. add in the last
        listIterator.add(city);
    }

    private static void printHolidayDestination() {
        Iterator<String> iterator = holidayDestinationList.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            System.out.println((i++) + ". " + iterator.next());
        }
    }
}
