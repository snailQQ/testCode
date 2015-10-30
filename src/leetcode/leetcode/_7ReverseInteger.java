package leetcode.leetcode;

/**
 * Created by Paul on 10/27/15.
 * question link
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
