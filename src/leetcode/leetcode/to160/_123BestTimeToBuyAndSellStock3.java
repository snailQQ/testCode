package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 * http://www.cnblogs.com/springfor/p/3877068.html
 */
public class _123BestTimeToBuyAndSellStock3 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) {
            return 0;
        }

        int[] left = new int[prices.length];
        left[0] = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(left[i-1], prices[i] - min);
        }

        int[] right = new int[prices.length];
        right[prices.length-1] = 0;
        int max = prices[prices.length-1];
        for(int i = prices.length-2; i >= 0; i--) {
            max = Math.max(max, prices[i]);
            right[i] = Math.max(right[i+1], max - prices[i]);
        }

        int total = 0;
        for(int i = 0; i < prices.length; i++) {
            total = Math.max(total, left[i] + right[i]);
        }
        return total;
    }
}
