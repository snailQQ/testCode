package lin.M16_20150821;

import java.util.ArrayList;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/single-number-iii/
 */
//Single Number III
//
//        33% Accepted
//        Given 2*n + 2 numbers, every numbers occurs twice except two, find them.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1,2,2,3,4,4,5,3] return 1 and 5
//
//        Challenge
//        O(n) time, O(1) extra space.
public class M84SingleNumber3 {
    /**
     * @param A : An integer array
     * @return : Two integers
     */
    public static int[] singleNumberIII(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return nums;
        }

        int[] rst = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i])) {
                list.remove(list.indexOf(nums[i]));
            } else {
                list.add(nums[i]);
            }
        }
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++) {

            rst[i] = list.get(i);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] a = singleNumberIII(new int[]{1,2,1,3,5,2});
    }
}
