package lin.M6_20150810;

/**
 * Created by Paul on 8/9/15.
 * http://www.lintcode.com/en/problem/best-time-to-buy-and-sell-stock-iii/
 * http://www.cnblogs.com/springfor/p/3877068.html
 *
 **/
//Best Time to Buy and Sell Stock III
//
//        26% Accepted
//        Say you have an array for which the ith element is the price of a given stock on day i.
//
//        Design an algorithm to find the maximum profit. You may complete at most two transactions.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given an example [4,4,6,1,1,4,2,5], return 6.
//
//        Note
//        You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
public class M151BTBSS3 {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices == null || prices.length <= 1){
            return 0;
        }
        int len = prices.length;
        int maxProfit = 0;
        int min = prices[0];
        int arrayA[] = new int[len];

        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            arrayA[i]=Math.max(arrayA[i-1],prices[i]-min);
        }

        int max = prices[len-1];
        int arrayB[] = new int[len];
        for(int i = len-2; i >= 0; i--){
            max = Math.max(prices[i],max);
            arrayB[i] = Math.max(max-prices[i],arrayB[i+1]);
        }

        for(int i = 0; i < len; i++){
            maxProfit = Math.max(maxProfit,arrayA[i] + arrayB[i]);
        }

        return maxProfit;
    }
}
