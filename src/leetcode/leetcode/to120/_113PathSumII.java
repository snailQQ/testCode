package leetcode.leetcode.to120;

import java.util.ArrayList;
import java.util.List;
import leetcode.leetcode.TreeNode;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 5
 / \
 4   8
 /   / \
 11  13  4
 /  \    / \
 7    2  5   1
 return
 [
 [5,4,11,2],
 [5,8,4,5]
 ]
 * answer link
 */
public class _113PathSumII {
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    ArrayList<Integer> solution = new ArrayList<Integer>();
    helper(result,solution,root,sum);
    return result;
  }

  public void helper(List<List<Integer>> result, ArrayList<Integer> solution, TreeNode node, int sum) {
    if(node == null) {
      return;
    }

    sum -= node.val;

    if(node.left == null && node.right == null) {
      if(sum == 0) {
        solution.add(node.val);
        result.add(new ArrayList<Integer>(solution));
        solution.remove(solution.size() - 1);
      }
    }

    solution.add(node.val);
    helper(result, solution, node.left, sum);
    helper(result, solution, node.right, sum);
    solution.remove(solution.size() - 1);
  }
}
