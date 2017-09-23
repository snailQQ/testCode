package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/wildcard-matching/
 * answer link
 * http://shmilyaw-hotmail-com.iteye.com/blog/2154716
 */
public class _44WildcardMatching {
    public static boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int star = -1;
        int mark = -1;
        while (i < s.length()) {
            if (j < p.length()
                    && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                ++i;
                ++j;
            } else if (j < p.length() && p.charAt(j) == '*') {
                star = j++;
                mark = i;
            } else if (star != -1) {
                j = star + 1;
                i = ++mark;
            } else {
                return false;
            }
        }
        while (j < p.length() && p.charAt(j) == '*') {
            ++j;
        }
        return j == p.length();
    }

    public static void main(String[] args) {
        boolean a = isMatch("abcdcd", "a*cd");
    }
}
