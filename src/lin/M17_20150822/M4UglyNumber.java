package lin.M17_20150822;

/**
 * Created by Paul on 8/22/15.
 * http://blog.welkinlan.com/2015/07/28/ugly-number-lintcode-java/
 */
//Ugly Number
//
//        20% Accepted
//        Ugly number is a number that only have factors 3, 5 and 7.
//
//        Design an algorithm to find the Kth ugly number. The first 5 ugly numbers are 3, 5, 7, 9, 15 ...
//
//        Have you met this question in a real interview? Yes
//        Example
//        If K=4, return 9.
//
//        Challenge
//        O(K log K) or O(K) time.


public class M4UglyNumber {
    /**
    * @param k: The number k.
    * @return: The kth prime number as description.
            */
    public long kthPrimeNumber(int k) {
        // write your code here
        long[] dp = new long[k+1];
        int p3 = 0;
        int p5 = 0;
        int p7 = 0;
        dp[0] = 1;
        for(int i = 1; i <= k; i++) {
            dp[i] = Math.min(Math.min(3 * dp[p3], 5 * dp[p5]), 7 * dp[p7]);
            if(dp[i] == 3 * dp[p3]) {
                p3++;
            }
            if(dp[i] == 5 * dp[p5]) {
                p3++;
            }
            if(dp[i] == 7 * dp[p7]) {
                p3++;
            }
        }
        return dp[k];
    }
}
