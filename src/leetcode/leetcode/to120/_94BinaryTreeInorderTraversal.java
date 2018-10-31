package leetcode.leetcode.to120;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import leetcode.leetcode.TreeNode;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * <p/>
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
 \
 2
 /
 3
 return [1,3,2].

 Note: Recursive solution is trivial, could you do it iteratively?
 * answer link
 */
public class _94BinaryTreeInorderTraversal {
  public List<Integer> inorderTraversal1(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if(root == null) {
      return result;
    }
    List<Integer> left = inorderTraversal1(root.left);
    List<Integer> right = inorderTraversal1(root.right);
    result.addAll(left);
    result.add(root.val);
    result.addAll(right);
    return result;
  }


  public List<Integer> inorderTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    List<Integer> result = new ArrayList<Integer>();
    if(root == null) {
      return result;
    }
    TreeNode tmp = root;
    while(tmp != null || !stack.isEmpty()) {
      while(tmp != null) {
        stack.add(tmp);
        tmp = tmp.left;
      }
      tmp = stack.pop();
      result.add(tmp.val);
      tmp = tmp.right;
    }

    return result;
  }
}
