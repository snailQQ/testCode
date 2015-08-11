package jiuzhang1.C1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Paul on 8/10/15.
 * http://lintcode.com/problem/permutations/
 */
//Permutations
//
//        24% Accepted
//        Given a list of numbers, return all possible permutations.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For nums = [1,2,3], the permutations are:
//
//        [
//        [1,2,3],
//        [1,3,2],
//        [2,1,3],
//        [2,3,1],
//        [3,1,2],
//        [3,2,1]
//        ]
//        Challenge
//        Do it without recursion.
public class M15Permutations {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(nums == null || nums.size() == 0) {
            return rst;
        }
        boolean[] visit = new boolean[nums.size()];
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        Collections.sort(nums);
        dfsHelper(rst, tmp, nums, visit);
        return rst;
    }

    private static void dfsHelper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, ArrayList<Integer> nums, boolean[] visit){
        if(tmp.size() == nums.size()) {
            res.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int i = 0; i< nums.size(); i++) {
            if(visit[i] == false) {
                tmp.add(nums.get(i));
                visit[i] = true;
                dfsHelper(res, tmp, nums, visit);
                tmp.remove(tmp.size() - 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String [] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(0);
        ArrayList<ArrayList<Integer>> res = permute(nums);
    }
}
