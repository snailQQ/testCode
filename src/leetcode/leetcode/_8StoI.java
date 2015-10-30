package leetcode.leetcode;

/**
 * Created by Paul on 10/27/15.
 * question link
 * <p/>
 * answer link
 */
public class _8StoI {
    public int myAtoi(String str) {
        if(str == null || str.length() < 1) {
            return 0;
        }

        str = str.trim();

        int flag = 1;
        int index = 0;

        if(str.charAt(index) == '-') {
            flag = -1;
            index++;
        } else if(str.charAt(index) == '+') {
            index++;
        }

        double num = 0;

        for(int i = index; i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'; i++) {
            num = num * 10 + (str.charAt(i) - '0');
        }

        num = num * flag;

        if(num >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if(num <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) num;
    }
}
