package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-array-ii/
 * http://bangbingsyb.blogspot.com/2014/11/leetcode-remove-duplicates-from-sorted.html
 */
//Remove Duplicates from Sorted Array II
//
//        30% Accepted
//        Follow up for "Remove Duplicates":
//        What if duplicates are allowed at most twice?
//
//        For example,
//        Given sorted array A = [1,1,1,2,2,3],
//
//        Your function should return length = 5, and A is now [1,1,2,2,3].
//
//        Have you met this question in a real interview? Yes

public class E101RemoveDupFromSortedArray2 {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public static int removeDuplicates(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int returnLength = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[returnLength] == nums[i]){
                if(count == 0) {
                    count ++;
                }else if(count == 1) {
                    count ++;
                    nums[++returnLength] = nums[i];
                }else {
                    continue;
                }
            }else{
                nums[++returnLength] = nums[i];
                count = 1;
            }
        }
        return returnLength + 1;

    }

    public static void main(String [] args) {
//        int[] nums = {-8,0,1,2,3};
        int[] nums = {-14,-14,-13,-13,-13,-13,-13,-13,-13,-12,-12,-12,-12,-11,-10,-9,-9,-9,-8,-7,-5,-5,-5,-5,
                -4,-3,-3,-2,-2,-2,-2,-1,-1,-1,-1,-1,0,1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6,6,6,7,8,8,8,9,9,9,
                10,10,10,11,11,11,12,12,12,13,14,14,14,14,15,16,16,16,18,18,18,19,19,19,19,20,20,20,21,21,21,21,
                21,21,22,22,22,22,22,23,23,24,25,25};
        System.out.println(removeDuplicates(nums));
    }
}

//
//{-14,-14,-13,-13,-12,-12,-11,-10,-9,-9,
// -8,-7,-5,-5,-4,-3,-3,-2,-2,-1,
// -1,0,1,1,2,2,3,3,4,4,
// 5,5,6,6,7,8,8,9,9,10,
// 10,11,11,12,12,13,14,14,15,16,
// 16,18,18,19,19,20,20,21,21,22,
// 22,23,23,24,25,25
//        10,10,11,11,11,12,12,12,13,14,14,14,14,15,16,16,16,18,18,18,19,19,19,19,20,20,20,21,21,21,21,
//        21,21,22,22,22,22,22,23,23,24,25,25}