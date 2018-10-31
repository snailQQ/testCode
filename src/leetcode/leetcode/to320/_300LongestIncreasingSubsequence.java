package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link https://leetcode.com/problems/longest-increasing-subsequence/description/
 * <p/>
 * Given an unsorted array of integers, find the length of longest increasing subsequence.

 For example,
 Given [10, 9, 2, 5, 3, 7, 101, 18],
 The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

 Your algorithm should run in O(n2) complexity.

 Follow up: Could you improve it to O(n log n) time complexity?

 Credits:
 Special thanks to @pbrother for adding this problem and creating all test cases.
 * answer link
 */
public class _300LongestIncreasingSubsequence {
  public static int lengthOfLIS(int[] nums) {
    if(nums == null || nums.length == 0) {
      return 0;
    }

    int[] dp = new int[nums.length];
    for(int i = 0; i < dp.length; i++) {
      dp[i] = 1;
    }

    int max = 1;
    for(int i = 1; i < nums.length; i++) {
      for(int j = 0; j < i; j++) {
        if(nums[j] < nums[i]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
          max = Math.max(max, dp[i]);
        }
      }
    }

    return max;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,4}));
  }
}
