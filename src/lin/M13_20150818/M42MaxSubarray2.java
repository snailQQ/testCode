package lin.M13_20150818;

import java.util.ArrayList;

/**
 * Created by Paul on 8/17/15.
 * http://www.lintcode.com/en/problem/maximum-subarray-ii/
 */
//Maximum Subarray II
//
//        24% Accepted
//        Given an array of integers, find two non-overlapping subarrays which have the largest sum.
//
//        The number in each subarray should be contiguous.
//
//        Return the largest sum.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For given [1, 3, -1, 2, -1, 2], the two subarrays are [1, 3] and [2, -1, 2] or [1, 3, -1, 2] and [2], they both have the largest sum 7.
//
//        Note
//        The subarray should contain at least one number
//
//        Challenge
//        Can you do it in time complexity O(n) ?
public class M42MaxSubarray2 {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public static int maxTwoSubArrays(ArrayList<Integer> nums) {
        // write your code
        if(nums == null || nums.size() == 0) {
            return Integer.MIN_VALUE;
        }

        int[] dpL = new int[nums.size()];
        int[] dpR = new int[nums.size()];
        dpL[0] = nums.get(0);
        dpR[nums.size() - 1] = nums.get(nums.size() - 1);

        for(int i = 1; i < nums.size(); i++) {
            if(dpL[i-1] > 0) {
                dpL[i] = nums.get(i) + dpL[i-1];
            }else{
                dpL[i] = nums.get(i);
            }
        }

        for(int i = nums.size() - 2; i >= 0; i--) {
            if(dpR[i+1] > 0) {
                dpR[i] = nums.get(i) + dpR[i+1];
            }else{
                dpR[i] = nums.get(i);
            }
        }



        for(int i = 1; i < nums.size(); i++) {
            if(dpL[i] < dpL[i-1]) {
                dpL[i] = dpL[i-1];
            }
        }

        for(int i = nums.size() - 2; i >= 0; i--) {
            if(dpR[i] < dpR[i+1]) {
                dpR[i] = dpR[i+1];
            }
        }

        int max = dpL[0] + dpR[1];

        for(int i = 1; i <= nums.size() - 2; i++) {
            int sum = dpR[i+1] + dpL[i];
            max = max < sum ? sum : max;
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(-1);
        nums.add(0);
        nums.add(1);
//        nums.add(1);
//        nums.add(3);
//        nums.add(-1);
//        nums.add(2);
//        nums.add(-1);
//        nums.add(2);
        int b = maxTwoSubArrays(nums);
    }
}
