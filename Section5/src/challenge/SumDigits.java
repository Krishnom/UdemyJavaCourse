package challenge;

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(getDigitSum(1));
        System.out.println(getDigitSum(1987));
        System.out.println(getDigitSum(18));
        System.out.println(getDigitSum(1876543));
    }

    public static int getDigitSum(int num) {
        int sum = 0;

        if(num < 10){
            return num;
        }

        while(num > 0 ){
            sum += num % 10; //get last digit
            num /= 10; //remove last digit
        }
        return sum;
    }
}
