package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 10/5/15.
 */
public class LeetMCombinationSumIII216 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(k > n) {
            return list;
        }
        List<Integer> newList = new ArrayList<Integer>();
        DFS(k, n, list, newList, 0, 0);
        return list;
    }

    private static void DFS(int k, int n, List<List<Integer>> list, List<Integer> newList, int start, int sum) {
        if(newList.size() == k && n == sum) {
            list.add(new ArrayList<Integer>(newList));
            return;
        }
        for(int i = start; i < 9; i++) {
            if(newList.size() < k && n > sum) {
                newList.add(i + 1);
                DFS(k, n, list, newList, i + 1, sum+i+1);
                newList.remove(newList.size() - 1);
            }
            if(newList.size() == k) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = combinationSum3(3,9);
    }
}
