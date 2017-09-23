package leetcode.leetcode.to40;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/search-for-a-range/
 * answer link
 */
public class _34SearchForRange {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        if(nums == null || nums.length == 0) {
            ret[0] = -1;
            ret[1] = -1;
            return ret;
        }
        int start = 0;
        int end = nums.length-1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if(nums[start] == target) {
            ret[0] = start;
        } else if(nums[end] == target) {
            ret[0] = end;
        } else {
            ret[0] = -1;
            ret[1] = -1;
            return ret;
        }

        start = 0;
        end = nums.length-1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if(nums[end] == target) {
            ret[1] = end;
        } else if(nums[start] == target) {
            ret[1] = start;
        } else {
            ret[0] = -1;
            ret[1] = -1;
            return ret;
        }

        return ret;
    }
}
