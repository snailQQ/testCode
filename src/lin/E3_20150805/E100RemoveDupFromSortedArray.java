package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 */
//Remove Duplicates from Sorted Array
//http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-array/
//
//        32% Accepted
//        Given a sorted array,
// remove the duplicates in place such that each element appear only once and return the new length.
//
//        Do not allocate extra space for another array, you must do this in place with constant memory.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given input array A = [1,1,2],
//
//        Your function should return length = 2, and A is now [1,2].
public class E100RemoveDupFromSortedArray {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public static int removeDuplicates(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
           return 1;
        } else {
            int count = 1;
            int number = nums[0];
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] == number) {
                    continue;
                }else{
                    nums[count] = nums[i]; //将不重复的数字放到对应的数组单元里
                    count++;
                    number = nums[i];
                }
            }
            return count;
        }
    }

    public static void main(String [] args) {
        int[] nums = {-14,-14,-13,-13,-13,-13,-13,-13,-13,-12,-12,-12,-12,-11,-10,-9,-9,-9,-8,-7,-5,-5,-5,-5,
                -4,-3,-3,-2,-2,-2,-2,-1,-1,-1,-1,-1,0,1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6,6,6,7,8,8,8,9,9,9,
                10,10,10,11,11,11,12,12,12,13,14,14,14,14,15,16,16,16,18,18,18,19,19,19,19,20,20,20,21,21,21,21,
                21,21,22,22,22,22,22,23,23,24,25,25};
        System.out.println(removeDuplicates(nums));
    }
}
//if (A == null || A.length == 0) {
//        return 0;
//        }
//
//        int size = 0;
//        for (int i = 0; i < A.length; i++) {
//        if (A[i] != A[size]) {
//        A[++size] = A[i];
//        }
//        }
//        return size + 1;