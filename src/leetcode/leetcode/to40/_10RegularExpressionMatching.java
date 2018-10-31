package leetcode.leetcode.to40;

/**
 * Created by Paul on 10/28/15.
 * question link
 * Implement regular expression matching with support for '.' and '*'.

 '.' Matches any single character.
 '*' Matches zero or more of the preceding element.

 The matching should cover the entire input string (not partial).

 The function prototype should be:
 bool isMatch(const char *s, const char *p)

 Some examples:
 isMatch("aa","a") → false
 isMatch("aa","aa") → true
 isMatch("aaa","aa") → false
 isMatch("aa", "a*") → true
 isMatch("aa", ".*") → true
 isMatch("ab", ".*") → true
 isMatch("aab", "c*a*b") → true
 * <p/>
 * answer link
 */
public class _10RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (p.length() == 0)
            return s.length() == 0;

        // length == 1 is the case that is easy to forget.
        // as p is subtracted 2 each time, so if original
        // p is odd, then finally it will face the length 1
        if (p.length() == 1)
            return (s.length() == 1) && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

        // next char is not '*': must match current character
        if (p.charAt(1) != '*') {
            if (s.length() == 0)
                return false;
            else
                return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')
                        && isMatch(s.substring(1), p.substring(1));
        }else{
            // next char is *
            while (s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
                if (isMatch(s, p.substring(2)))
                    return true;
                s = s.substring(1);
            }
            return isMatch(s, p.substring(2));
        }
    }

    public static boolean isMatchDP(String s, String p) {
        if(s == null || p == null || s.length() == 0 || p.length() == 0) {
            return false;
        }

        int row = s.length();
        int col = p.length();

        boolean[][] dp = new boolean[row+1][col+1];

        dp[0][0] = true;

        for(int i = 1; i < col+1; i++) {
            if(p.charAt(i-1) == '*' && i >= 2) {
                dp[0][i] = dp[0][i-2];
            }
        }

        for(int i = 1; i < row+1; i++) {
            for(int j = 1; j < col+1; j++) {
                if((p.charAt(j - 1) == s.charAt(i - 1)) || p.charAt(j-1) == '.') {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j - 1) == '*') {
                    if (p.charAt(j-2) != s.charAt(i-1) && p.charAt(j-2) != '.') {
                        dp[i][j] = dp[i][j-2];
                    } else {
                        dp[i][j] = (dp[i][j - 2] || dp[i][j - 1] || dp[i-1][j]);
                    }
                }
            }
        }

        for(int i = 0; i < row+1; i++) {
            for(int j = 0; j < col+1; j++) {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }


        return dp[row][col];
    }

    public static void main(String[] args) {
        boolean isMatch0 = isMatchDP("abcd", "d*");
        boolean isMatch1 = isMatchDP("aa","a");
        boolean isMatch2 = isMatchDP("aa","aa");
        boolean isMatch3 = isMatchDP("aaa","aa");
        boolean isMatch4 = isMatchDP("aa", "a*");
        boolean isMatch5 = isMatchDP("aa", ".*");
        boolean isMatch6 = isMatchDP("ab", ".*");
        boolean isMatch7 = isMatchDP("aab", "c*a*b");
        System.out.println(isMatch0);
        System.out.println(isMatch1);
        System.out.println(isMatch2);
        System.out.println(isMatch3);
        System.out.println(isMatch4);
        System.out.println(isMatch5);
        System.out.println(isMatch6);
        System.out.println(isMatch7);
    }
}
