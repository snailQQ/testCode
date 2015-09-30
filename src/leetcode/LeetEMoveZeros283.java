package leetcode;

/**
 * Created by Paul on 9/22/15.
 * https://leetcode.com/problems/move-zeroes/
 */
//Move Zeroes My Submissions Question Solution
//        Total Accepted: 7602 Total Submissions: 17486 Difficulty: Easy
//        Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
//
//        Note:
//        You must do this in-place without making a copy of the array.
//        Minimize the total number of operations.
//        Credits:
//        Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
//
//        Hide Tags Array Two Pointers
//        Hide Similar Problems (E) Remove Element

//public class E283MoveZeros {
//    public void moveZeroes(int[] nums) {
//        if(nums == null || nums.length == 0) {
//            return;
//        }
//
//        // Arrays.sort(nums);
//
//        // int point = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0 && i < nums.length-1) {
//                for(int j = i+1; j < nums.length; j++) {
//                    if(nums[j] == 0) {
//                        continue;
//                    } else {
//                        nums[i] = nums[j];
//                        nums[j] = 0;
//                        break;
//                    }
//                }
//            } else {
//                continue;
//            }
//        }
//    }
//}


public class LeetEMoveZeros283 {
    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }

        int left = 0;
        int right = nums.length - 1;
        while(nums[left] != 0) {
            left++;
        }

        while(nums[right] == 0) {
            right--;
        }

        while(left < right) {
            if(nums[left] == 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
                right--;
            } else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
    }
}

//leetcode能过的答案
//        if(nums == null || nums.length <= 1) {
//            return;
//        }
//
//        for(int i = 0; i < nums.length - 1; i++) {
//            if(nums[i] == 0) {
//                for(int j = i+1; j < nums.length; j++) {
//                    if(nums[j] != 0) {
//                        nums[i] = nums[j];
//                        nums[j] = 0;
//                        break;
//                    }
//                }
//            }
//        }
