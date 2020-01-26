import challenge.packages.Series;

public class Main {
    public static void main(String[] args) {
        int[] series = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Print nth sum
        System.out.println("----------------Sum Series-------------------------");
        for (int i : series) {
            System.out.println("Sum of first " + i + " numbers is " + Series.nSum(i));
        }
        System.out.println("------------------------------------------------");


        //Print nth sum
        System.out.println("----------------Factorial series-------------------------");
        for (int i : series) {
            System.out.println("Factorial(" + i + ") : " + Series.factorial(i));
        }
        System.out.println("------------------------------------------------");

        //Print fibonacci series
        System.out.println("----------------Fibonacci Series-------------------------");
        for (int i : series) {
            System.out.println("Fibonacci(" + i + ") : " + Series.fibonacci(i));
        }
        System.out.println("------------------------------------------------");

    }
}
