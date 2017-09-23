package leetcode.leetcode.to40;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/search-insert-position/description/
 *
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 * <p/>https://leetcode.com/problems/search-insert-position/
 * answer link
 */
public class _35SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
//        if(nums == null || nums.length == 0) {
//            return 0;
//        }
//        int start = 0;
//        int end = nums.length - 1;
//        while(start + 1 < end) {
//            int mid = start + (end - start) / 2;
//            if(nums[mid] == target) {
//                return mid;
//            } else if(nums[mid] > target) {
//                end = mid;
//            } else {
//                start = mid;
//            }
//        }
//        if(nums[start] >= target) {
//            return start;
//        } else if( nums[end] >= target) {
//            return end;
//        } else {
//            return nums.length;
//        }
        if(nums == null || nums.length == 0) {
            return 0;
        }

        if(target <= nums[0]) {
            return 0;
        }

        if(target > nums[nums.length-1]) {
            return nums.length;
        }

        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int[] b = {1,3};
        System.out.println(searchInsert(a, 5));
        System.out.println(searchInsert(a, 2));
        System.out.println(searchInsert(a, 7));
        System.out.println(searchInsert(a, 0));
        System.out.println(searchInsert(b, 2));
        System.out.println(searchInsert(b, 3));
    }
}
