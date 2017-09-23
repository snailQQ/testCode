package leetcode.leetcode.to280;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/paint-fence/
 * answer link
 * http://segmentfault.com/a/1190000003790650
 */
public class _276_PaintFence {
    public int numWays(int n, int k) {
        // if(n == 0 || k == 0) {
        //     return 0;
        // }

        int[] dp = new int[] {0, k, k*k, 0};
        if(n <= 2) {
            return dp[n];
        }
        for(int i = 2; i < n; i++) {
            dp[3] = (dp[2] + dp[1]) * (k-1);
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];
    }
}
