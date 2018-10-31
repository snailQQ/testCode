package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only
 * one duplicate number, find the duplicate one.

 Note:
 You must not modify the array (assume the array is read only).
 You must use only constant, O(1) extra space.
 Your runtime complexity should be less than O(n2).
 There is only one duplicate number in the array, but it could be repeated more than once.
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

    public static int findDuplicate2(int[] nums) {

        int start = 1;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for(int num : nums) {
                if(num <= mid) {
                    count++;
                }
            }
            if( count <= mid) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {

        int a = findDuplicate2(new int[]{1,3,4,2,2});
        System.out.println(a);
        System.out.println(findDuplicate2(new int[]{1,1,2}));
    }
}
