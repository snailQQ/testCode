package lin.M15_20150820;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/permutations-ii/
 */
//Permutations II
//
//        23% Accepted
//        Given a list of numbers with duplicate number in it. Find all unique permutations.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For numbers [1,2,2] the unique permutations are:
//
//        [
//
//        [1,2,2],
//
//        [2,1,2],
//
//        [2,2,1]
//
//        ]
//
//        Challenge
//        Do it without recursion.
public class M16Permutations2 {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> newList = new ArrayList<Integer>();
        if(nums == null || nums.size() == 0) {
            return rst;
        }
        Collections.sort(nums);
        DFSHelper(rst, newList, nums);
        return rst;
    }

    private void DFSHelper(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> newList, ArrayList<Integer> nums) {
        if(newList.size() == nums.size()) {
            rst.add(new ArrayList<Integer>(newList));
            return;
        }

        for(int i = 0; i < nums.size(); i++) {
            if(i != 0 && nums.get(i) == nums.get(i-1)) {
                continue;
            }
            if(newList.contains(nums.get(i))){
                continue;
            }
            newList.add(nums.get(i));
            DFSHelper(rst, newList, nums);
            newList.remove(newList.size() - 1);
        }
    }
}
