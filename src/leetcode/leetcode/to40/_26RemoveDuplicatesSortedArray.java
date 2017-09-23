package leetcode.leetcode.to40;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * answer link
 */
public class _26RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
//        if(nums == null || nums.length == 0) {
//            return 0;
//        }
//        int count = 1;
//        for(int i = 1; i < nums.length; i++) {
//            if(nums[i] != nums[i-1]) {
//                nums[count++] = nums[i];
//            }
//        }
//        return count;
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            int j;
            for(j = 0; j < i; j++) {
                if(nums[j] == nums[i]) {
                    break;
                }
            }
            if(j == i) {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,4,5,6,7,5,4,3};
        System.out.println(removeDuplicates(a));
    }
}
