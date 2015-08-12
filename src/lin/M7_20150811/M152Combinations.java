package lin.M7_20150811;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 8/10/15.
 * http://www.lintcode.com/en/problem/combinations/
 */
//Combinations
//
//        32% Accepted
//        Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For example,
//        If n = 4 and k = 2, a solution is:
//        [[2,4],[3,4],[2,3],[1,2],[1,3],[1,4]]


public class M152Combinations {
    /**
     * @param n: Given the range of numbers
     * @param k: Given the numbers of combinations
     * @return: All the combinations of k numbers out of 1..n
     */
    public static List<List<Integer>> combine(int n, int k) {
        // write your code here
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(n <= 0 || k == 0) {
            return rst;
        }
        List<Integer> tmp = new ArrayList<Integer>();
        dfsHelper(rst, tmp, n, k, 1);
        return rst;
    }

    private static void dfsHelper(List<List<Integer>> rst, List<Integer> tmp, int n, int k, int pos) {
        if(tmp.size() == k) {
            rst.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int i = pos; i <= n; i++) {
            tmp.add(i);
            dfsHelper(rst, tmp, n, k, i + 1);
            tmp.remove(tmp.size() - 1);
        }

    }

    public static void main(String [] args) {
        List<List<Integer>> rst = combine(4,2);
    }

}
