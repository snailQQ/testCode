package lin.E3_20150805;

import java.util.ArrayList;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/recover-rotated-sorted-array/
 */
//Recover Rotated Sorted Array
//
//        25% Accepted
//        Given a rotated sorted array, recover it to sorted array in-place.
//
//        Have you met this question in a real interview? Yes
//        Example
//        [4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]
//
//        Challenge
//        In-place, O(1) extra space and O(n) time.
//
//        Clarification
//        What is rotated array?
//
//        For example, the orginal array is [1,2,3,4], The rotated array of it can be [1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]

public class E39RecoverRotatedSortedArray {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public static void recoverRotatedSortedArray(ArrayList<Integer> nums) {

        // write your code
        if(nums == null) {
            return;
        }

        Integer pre = nums.get(0);
        ArrayList<Integer> start = new ArrayList<Integer>();
        ArrayList<Integer> end = new ArrayList<Integer>();

        for(Integer element : nums) {
            if(element < pre) {
               start.add(element);

            }else {
                if(start.size() != 0) {
                    start.add(element);
                }else {
                    end.add(element);
                }
            }
            pre = element;
        }

        start.addAll(end);
        nums.clear();
        nums.addAll(start);
    }

    public static void main(String [] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        recoverRotatedSortedArray(nums);
    }
}
