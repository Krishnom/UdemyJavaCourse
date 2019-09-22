package exercise6;
public class EqualSumChecker {

    public static boolean hasEqualSum(int no1, int no2, int no3)
    {
        int sum1 = no1+no2;

        if(sum1 == no3)
        {
            return true;
        }
        return false;
    }
}