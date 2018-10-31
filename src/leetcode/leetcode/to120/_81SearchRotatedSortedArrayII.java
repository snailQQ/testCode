package leetcode.leetcode.to120;

/**
 * Created by Paul on 11/2/15.
 * question link
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * <p/>
 * Follow up for "Search in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?
 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Write a function to determine if a given target is in the array.

 The array may contain duplicates.

因为有数组里的数字有重复,所以用二分来做的话不能提高运算效率
 * answer link
 * http://www.jiuzhang.com/solutions/search-in-rotated-sorted-array-ii/
 * http://www.cnblogs.com/springfor/p/3859525.html
 */
public class _81SearchRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return false;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}
