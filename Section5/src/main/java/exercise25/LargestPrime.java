package exercise25;

class LargestPrime {

    public static int getLargestPrime(int num) {
        //no prime factor for 1, 0 and negative numbers
        if (num < 2) {
            return -1;
        }

        int largestPrime = 2; // 1 is not considered as prime. First prime no is 2
        boolean iAmPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            //from i=2 to i = num/2;i++
            //if divides then check if it is a prime
            //   prime no is that which is not divisible by any number other than 1 and itself
            //   for that from j=2 to i = j/2; i++
            //      set isprime flag to false if any of the number divides
            //                                 else set largestPrime = i;
            if (num % i == 0) {
                iAmPrime = false;
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                //if i is prime then update largestPrime
                largestPrime = (isPrime ? i : largestPrime);
            }
        }

        //check if number itself is prime
        if (iAmPrime) {
            largestPrime = num;
        }
        return largestPrime;
    }
}