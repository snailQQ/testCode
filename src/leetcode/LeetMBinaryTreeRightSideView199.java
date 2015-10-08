package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Paul on 10/5/15.
 */
public class LeetMBinaryTreeRightSideView199 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            int size = stack.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = stack.pop();
                if(i == 0) {
                    list.add(node.val);
                }
                if(node.left != null) {
                    stack.push(node.left);
                }
                if(node.right != null) {
                    stack.push(node.right);
                }

            }
        }
        return list;
    }

    public static void main(String [] args) {
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
        List<Integer> ss = rightSideView(a);
    }
}
