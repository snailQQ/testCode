package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _45JumpGame2 {
    public int jump(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int maxCover = 0;
        int lastCover = 0;
        int step = 0;

        for(int i = 0; i <= maxCover && i < nums.length; i++) {
            if(i > lastCover) {
                step++;
                lastCover = maxCover;
            }
            maxCover = Math.max(maxCover, nums[i]+i);
        }
        if(maxCover < nums.length-1) {
            return 0;
        }
        return step;
    }
}
