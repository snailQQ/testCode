package leetcode.leetcode.to120;

/**
 * Created by Paul on 11/2/15.
 * question link
 *
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

 For example,
 Given:
 s1 = "aabcc",
 s2 = "dbbca",

 When s3 = "aadbbcbcac", return true.
 When s3 = "aadbbbaccc", return false.
 * <p/>
 * answer link
 */
public class _97InterleavingString {
  public static boolean isInterleave(String s1, String s2, String s3) {
    if(s1 == null || s2 == null || s3 == null) {
      return false;
    }
    if(s1.length() + s2.length() != s3.length()) {
      return false;
    }
    if(s1.length() == 0) {
      return s2.equals(s3);
    }
    if(s2.length() == 0) {
      return s1.equals(s3);
    }

    boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
    dp[0][0] = true;
    for(int i = 0; i < s2.length(); i++) {
      if(s2.charAt(i) == s3.charAt(i)) {
        dp[0][i+1] = dp[0][i];
      } else {
        dp[0][i+1] = false;
      }
    }

    for(int i = 0; i < s1.length(); i++) {
      if(s1.charAt(i) == s3.charAt(i)) {
        dp[i+1][0] = dp[i][0];
      } else {
        dp[i+1][0] = false;
      }
    }

    for(int i = 1; i <= s1.length(); i++) {
      for(int j = 1; j <= s2.length(); j++) {
        if(s1.charAt(i-1) == s3.charAt(i+j-1) && dp[i-1][j]) {
          dp[i][j] = true;
        }
        if(s2.charAt(j-1) == s3.charAt(i+j-1) && dp[i][j-1]) {
          dp[i][j] = true;
        }
      }
    }

    for(int i = 0; i <= s1.length(); i++) {
      for(int j = 0; j <= s2.length(); j++) {
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();
    }

    return dp[s1.length()][s2.length()];
  }

  public static void main(String[] args) {
    System.out.println(isInterleave("aabcc","dbbca","aadbbcbcac"));
    System.out.println(isInterleave("aabcc","dbbca","aadbbbaccc"));

  }
}
