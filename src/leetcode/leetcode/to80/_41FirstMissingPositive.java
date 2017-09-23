package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/first-missing-positive/
 * answer link
 * http://www.cnblogs.com/springfor/p/3889547.html
 */
public class _41FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 1;
        }
        int[] flg = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && nums[i] <= nums.length) {
                flg[nums[i]] = 1;
            }
        }
        int val = 1;
        for(int i = 1; i < flg.length; i++) {
            if(flg[i] == 0) {
                val = i;
                return val;
            }
        }
        return nums.length+1;
    }

//    public int firstMissingPositive(int[] nums) {
//        if(nums == null || nums.length == 0) {
//            return 1;
//        }
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]) {
//                int temp = nums[nums[i]-1];
//                nums[nums[i]-1] = nums[i];
//                nums[i] = temp;
//                i--;
//            }
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] != i+1) {
//                return i+1;
//            }
//        }
//        return nums.length+1;
//
//    }
}
