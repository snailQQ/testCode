package leetcode.leetcode.to200;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _189RotateArray {
    public static void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0) {
            return;
        }

        k = k % nums.length;
        if(k == 0) {
            return;
        }

        swapArray(nums, nums.length-k, nums.length-1);
        swapArray(nums, 0, nums.length-k-1);
        swapArray(nums, 0, nums.length-1);
    }

    private static void swapArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotate(new int[]{1,2}, 3);
    }
}
