package challenge;

public class Sum3And5Challenge {

    public static void main(String[] args) {
        int sumOfAllNums = 0;
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sumOfAllNums += i;
                System.out.println("Num Divisible by 3 and 5 both = " + i);
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("Sum of first 5 number divisble by 3 and 5 both is " + sumOfAllNums);
    }


}
