package leetcode.leetcode.to40;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/next-permutation/
 * answer link
 * http://www.cnblogs.com/springfor/p/3896245.html
 */
public class _31NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length < 2) {
            return;
        }
        int left = nums.length - 2;
        while(left > 0 && nums[left] >= nums[left+1]) {
            left--;
        }
        if(left == 0 && nums[left] > nums[left+1]) {
            reverse(nums, 0, nums.length-1);
        } else {
            int right = left + 1;
            while(right < nums.length && nums[right] > nums[left]) {
                right++;
            }
            right--;
            swap(nums, left, right);
            reverse(nums, left+1, nums.length-1);
        }

    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start++, end--);
        }
    }
}
