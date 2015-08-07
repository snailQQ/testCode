package lin.E5_20150807;

import java.util.ArrayList;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/subarray-sum/
 */
//Subarray Sum
//
//        23% Accepted
//        Given an integer array, find a subarray where the sum of numbers is zero.
// Your code should return the index of the first number and the index of the last number.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3].
//
//        Note
//        There is at least one subarray that it's sum equals to zero.
public class E138SubarraySum {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number
     *          and the index of the last number
     */
    public static ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        if(nums == null || nums.length == 0) {
            return  returnList;
        }
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == 0) {
//                    for(int k = i; k <= j; k++){
//                        returnList.add(nums[k]);
//                    }
                    return returnList;
                }
            }
        }
        return returnList;
    }

    public static void main(String [] args) {
//        int[] nums = {-3, 1, 2, -3, 4};
        int[] nums = {-5,10,5,-3,1,1,1,-2,3,-4};
        ArrayList<Integer> aa = subarraySum(nums);
    }
}
