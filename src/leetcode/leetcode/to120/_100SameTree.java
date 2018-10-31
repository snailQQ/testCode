package leetcode.leetcode.to120;

import leetcode.leetcode.TreeNode;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/same-tree/description/
 * <p/>
 * Given two binary trees, write a function to check if they are equal or not.

 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * answer link
 */
public class _100SameTree {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) {
      return true;
    }

    if(p == null || q == null) {
      return false;
    }

    return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

  }
}
