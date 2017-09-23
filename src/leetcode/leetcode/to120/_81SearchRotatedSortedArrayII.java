package leetcode.leetcode.to120;

/**
 * Created by Paul on 11/2/15.
 * question link
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * <p/>
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
