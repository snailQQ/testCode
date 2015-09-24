package lin.M12_20150817;

/**
 * Created by Paul on 8/17/15.
 * http://www.lintcode.com/en/problem/longest-common-substring/
 */
//Longest Common Substring
//
//        31% Accepted
//        Given two strings, find the longest common substring.
//
//        Return the length of it.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given A = "ABCD", B = "CBCE", return 2.
//
//        Note
//        The characters in substring should occur continuously in original string. This is different with subsequence.
//
//        Challenge
//        O(n x m) time and memory.
public class M79LongestCommonSubstring {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        if(A == null || A.length() == 0 || B == null || B.length() ==0) {
            return 0;
        }

        int[][] dp = new int[A.length()+1][B.length()+1];

        for(int i = 0; i < A.length()+1; i++) {
            dp[i][0] = 0;
        }

        for(int j = 0; j < B.length()+1; j++) {
            dp[0][j] = 0;
        }

        int max = 0;

        for(int i = 1; i < A.length()+1; i++) {
            for(int j = 1; j < B.length()+1; j++) {
                if(A.charAt(i-1) == B.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }

        return max;
    }
}
