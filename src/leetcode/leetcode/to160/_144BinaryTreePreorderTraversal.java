package leetcode.leetcode.to160;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import leetcode.leetcode.TreeNode;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/binary-tree-preorder-traversal/description/
 * <p/>
 * Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [1,2,3].

 Note: Recursive solution is trivial, could you do it iteratively?
 * answer link
 */
public class _144BinaryTreePreorderTraversal {
  public List<Integer> preorderTraversal1(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if(root == null) {
      return result;
    }

    List<Integer> left = preorderTraversal1(root.left);
    List<Integer> right = preorderTraversal1(root.right);

    result.add(root.val);
    result.addAll(left);
    result.addAll(right);

    return result;
  }

  public static List<Integer> preorderTraversal2(TreeNode root) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    List<Integer> result = new ArrayList<Integer>();

    stack.add(root);
    while(!stack.isEmpty()) {
      TreeNode tmp = stack.pop();
      result.add(tmp.val);

      if(tmp.right != null) {
        stack.add(tmp.right);
      }
      if(tmp.left != null) {
        stack.add(tmp.left);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(5);
    TreeNode f = new TreeNode(6);
    TreeNode g = new TreeNode(7);
    c.left = d;
    a.left = b;
    a.right = c;
    List<Integer> ss = preorderTraversal2(a);
    for(int aValue : ss) {
      System.out.println(aValue);
    }
  }
}
