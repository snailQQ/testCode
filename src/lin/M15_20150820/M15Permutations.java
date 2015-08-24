package lin.M15_20150820;

import java.util.*;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/permutations/
 * http://www.cnblogs.com/springfor/p/3888044.html
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
//    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
//        // write your code here
//        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> newList = new ArrayList<Integer>();
//        if(nums == null || nums.size() == 0) {
//            return rst;
//        }
//        Collections.sort(nums);
//        DFSHelper(rst, newList, nums);
//        return rst;
//    }
//
//    private void DFSHelper(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> newList, ArrayList<Integer> nums) {
//        if(newList.size() == nums.size()) {
//            rst.add(new ArrayList<Integer>(newList));
//            return;
//        }
//
//        for(int i = 0; i < nums.size(); i++) {
//            if(newList.contains(nums.get(i))){
//                continue;
//            }
//            newList.add(nums.get(i));
//            DFSHelper(rst, newList, nums);
//            newList.remove(newList.size() - 1);
//        }
//    }

    //leetcode version
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rst = new LinkedList<List<Integer>>();
        List<Integer> newList = new LinkedList<Integer>();

        if(nums == null || nums.length == 0) {
            return rst;
        }
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        DFSHelper(rst, newList, nums, visited);
        return rst;
    }

    private void DFSHelper(List<List<Integer>> rst, List<Integer> newList, int[] nums, boolean[] visited) {
        if(newList.size() == nums.length) {
            rst.add(new LinkedList<Integer>(newList));
        }

        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]){
                newList.add(nums[i]);
                visited[i]=true;
                DFSHelper(rst, newList, nums, visited);
                newList.remove(newList.size()-1);
                visited[i]=false;
            }
        }
    }

}
