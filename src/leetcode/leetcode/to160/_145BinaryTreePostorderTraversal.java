package leetcode.leetcode.to160;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import leetcode.leetcode.TreeNode;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 * <p/>
 * Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [3,2,1].

 Note: Recursive solution is trivial, could you do it iteratively?
 * answer link
 */
public class _145BinaryTreePostorderTraversal {
  public List<Integer> postorderTraversal1(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if(root == null) {
      return result;
    }
    List<Integer> left = postorderTraversal1(root.left);
    List<Integer> right = postorderTraversal1(root.right);
    result.addAll(left);
    result.addAll(right);
    result.add(root.val);
    return result;
  }

  public List<Integer> postorderTraversal2(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if(root == null) {
      return result;
    }
    Stack<TreeNode> stack = new Stack<TreeNode>();

    TreeNode previousNode = null;
    TreeNode currentNode = root;
    stack.push(root);

    while(!stack.isEmpty()) {
      currentNode = stack.peek();
      if(previousNode == null || previousNode.left == null || previousNode.right == null) {
        if(currentNode.left != null) {
          stack.push(currentNode.left);
        } else if(currentNode.right != null) {
          stack.push(currentNode.right);
        }
      } else if(currentNode.left == previousNode ) {
        if(currentNode.right != null) {
          stack.push(currentNode.right);
        }
      } else {
        result.add(currentNode.val);
        stack.pop();
      }
      previousNode = currentNode;
    }
    return result;
  }

  public List<Integer> postorderTraversal3(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if(root == null) {
      return result;
    }
    Stack<TreeNode> stack = new Stack<TreeNode>();

    TreeNode priviousNode = null;
    while(root != null || !stack.isEmpty()) {
      if(root != null) {
        stack.push(root);
        root = root.left;
      } else {
        TreeNode peekNode = stack.peek();
        if(peekNode.right != null && priviousNode != peekNode.right) {
          root = peekNode.right;
        } else {
          result.add(peekNode.val);
          stack.pop();
          priviousNode = peekNode;
        }
      }

    }

    return result;
  }
}
