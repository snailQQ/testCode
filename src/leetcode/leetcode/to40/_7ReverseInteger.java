package leetcode.leetcode.to40;

/**
 * Created by Paul on 10/27/15.
 * question link https://leetcode.com/problems/reverse-integer/description/
 * Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321

 click to show spoilers.

 Have you thought about this?
 Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

 If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

 Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 Note:
 The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 * <p/>https://leetcode.com/problems/reverse-integer/
 * answer link
 */
public class _7ReverseInteger {
    public int reverse(int x) {
        if(x >= -9 && x <= 9) {
            return x;
        }

        int flg = 1;
        if(x < 0) {
            flg = -1;
        }

        x = Math.abs(x);
        long newX = 0;
        while(x > 0) {
            newX = newX * 10 + x % 10;
            x = x / 10;
        }

        newX = newX * flg;

        if(newX > Integer.MAX_VALUE || newX < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)newX;

    }
}
