package lin.M9_20150813;

/**
 * Created by Paul on 8/12/15.
 * http://www.lintcode.com/en/problem/divide-two-integers/
 */
//Divide Two Integers
//
//        16% Accepted
//        Divide two integers without using multiplication, division and mod operator.
//
//        If it is overflow, return 2147483647
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given dividend = 100 and divisor = 9, return 11.
public class M414DivideTwoIntegers {
    /**
     * @param dividend the dividend
     * @param divisor the divisor
     * @return the result
     */
    public int divide(int dividend, int divisor) {
        // Write your code here
        if (dividend == 0 || divisor == 0) {
            return 0;
        }
        boolean isNeg = (dividend > 0 && divisor < 0)
                || (dividend < 0 && divisor > 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        if (b > a) {
            return 0;
        }

        long sum = 0;
        long pow = 0;
        int result = 0;
        while (a >= b) {
            pow = 1;
            sum = b;
            while (sum + sum <= a) {
                sum += sum;
                pow += pow;
            }
            a -= sum;
            result += pow;
        }
        return isNeg ? -result : result;
    }
}
