package exercise20;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2)
    {
        if(num1 < 10 || num2 < 10)
        {    
            return -1;
        }
        
        //case where the min number itself can be GDC
        if(num1 % num2 == 0) return num2;
        if(num2 % num1 == 0) return num1;
        
        int min = num1 < num2 ? num1: num2;
        int gcd = 1;
        
        for(int i = 2; i <= min /2; i++)
        {
            if((num1 % i == 0) && (num2 % i == 0)) 
            {
                gcd = i;
            }
        }
        
        return gcd;
    }
}