package exercise18;

class SharedDigit {
    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1 < 10 || n1 > 99)
            return false;

        if (n2 < 10 || n2 > 99)
            return false;

        int digit;
        int temp;

        while (n1 > 0)//n1 = 12, temp = , n2 = 22
        {
            digit = n1 % 10; //digit = 2
            n1 /= 10; // 1
            temp = n2;

            while (temp > 0) {
                if ((temp % 10) == digit) {
                    return true;
                }
                temp /= 10;
            }
        }
        return false;
    }
}