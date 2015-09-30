package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/reverse-integer/
 */
//Reverse Integer
//
//        28% Accepted
//        Reverse digits of an integer. Returns 0 when the reversed integer overflows (signed 32-bit integer).
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given x = 123, return 321
//
//        Given x = -123, return -321


public class E413ReverseInteger {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public static int reverseInteger(int n) {
        // Write your code here
        int flag = 1;
        if(n<0){
            flag = -1;
        }
        long temp = Math.abs(n);
        long left = 0;
        long result = 0;
        while(temp != 0){
            if (Math.abs(result) > Integer.MAX_VALUE) {
                return 0;
            }
            left = temp % 10;
            result = result*10 + left;
            temp = temp/10;
        }
        if(result > Integer.MAX_VALUE){
            return -1;
            // only return -1 here, or we can print one message
            //or use a static field variable "isValid" for representint states?
        }else{
            return (int) (result*flag);
        }
    }

    public static void main(String [] args) {
        int a = reverseInteger(1534236469);
    }
}


//    public int reverse(int x) {
//        int flag = 1;
//        if(x < 0) {
//            flag = -1;
//        }
//
//        if(x > -10 && x < 10) {
//            return x;
//        }
//
//        x = Math.abs(x);
//        long newX = 0;
//        while(x > 0) {
//            newX = newX * 10 + x % 10;
//            x = x / 10;
//        }
//        newX = newX * flag;
//        if (newX > Integer.MAX_VALUE || newX < Integer.MIN_VALUE) {
//            return 0;
//        }
//        return (int)newX;
//    }