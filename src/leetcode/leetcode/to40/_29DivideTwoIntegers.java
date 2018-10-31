package leetcode.leetcode.to40;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/divide-two-integers/
 *
 * Divide two integers without using multiplication, division and mod operator.

 If it is overflow, return MAX_INT.
 * answer link
 */
public class _29DivideTwoIntegers {
    public int divide1(int dividend, int divisor) {
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

//    public static int divide2(int dividend, int divisor) {
//        if(dividend == 0 || divisor == 0 ) {
//            return 0; //如果除数被除数等于0 返回0
//        }
//
//        boolean isNeg = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
//
//        long absDividend = Math.abs((long)dividend);
//        long absDivisor = Math.abs((long)divisor);
//
//        if(absDivisor > absDividend) {
//            return 0;
//        }
//
//        long sum = 0;
//        long pow = 0;
//        int result = 0;
//        while(absDividend >= absDivisor) {
//            pow = 1;
//            sum = absDivisor;
//            while(sum + sum <= absDividend) {
//                sum += sum;
//                pow += pow;
//            } // 用被除数翻倍的方法,直到不能翻倍以后采用余数去除,最终得到结果
//            absDividend -= sum;
//            result += pow;
//        }
//
//        return isNeg ? -result : result;
//    }

    public static int divide3(int dividend, int divisor) {
        if (dividend == 0 || divisor == 0) {
            return 0;
        }
        boolean isNeg = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        if (b > a) {
            return 0;
         }

        long sum = 0;
        long pow = 0;
        long result = 0;
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
        if(result > Integer.MAX_VALUE && !isNeg) {
            return Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE && isNeg) {
            return Integer.MIN_VALUE;
        }
        return isNeg ? -(int)result : (int)result;
    }

    public static void main(String[] args) {
        System.out.println(divide3(-2147483648, -1));
    }
}
