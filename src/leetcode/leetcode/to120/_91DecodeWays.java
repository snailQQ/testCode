package leetcode.leetcode.to120;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/decode-ways/
 * answer link
 * http://www.jiuzhang.com/solutions/decode-ways/
 */
public class _91DecodeWays {
    public static int numDecodings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2; i <= s.length(); i++) {
            if(s.charAt(i-1) - '0' != 0) {
                dp[i] = dp[i-1];
            }
            int twoDigits = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
            if(twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i-2];
            }

        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        int a = numDecodings("10");
    }
}
