package lin.M9_20150813;

/**
 * Created by Paul on 8/12/15.
 * http://www.lintcode.com/en/problem/find-the-missing-number/
 */
//Find the Missing Number
//
//        28% Accepted
//        Given an array contains N numbers of 0 .. N, find which number doesn't exist in the array.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given N = 3 and the array [0, 1, 3], return 2.
//
//        Challenge
//        Do it in-place with O(1) extra memory and O(n) time.
public class M196FindTheMissingNumber {
    /**
     * @param nums: an array of integers
     * @return: an integer
     */
    public static int findMissing(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            int maxValue = Integer.MAX_VALUE;
            return maxValue;
        }
        int size = nums.length;
        int sum = 0;
        int sum1= 0;
        for(int i = 0; i < nums.length+1; i++) {
            sum += i;
        }

        for(int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }
        return sum-sum1;
    }

    public static void main(String [] args) {
        int[] a = {0, 1, 3};
        int b = findMissing(a);
    }
}
