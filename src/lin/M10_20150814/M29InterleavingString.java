package lin.M10_20150814;

import java.util.ArrayList;

/**
 * Created by Paul on 8/13/15.
 */
//Interleaving String
//
//        26% Accepted
//        Given three strings: s1, s2, s3, determine whether s3 is formed by the interleaving of s1 and s2.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For s1 = "aabcc", s2 = "dbbca"
//
//        When s3 = "aadbbcbcac", return true.
//        When s3 = "aadbbbaccc", return false.
//        Challenge
//        O(n2) time or better
//
//        Tags Expand
public class M29InterleavingString {
    /**
     * Determine whether s3 is formed by interleaving of s1 and s2.
     * @param s1, s2, s3: As description.
     * @return: true or false.
     */
    public static boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if(s1.length() + s2.length() != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        dp[0][0] = true;
        for(int i = 1; i < s1.length()+1; i++) {
            if((s1.charAt(i-1) == s3.charAt(i-1)) && dp[i-1][0]) {
                dp[i][0] = true;
            }
        }

        for(int i = 1; i < s2.length()+1; i++) {
            if((s2.charAt(i-1) == s3.charAt(i-1)) && dp[0][i-1]) {
                dp[0][i] = true;
            }
        }

        for(int i = 1; i < s1.length()+1; i++) {
            for(int j = 1; j < s2.length()+1; j++) {
                if(s1.charAt(i-1) == s3.charAt(i+j-1) && dp[i-1][j]) {
                    dp[i][j] = true;
                }
                if(s2.charAt(j-1) == s3.charAt(i+j-1) && dp[i][j-1]) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String [] args) {
//        For s1 = "aabcc", s2 = "dbbca"
//
//        When s3 = "aadbbcbcac"

        boolean a = isInterleave("db", "b", "cbb");
    }
}
////if(s3.length()!=s1.length()+s2.length())
////        return false;
////
////        boolean [][] dp = new boolean [s1.length()+1][s2.length()+1];
////        dp[0][0]=true;
////
////        for(int i = 1; i<=s1.length() && s1.charAt(i-1)==s3.charAt(i-1); i++)
////        dp[i][0]=true;
////
////        for(int i = 1; i<=s2.length() && s2.charAt(i-1)==s3.charAt(i-1); i++)
////        dp[0][i]=true;
////
////        for(int i = 1; i <= s1.length(); i++){
////            for(int j = 1; j <= s2.length(); j++){
////                char c = s3.charAt(i+j-1);
////                if(c == s1.charAt(i-1) && dp[i-1][j])
////                dp[i][j] = true;
////
////                if(c == s2.charAt(j-1) && dp[i][j-1])
////                dp[i][j] = true;
////            }
////        }
////        return dp[s1.length()][s2.length()];