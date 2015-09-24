package lin.M15_20150820;

import java.util.ArrayList;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/previous-permutation/
 */
//Previous Permutation
//
//        27% Accepted
//        Given a list of integers, which denote a permutation.
//
//        Find the previous permutation in ascending order.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For [1,3,2,3], the previous permutation is [1,2,3,3]
//
//        For [1,2,3,4], the previous permutation is [4,3,2,1]
//
//        Note
//        The list may contains duplicate integers.
public class M51PreviousPermutation {
    /**
     * @param nums: A list of integers
     * @return: A list of integers that's previous permuation
     */
    public ArrayList<Integer> previousPermuation(ArrayList<Integer> nums) {
        // write your code
        if(nums == null || nums.size() < 2) {
            return nums;
        }
        int len = nums.size();
        int p = len - 2;
        while(p > 0 && nums.get(p) <= nums.get(p+1)) {
            p--;
        }

        if(p == 0 && nums.get(p) <= nums.get(p+1)){
            reverse(nums, 0, len-1);
            return nums;
        } else {
            int p2 = p+1;
            while(p2 < len && nums.get(p2) < nums.get(p)){
                p2++;
            }
            p2--;
            swap(nums, p, p2);
            reverse(nums, p+1, len-1);
            return nums;
        }
    }

    private void swap(ArrayList<Integer> nums, int a, int b) {
        int temp = nums.get(a);
        nums.set(a,nums.get(b));
        nums.set(b,temp);
    }

    private void reverse(ArrayList<Integer> nums, int start, int end) {
        while(start < end) {
            swap(nums, start++, end--);
        }
    }
}
