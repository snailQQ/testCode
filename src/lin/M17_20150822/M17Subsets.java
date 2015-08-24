package lin.M17_20150822;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Paul on 8/22/15.
 * http://www.lintcode.com/en/problem/subsets/
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
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(S == null || S.size() == 0) {
            return rst;
        }
        Collections.sort(S);
        ArrayList<Integer> list = new ArrayList<Integer>();
        DFSHelper(rst, list, S, 0);
        return rst;
    }

    private static  void DFSHelper(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> list, ArrayList<Integer> S, int pos) {
        rst.add(new ArrayList<Integer>(list));
        for(int i = pos; i < S.size(); i++) {
            list.add(S.get(i));
            DFSHelper(rst, list, S, i+1);
            list.remove(S.size() - 1);
        }
    }

    public static void main(String [] args) {
        ArrayList<Integer> S = new ArrayList<Integer>();
        S.add(0);
        ArrayList<ArrayList<Integer>> a = subsets(S);
    }
}
