package jiuzhang1.C1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Paul on 8/8/15.
 * http://www.lintcode.com/en/problem/subsets/
 * http://blog.csdn.net/u011095253/article/details/9158397
 * http://128kj.iteye.com/blog/1701628
 */
//Subsets
//
//        22% Accepted
//        Given a set of distinct integers, return all possible subsets.
//
//        Have you met this question in a real interview? Yes
//        Example
//        If S = [1,2,3], a solution is:
//
//        [
//        [3],
//        [1],
//        [2],
//        [1,2,3],
//        [1,3],
//        [2,3],
//        [1,2],
//        []
//        ]
//        Note
//        Elements in a subset must be in non-descending order.
//
//        The solution set must not contain duplicate subsets.
public class M17Subsets {
    /**
//     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
//    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
//        // write your code here
//        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
//        if (S == null) {
//            return res;
//        }
//
//        int size = S.size();
//
//        Collections.sort(S);
//        ArrayList<Integer> tempList = new ArrayList<Integer>();
//
//        for (int i = 0; i <= size; i++) {
//            dfsHelper(res, i, S, tempList, 0);
//        }
//
//        return res;
//    }
//
//    public void dfsHelper(ArrayList<ArrayList<Integer>> res, int len, ArrayList<Integer> nums, ArrayList<Integer> tempList,
//                          int index) {
//        if (tempList.size() == len) {
//            res.add(new ArrayList<Integer>(tempList));
//            return;
//        } else if (index == nums.size()) {
//            return;
//        }
//
//        for (int i = index; i < nums.size(); i++) {
//            int n = nums.get(i);
//            tempList.add(n);
//            dfsHelper(res, len, nums, tempList, i + 1);
//            tempList.remove(tempList.size() - 1);
//        }
//    }

//    public static ArrayList<ArrayList<Integer>> subsets(int[] num) {
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        if(num == null || num.length == 0) {
//            return result;
//        }
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        Arrays.sort(num);
//        subsetsHelper(result, list, num, 0);
//
//        return result;
//    }
//
//
//    private static void subsetsHelper(ArrayList<ArrayList<Integer>> result,
//                                      ArrayList<Integer> list, int[] num, int pos) {
//
//        result.add(new ArrayList<Integer>(list));
//
//        for (int i = pos; i < num.length; i++) {
//
//            list.add(num[i]);
//            subsetsHelper(result, list, num, i + 1);
//            list.remove(list.size() - 1);
//        }
//    }

    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if (num == null || num.length == 0) {
            return rst;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(rst, list, num);
        return rst;
    }

    public static void helper(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> list, int[] num){
        if(list.size() == num.length) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = 0; i<num.length; i++){
            if(list.contains(num[i])){
                continue;
            }
            list.add(num[i]);
            helper(rst, list, num);
            list.remove(list.size() - 1);
        }

    }

    public static void main(String [] args) {
        int[] nums = {1,2,3,4};
        ArrayList<ArrayList<Integer>> a = permute(nums);
    }
}
