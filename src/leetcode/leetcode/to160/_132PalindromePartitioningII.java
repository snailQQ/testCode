package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/palindrome-partitioning-ii/description/
 * Given a string s, partition s such that every substring of the partition is a palindrome.

 Return the minimum cuts needed for a palindrome partitioning of s.

 For example, given s = "aab",
 Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 * <p/>
 * answer link
 */
public class _132PalindromePartitioningII {
  public int minCut(String s) {
    if(s == null || s.length() == 0) {
      return 0;
    }
    int[] dp = new int[s.length()+1];
    for(int i = 0; i <= s.length(); i++) {
      dp[i] = i - 1; // max cut
    }

    for(int i = 0; i < s.length(); i++) {
      for(int j = i, k = i; j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k); j--, k++) {
        dp[k+1] = Math.min(dp[k+1], dp[j]+1);
      } //odd
      for(int j = i, k = i+1; j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k); j--, k++) {
        dp[k+1] = Math.min(dp[k+1], dp[j]+1);
      } //even
    }

    return dp[s.length()];
  }
}
