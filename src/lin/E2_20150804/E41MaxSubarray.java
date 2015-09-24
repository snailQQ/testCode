package lin.E2_20150804;

import java.util.ArrayList;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/maximum-subarray/
 * http://www.cnblogs.com/springfor/p/3877058.html
 * //    http://blog.csdn.net/fightforyourdream/article/details/14515425
 */

//Maximum Subarray
//
//        37% Accepted
//        Given an array of integers, find a contiguous subarray which has the largest sum.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given the array [−2,2,−3,4,−1,2,1,−5,3], the contiguous subarray [4,−1,2,1] has the largest sum = 6.
//
//        Note
//        The subarray should contain at least one number.
//
//        Challenge
//        Can you do it in time complexity O(n)?
public class E41MaxSubarray {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(ArrayList<Integer> nums) {
        // write your code

    if(nums == null || nums.size() == 0) {
        return Integer.MIN_VALUE;
    }

        int[] dp = new int[nums.size()];
        dp[0] = nums.get(0);
        int max = dp[0];
        for(int i = 1; i < nums.size(); i++) {
            if(dp[i-1] <= 0) {
                dp[i] = nums.get(i);

            } else {
                dp[i] =  nums.get(i) + dp[i-1];
            }
            max = max < dp[i] ? dp[i] : max;
        }

        return max;
    }
}
