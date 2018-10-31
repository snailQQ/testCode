package leetcode.leetcode.to120;

import leetcode.leetcode.TreeNode;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

 1
 / \
 2   2
 / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
 1
 / \
 2   2
 \   \
 3    3
 Note:
 Bonus points if you could solve it both recursively and iteratively.
 * answer link
 */
public class _101SymmetricTree {
  public boolean isSymmetric(TreeNode root) {
    if(root == null) {
      return true;
    }
    return helper(root.left, root.right);
  }

  public boolean helper(TreeNode left, TreeNode right) {
    if(left == null && right == null) {
      return true;
    }
    if(left == null || right == null) {
      return false;
    }
    return (left.val == right.val) && helper(left.left, right.right) && helper(left.right, right.left);
  }
}
