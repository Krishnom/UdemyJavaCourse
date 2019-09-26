package exercise15;

public class NumberPalindrome {

    public static boolean isPalindrome(int number)
    {
        boolean isPalindrome = false;
        
        int reverseOfNumber = 0;
        int numToCompare = number;
        
        while(numToCompare != 0) 
        {
            reverseOfNumber *= 10;
            int lastDigit = numToCompare % 10;
            reverseOfNumber += lastDigit;
            numToCompare /= 10;
        }
        
        if(number == reverseOfNumber)
        {
            isPalindrome = true;   
        }
        
        return isPalindrome;
    }

}