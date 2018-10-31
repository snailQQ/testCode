package leetcode.leetcode.to120;

import leetcode.leetcode.TreeNode;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/balanced-binary-tree/description/
 * <p/>
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * answer link
 */
public class _110BalancedBinaryTree {
  public boolean isBalanced1(TreeNode root) {
    return maxDepth(root) != -1;
  }

  public int maxDepth(TreeNode node) {
    if(node == null) {
      return 0;
    }
    int left = maxDepth(node.left);
    int right = maxDepth(node.right);
    if(left == -1 || right == -1 || Math.abs(left-right) > 1) {
      return -1;
    }
    return Math.max(left, right) + 1;
  }
}
