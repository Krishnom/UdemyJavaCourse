package exercise14;

class SumOddRange {

    private static boolean isOdd(int number)
    {
        if(number < 0) return false;
        return number % 2 != 0;
    }
    
    public static int sumOdd(int start, int end)
    {
        if(start > end || start < 0)
        {
            return -1;
        }
        
        int sumOfOddNumbers = 0;
        
        /*if(start % 2 == 0) {
            for(int i = start+1; i <= end; i += 2)
                sumOfOddNumbers += i;
        } else{
               for(int i = start; i <= end; i += 2)
                sumOfOddNumbers += i;
        }
        */
        
        for(int i = start; i <= end; i++)
        {
            if(isOdd(i)) sumOfOddNumbers += i;
        }
        
        return sumOfOddNumbers;
    }
}