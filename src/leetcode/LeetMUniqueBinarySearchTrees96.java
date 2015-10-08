package leetcode;

/**
 * Created by Paul on 10/2/15.
 * http://fisherlei.blogspot.com/2013/03/leetcode-unique-binary-search-trees.html
 * http://bangbingsyb.blogspot.com/2014/11/leetcode-unique-binary-search-trees-i-ii.html
 */
public class LeetMUniqueBinarySearchTrees96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];

    }
}
