package leetcode.leetcode.to240;

/**
 * Created by Paul on 11/17/15.
 * question link https://leetcode.com/problems/minimum-size-subarray-sum/description/
 * <p/>
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

 For example, given the array [2,3,1,2,4,3] and s = 7,
 the subarray [4,3] has the minimal length under the problem constraint.

 click to show more practice.

 More practice:
 If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).

 Credits:
 Special thanks to @Freezen for adding this problem and creating all test cases.
 * answer link
 */
public class _209MinimumSizeSubarraySum {
  public static int minSubArrayLen(int s, int[] nums) {
    if(nums == null || nums.length == 0) {
      return 0;
    }

    int i = 0, j = 0;
    int sum = 0;
    int count = Integer.MAX_VALUE;
    for( i = 0; i < nums.length; i++) {
      while(j < nums.length && sum < s) {
        sum += nums[j];
        j++;
      }
      if(sum >= s) {
        count = Math.min(j - i, count);
      }
      sum -= nums[i];
    }

    if(count == Integer.MAX_VALUE) {
      return 0;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
  }
}
