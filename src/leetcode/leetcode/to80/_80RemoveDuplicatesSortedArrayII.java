package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _80RemoveDuplicatesSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int p = 1;
        int flg = 1;
        int cur = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != cur) {
                nums[p++] = nums[i];
                flg = 1;
                cur = nums[i];
            } else {
                if(flg != 2) {
                    nums[p++] = nums[i];
                    flg++;
                }
            }
        }
        return p;









































































































































































    }

    public static void main(String[] args) {
        int a = removeDuplicates(new int[]{0,0,0,1,2,2,4,4});
    }
}
