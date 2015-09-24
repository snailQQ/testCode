//package lin.M9_20150813;
//
///**
// * Created by Paul on 8/12/15.
// * http://www.lintcode.com/en/problem/distinct-subsequences/
// * http://blog.csdn.net/abcbc/article/details/8978146
// * http://www.cnblogs.com/springfor/p/3896152.html
// */
////Distinct Subsequences
////
////        30% Accepted
////        Given a string S and a string T, count the number of distinct subsequences of T in S.
////
////        A subsequence of a string is a new string which is formed from the original string by deleting some
////        (can be none) of the characters without disturbing the relative positions of the remaining characters.
////        (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
////
////        Have you met this question in a real interview? Yes
////        Example
////        Given S = "rabbbit", T = "rabbit", return 3.
////
////        Challenge
////        Do it in O(n2) time and O(n) memory.
////
////        O(n2) memory is also acceptable if you do not know how to optimize memory.
//public class M118DistinctSubsequences {
//    /**
//     * @param S, T: Two string.
//     * @return: Count the number of distinct subsequences
//     */
//    public static int numDistinct(String S, String T) {
//        // write your code here
////        int[][] dp = new int[S.length() + 1][T.length() + 1];
////        dp[0][0] = 1;//initial
////
////        for(int j = 1; j <= T.length(); j++)//S is empty
////            dp[0][j] = 0;
////
////        for (int i = 1; i <= S.length(); i++)//T is empty
////            dp[i][0] = 1;
////
////        for (int i = 1; i <= S.length(); i++) {
////            for (int j = 1; j <= T.length(); j++) {
////                dp[i][j] = dp[i - 1][j];
////                if (S.charAt(i - 1) == T.charAt(j - 1))
////                    dp[i][j] += dp[i - 1][j - 1];
////            }
////        }
////
////        for (int i = 0; i <= S.length(); i++) {
////            for (int j = 0; j <= T.length(); j++) {
////                System.out.print(dp[i][j]+" ");
////            }
////            System.out.println();
////        }
////
////        return dp[S.length()][T.length()];
//        if(S == null || S.length() == 0) {
//            return 0;
//        }
//
//        int len1 = S.length();
//        int len2 = T.length();
//
//        int[][] dp = new int[len1+1][len2+1];
//
//        for(int i = 0; i < len2+1; i++) {
//            dp[0][i] = 0;
//        }
//
//        for(int i = 0; i < len1+1; i++) {
//            dp[i][0] = 1;
//        }
//
//        for(int i = 1; i < len1+1; i++) {
//            for(int j = 1; j < len2+1; j++) {
//                dp[i][j] = dp[i-1][j];
//
//                if(S.charAt(i-1) == T.charAt(j-1)) {
//                    dp[i][j] = dp[i-1][j-1];
//                }
//            }
//        }
//
//        return dp[len1][len2];
//    }
//
//    public static void main(String [] args) {
//        int s = numDistinct("ddd","dd");
//    }
//}
