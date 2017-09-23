package leetcode.leetcode.to280;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/add-digits/
 * answer link
 */
public class _258AddDigits {
    public int addDigits(int num) {
        num = 1+(num-1)%9;
        return num;

    }
}
