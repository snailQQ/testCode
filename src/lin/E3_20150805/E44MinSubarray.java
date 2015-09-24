package lin.E3_20150805;

import java.util.ArrayList;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/minimum-subarray/
 */
//Minimum Subarray
//
//        38% Accepted
//        Given an array of integers, find the subarray with smallest sum.
//
//        Return the sum of the subarray.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For [1, -1, -2, 1], return -3
//
//        Note
//        The subarray should contain at least one integer.
//
//        Tags Expand

public class E44MinSubarray {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        if(nums == null || nums.size() == 0) {
            return Integer.MIN_VALUE;
        }
        int[] dp = new int[nums.size()];
        dp[0] = nums.get(0);
        int min = dp[0];
        for(int i = 1; i < nums.size(); i++) {
            if(dp[i-1] < 0) {
                dp[i] = dp[i-1] + nums.get(i);
            } else {
                dp[i] = nums.get(i);
            }

            min = dp[i] < min ? dp[i] : min;
        }

        return min;
    }
}
