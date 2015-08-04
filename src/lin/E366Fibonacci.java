package lin;

/**
 * Created by Paul on 8/2/15.
 */
//Fibonacci
//
//        32% Accepted
//        Find the Nth number in Fibonacci sequence.
//
//        A Fibonacci sequence is defined as follow:
//
//        The first two numbers are 0 and 1.
//        The i th number is the sum of i-1 th number and i-2 th number.
//        The first ten numbers in Fibonacci sequence is:
//
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 1, return 0
//
//        Given 2, return 1
//
//        Given 10, return 34
//
//        Note
//        The Nth fibonacci number won't exceed the max value of signed 32-bit integer in the test cases.
//
//        Tags Expand
public class E366Fibonacci {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if(n == 0 ) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int x = 0; int y = 1;
        int returnValue = 0;
        for(int i = 2; 1 <= n; i++) {
            returnValue = x + y;
            x = y;
            y = returnValue;
        }

        return returnValue;
    }
}
