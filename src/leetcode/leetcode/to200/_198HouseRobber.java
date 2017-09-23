package leetcode.leetcode.to200;

/**
 * Created by Paul on 11/17/15.
 * question link https://leetcode.com/submissions/detail/119849757/
 *  * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

 Credits:
 Special thanks to @ifanchu for adding this problem and creating all test cases. Also thanks to @ts for adding additional test cases.
 * <p/>
 * answer link
 */
public class _198HouseRobber {
  public static int rob(int[] nums) {
    if(nums == null || nums.length == 0) {
      return 0;
    }

    if(nums.length == 1) {
      return nums[0];
    }

    if(nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }

    int[] maxOfI = new int[nums.length];
    maxOfI[0] = nums[0];
    maxOfI[1] = Math.max(nums[0], nums[1]);

    int max = maxOfI[1];

    for(int i = 2; i<nums.length; i++) {
      maxOfI[i] = Math.max(maxOfI[i-1], maxOfI[i-2]+nums[i]);
      max = Math.max(maxOfI[i], max);
    }

    return max;
  }

  public static void main(String[] args) {

  }
}
