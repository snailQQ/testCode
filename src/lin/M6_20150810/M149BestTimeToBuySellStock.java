package lin.M6_20150810;

/**
 * Created by Paul on 8/9/15.
 * http://www.lintcode.com/en/problem/best-time-to-buy-and-sell-stock/
 */
//Best Time to Buy and Sell Stock
//
//        41% Accepted
//        Say you have an array for which the ith element is the price of a given stock on day i.
//
//        If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given an example [3,2,3,1,2], return 1
public class M149BestTimeToBuySellStock {
   /** @param prices: Given an integer array
    * @return: Maximum profit
    */
    public int maxProfit(int[] prices) {
        // write your code here
       if(prices == null || prices.length == 0) {
          return 0;
       }

       int min = Integer.MAX_VALUE;
       int profit = 0;
       for(int i : prices) {
          min = i < min ? i : min;
          profit = (i - min) > profit ? i-min : profit;
       }
       return profit;
    }
}
