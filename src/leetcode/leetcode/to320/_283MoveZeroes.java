package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _283MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return;
        }
        int index = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            } else {
                count++;
            }
        }

        for(int i = nums.length-1; i >= 0 && count > 0; i--) {
            nums[i] = 0;
            count--;
        }
    }

    //这种方法会改变相对位置
    public void moveZeroes2(int[] nums) {
        if(nums == null || nums.length < 2) {
            return;
        }
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while(left < right) {
            if(nums[i] == 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                right--;
            } else {
                i++;
                left++;
            }

        }
    }
}
