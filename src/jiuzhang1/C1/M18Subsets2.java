package jiuzhang1.C1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Paul on 8/10/15.
 * http://www.lintcode.com/en/problem/subsets-ii/
 */
//Subsets II
//
//        24% Accepted
//        Given a list of numbers that may has duplicate numbers, return all possible subsets
//
//        Have you met this question in a real interview? Yes
//        Example
//        If S = [1,2,2], a solution is:
//
//        [
//        [2],
//        [1],
//        [1,2,2],
//        [2,2],
//        [1,2],
//        []
//        ]
//        Note
//        Each element in a subset must be in non-descending order.
//
//        The ordering between two subsets is free.
//
//        The solution set must not contain duplicate subsets.
public class M18Subsets2 {
    /** @param S: A set of numbers.
            * @return: A list of lists. All valid subsets.
    */
    public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
        if(S == null || S.size() == 0){
            return returnList;
        }
        int size = S.size();
        Collections.sort(S);
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        dfsHelper(returnList, tmp, S, 0);
        return returnList;

    }

    private static void dfsHelper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tmp, ArrayList<Integer> S, int position) {
        result.add(new ArrayList<Integer>(tmp));
        for(int i = position; i < S.size(); i++) {
            if(i != position && S.get(i) == S.get(i-1)) {
                continue;
            }
            tmp.add(S.get(i));
            dfsHelper(result, tmp, S, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String [] args) {
        ArrayList<Integer> S = new ArrayList<Integer>();
        S.add(2);
        S.add(2);
        S.add(1);
        ArrayList<ArrayList<Integer>> result = subsetsWithDup(S);
    }
}
