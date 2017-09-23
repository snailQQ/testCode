package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/maximum-subarray
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

   For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
   the contiguous subarray [4,-1,2,1] has the largest sum = 6.

   click to show more practice.

   More practice:
   If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 * <p/>
 * answer link
 */
public class _53MaximumSubarray {
  public static int maxSubArray(int[] nums) {
    if(nums == null || nums.length == 0) {
      return Integer.MIN_VALUE;
    }

    int previousSum = nums[0];
    int maxReturnValue = nums[0];

    for(int i = 1; i < nums.length; i++) {
      previousSum = Math.max(nums[i], nums[i]+previousSum);
      maxReturnValue = Math.max(maxReturnValue, previousSum);
    }

    return maxReturnValue;
  }

  public static void main(String[] args) {
    int[] array = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(array));
  }
}
