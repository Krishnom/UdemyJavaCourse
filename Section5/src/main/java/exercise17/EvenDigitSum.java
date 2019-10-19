package exercise17;

class EvenDigitSum {
    
    public static int getEvenDigitSum(int num)
    {
        if (num < 0)
            return -1;
        
        int sum = 0;
        int digit;
        while(num > 0) //num = 1, sum = 2
        {
            digit = num % 10; //1
            num /= 10; //0
            
            if(digit % 2 == 0) // true
                sum += digit; //2
        }
        
        return sum;
                
    }
    
}