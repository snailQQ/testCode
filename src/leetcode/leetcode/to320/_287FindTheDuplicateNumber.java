package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 * http://segmentfault.com/a/1190000003817671
 */
public class _287FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        int find = 0;
        while(find != slow) {
            slow = nums[slow];
            find = nums[find];
        }
        return nums[find];
    }

    public static void main(String[] args) {
        int a = findDuplicate(new int[]{1,3,4,2,2});
    }
}
