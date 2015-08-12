package lin.M7_20150811;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 8/10/15.
 */
//Combination Sum
//
//        27% Accepted
//        Given a set of candidate numbers (C) and a target number (T),
// find all unique combinations in C where the candidate numbers sums to T.
//
//        The same repeated number may be chosen from C unlimited number of times.
//
//
//
//        For example, given candidate set 2,3,6,7 and target 7,
//        A solution set is:
//        [7]
//        [2, 2, 3]
//
//        Have you met this question in a real interview? Yes
//        Example
//        given candidate set 2,3,6,7 and target 7,
//        A solution set is:
//        [7]
//        [2, 2, 3]
//
//        Note
//        All numbers (including target) will be positive integers.
//        Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
//        The solution set must not contain duplicate combinations.
public class M135CombinationSum {
    /**
     * @param candidates: A list of integers
     * @param target:An integer
     * @return: A list of lists of integers
     */
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        // write your code here
//        List<List<Integer>> rst = new ArrayList<List<Integer>>();
//        if(candidates == null || candidates.length == 0) {
//            return rst;
//        }
//        List<Integer> tmp = new ArrayList<Integer>();
//        dfsHelper(rst, tmp, candidates, 0);
//        return rst;
//    }

//    private static void dfsHelper(List<List<Integer>> rst, List<Integer> tmp, int[] candidates, int pos) {
//        rst.add(new ArrayList<Integer>(tmp));
//        if()
//    }
}


//public class Solution {
//    public  ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        if (candidates == null) {
//            return result;
//        }
//
//        ArrayList<Integer> path = new ArrayList<Integer>();
//        Arrays.sort(candidates);
//        helper(candidates, target, path, 0, result);
//
//        return result;
//    }
//
//    void helper(int[] candidates, int target, ArrayList<Integer> path, int index,
//                ArrayList<ArrayList<Integer>> result) {
//        if (target == 0) {
//            result.add(new ArrayList<Integer>(path));
//            return;
//        }
//
//        int prev = -1;
//        for (int i = index; i < candidates.length; i++) {
//            if (candidates[i] > target) {
//                break;
//            }
//
//            if (prev != -1 && prev == candidates[i]) {
//                continue;
//            }
//
//            path.add(candidates[i]);
//            helper(candidates, target - candidates[i], path, i, result);
//            path.remove(path.size() - 1);
//
//            prev = candidates[i];
//        }
//    }
//}