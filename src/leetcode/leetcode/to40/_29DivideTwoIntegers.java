package leetcode.leetcode.to40;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/divide-two-integers/
 * answer link
 */
public class _29DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == 0 || divisor == 0) {
            return 0;
        }
        boolean flg = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        if(a < b) {
            return 0;
        }
        long sum = 0;
        long power = 0;
        long result = 0;
        while(a >= b) {
            sum = b;
            power = 1;
            while(sum + sum <= a) {
                sum += sum;
                power += power;
            }
            a -= sum;
            result += power;
        }
        result = ((((dividend ^ divisor) >> 31) & 1) == 1) ? -result: result;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int)result;
    }
}
