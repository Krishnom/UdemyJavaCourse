import java.util.Calendar;
import java.util.Scanner;

class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        boolean hasInt = scanner.hasNextInt();
        if (!hasInt){
            System.out.println("I can't handle that year. Please try again");
            scanner.close();
            return;
        }

        int birthYear = scanner.nextInt();
        scanner.nextLine();//to skip newline char

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
        //we are ditching people older than 100 and those who are yet to be born
        if (age > 0 && age < 100) {
            System.out.println(name.toUpperCase() + ", You are " + age + " year old");
        } else {
            System.out.println(name + ", I don't think you are " + age + " year old.");
            System.out.println("Are you sure you haven't entered birth year of your grandpa?");
        }
        scanner.close();
    }
}
