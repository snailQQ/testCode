package lin.M9_20150813;

/**
 * Created by Paul on 8/12/15.
 * http://www.lintcode.com/en/problem/fast-power/
 */
//Fast Power
//
//        18% Accepted
//        Calculate the a^n % b where a, b and n are all 32bit integers.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For 2^31 % 3 = 2
//
//        For 100^1000 % 1000 = 0
//
//        Challenge
//        O(logn)
public class M140FastPower {
    /*
 * @param a, b, n: 32bit integers
 * @return: An integer
 */
    public int fastPower(int a, int b, int n) {
        // write your code here
        if(n == 1) {
            return a % b;
        }
        if(n == 0) {
            return 1 % b;
        }

        long product = fastPower(a, b, n / 2);
        product = ( product * product) % b;
        if( n % 2 == 1) {
            product = ( product * a) % b;
        }
        return (int) product;
    }
}
