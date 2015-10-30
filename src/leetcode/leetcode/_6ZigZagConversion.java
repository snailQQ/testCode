package leetcode.leetcode;

/**
 * Created by Paul on 10/27/15.
 * question link
 * https://leetcode.com/problems/zigzag-conversion/
 * answer link
 *
 */


public class _6ZigZagConversion {
    public String convert(String s, int numRows) {
        if(s == null || s.length() == 0 || numRows <= 1) {
            return s;
        }

        String returnStr = "";
        int factor = numRows * 2 - 2;
        for(int i = 0; i < numRows; i++) {
            if(i == 0 ||  i == numRows-1) {
                int j = i;
                while(j < s.length()) {
                    returnStr = returnStr + s.charAt(j);
                    j = j + factor;
                }
            }else {
                int j = i;
                int k = factor - i;
                while(j < s.length() && k < s.length()) {
                    returnStr = returnStr + s.charAt(j) + s.charAt(k);
                    j = j + factor;
                    k = k + factor;
                }
                if(j < s.length()) {
                    returnStr = returnStr + s.charAt(j);
                }
            }
        }

        return returnStr;
    }
}
