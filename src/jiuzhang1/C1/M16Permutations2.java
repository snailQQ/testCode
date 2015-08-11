package jiuzhang1.C1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Paul on 8/10/15.
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

public class M16Permutations2 {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(nums == null || nums.size() == 0) {
            return rst;
        }
        Collections.sort(nums);
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        boolean[] visit = new boolean[nums.size()];
        dfsHelper(rst, tmp, nums, visit);
        return rst;
    }

    private void dfsHelper(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> tmp, ArrayList<Integer> nums, boolean[] visit) {
        if(tmp.size() ==  nums.size()) {
            rst.add(new ArrayList<Integer>(tmp));
        }
        for(int i = 0; i < nums.size(); i++) {
            if(visit[i] == true || (i != 0 && nums.get(i) == nums.get(i-1) && visit[i - 1] == false)){
                continue;
            }
            tmp.add(nums.get(i));
            visit[i] = true;
            dfsHelper(rst, tmp, nums, visit);
            tmp.remove(tmp.size() - 1);
            visit[i] = false;

        }
    }
}
