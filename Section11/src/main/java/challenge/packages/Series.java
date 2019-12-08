package challenge.packages;

public class Series {

    /**
     * Sum of first n natural numbers
     *
     * @param n
     * @return
     */
    public static long nSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            //thanks to https://www.math-only-math.com/sum-of-first-n-natural-numbers.html
            return ((n + 1) * n) / 2;
        }
    }

    /**
     * get factorial of n  numbers
     *
     * @param n
     * @return
     */
    public static long factorial(int n) {

        if (n <= 0) {
            return -1;
        } else if (n == 1) {
            return 1;
        } else {
            //thanks to https://probabilityformula.org/factorial.html
            return n * factorial(n - 1);
        }
    }

    /**
     * Returns nth fibonacci number (starting from 0)
     *
     * @param n any non negative integer
     * @return
     */
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
