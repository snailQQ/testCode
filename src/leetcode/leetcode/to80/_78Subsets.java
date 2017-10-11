package leetcode.leetcode.to80;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/subsets/description/
 * <p/>
 * Given a set of distinct integers, nums, return all possible subsets.

 Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,3], a solution is:

 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 * answer link
 */
public class _78Subsets {
  public static List<List<Integer>> subsets(int[] nums) {
    ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
    if(nums == null || nums.length == 0) {
      return result;
    }

    subsetsHelper(result, new ArrayList<Integer>(), nums, 0);

    return result;
  }

  private static void subsetsHelper(ArrayList<List<Integer>> result, List<Integer> list, int[] nums,
      int pos) {
    result.add(new ArrayList<Integer>(list));

    for(int i = pos; i < nums.length; i++) {
//      if(i != pos && nums[i] == nums[i-1]) {
//        continue;
//      }
      list.add(nums[i]);
      subsetsHelper(result, list, nums, i+1);
      list.remove(list.size() - 1);
    }
  }

  public static void main(String[] args) {
    int[] a = {1,2,3};
    List<List<Integer>> result = subsets(a);

    for(List<Integer> subList: result) {
      for(int element : subList) {
        System.out.print(element + " ");
      }
      System.out.println();
    }

  }
}
