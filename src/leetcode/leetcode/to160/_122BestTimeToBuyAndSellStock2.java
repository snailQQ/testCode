package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/submissions/detail/41684059/
 * answer link
 */
public class _122BestTimeToBuyAndSellStock2 {
//    public int maxProfit(int[] prices) {
//        if(prices == null || prices.length <= 1) {
//            return 0;
//        }
//        int[] dp = new int[prices.length];
//        dp[0] = 0;
//
//        for(int i = 1; i < prices.length; i++) {
//            if(prices[i] >= prices[i-1]) {
//                dp[i] = dp[i-1] + (prices[i] - prices[i-1]);
//            } else {
//                dp[i] = dp[i-1];
//            }
//        }
//        return dp[prices.length-1];
//    }

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) {
            return 0;
        }
        int max = 0;
        int min = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > min) {
                max += prices[i] - min;

            }
            min = prices[i];
        }
        return max;
    }
}
