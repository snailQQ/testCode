package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/> https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Find the minimum element.

 You may assume no duplicate exists in the array.


 * answer link
 */
public class _153FindMinimumInRotatedSortedArray {

  public static int findMin(int[] nums) {
    if (nums == null || nums.length == 0) {
      return Integer.MAX_VALUE;
    }

    if (nums.length == 1) {
      return nums[0];
    }

    int start = 0;
    int end = nums.length - 1;
    while (start + 1 < end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] > nums[start] && nums[end] < nums[start]) {
        start = mid;
      } else {
        end = mid;
      }
    }

    int min = Math.min(nums[start], nums[end]);
    return min;
  }

  public static void main(String[] args) {
    System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    System.out.println(findMin(new int[]{1,2,3}));
  }
}
