package leetcode.ext;

/**
 * Created by pengcheng.qi on 10/6/17.
 *
 * Longest Common Subsequence
 * • http://www.lintcode.com/problem/longest-common-subsequence/
 * • http://www.jiuzhang.com/solutions/longest-common-subsequence/
 * https://www.youtube.com/watch?v=NnD96abizww
 * Given two strings, find the longest common subsequence (LCS).

 Your code should return the length of LCS.

 Have you met this question in a real interview? Yes
 Clarification
 What's the definition of Longest Common Subsequence?

 https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
 http://baike.baidu.com/view/2020307.htm
 Example
 For "ABCD" and "EDCA", the LCS is "A" (or "D", "C"), return 1.

 For "ABCD" and "EACB", the LCS is "AC", return 2.
 */
public class LinLongestCommonSubsequence {
  public static int longestCommonSubsequence(String A, String B) {
    if(A == null || B == null || A.length() == 0 || B.length() == 0) {
      return 0;
    }

    int[][] dp = new int[A.length()+1][B.length()+1];
    for(int i = 0; i <= A.length(); i++) {
      for(int j = 0; j <=B.length(); j++) {
        if(i == 0 || j == 0) {
          dp[i][j] = 0;
          continue;
        }
        if(A.charAt(i-1) == B.charAt(j-1)) {
          dp[i][j] = dp[i-1][j-1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
      }
    }
    return dp[A.length()][B.length()];
  }

  public static void main(String[] args) {
    System.out.println(longestCommonSubsequence("ABCD", "EDCA"));
    System.out.println(longestCommonSubsequence("ABCD", "EACB"));
    System.out.println(longestCommonSubsequence("bedaacbade", "dccaeedbeb"));

  }
}
