package leetcode.leetcode.to200;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/one-edit-distance/
 * answer link
 * http://buttercola.blogspot.com/2015/08/leetcode-one-edit-distance.html
 *
 */
public class _161_OneEditDistance {
    public static boolean isOneEditDistance(String s, String t) {
        if(s == null || t == null) {
            return false;
        }

        int sLen = s.length();
        int tLen = t.length();

        //if the difference of two strings is bigger than 1
        if(Math.abs(sLen - tLen) > 1) {
            return false;
        }

        if(sLen > tLen) {
            String temp = t;
            t = s;
            s = temp;
            sLen = s.length();
            tLen = t.length();
        }

        if(sLen == tLen) {
            int count = 0;
            for(int i = 0; i < sLen; i++) {
                if(s.charAt(i) != t.charAt(i)) {
                    count++;
                }
                if(count > 1) {
                    return false;
                }
            }
            if(count == 1) {
                return true;
            }
        } else {
            int i = 0;
            int j = 0;
            int count = 0;
            while(i < sLen) {
                if(s.charAt(i) != t.charAt(j)) {
                    count++;
                    j++;
                    if(count > 1) {
                        return false;
                    }
                } else {
                    i++;
                    j++;
                }
            }
            return true;
        }
        return false;
    }
}
