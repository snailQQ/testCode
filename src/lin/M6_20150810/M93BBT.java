package lin.M6_20150810;

import java.util.ArrayList;

/**
 * Created by Paul on 8/9/15.
 * http://www.lintcode.com/en/problem/balanced-binary-tree/
 */
//Balanced Binary Tree
//
//        40% Accepted
//        Given a binary tree, determine if it is height-balanced.
//
//        For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given binary tree A={3,9,20,#,#,15,7}, B={3,#,20,15,7}
//
//        A)  3            B)    3
//        / \                  \
//        9  20                 20
//        /  \                / \
//        15   7              15  7
//        The binary tree A is a height-balanced binary tree, but B is not.
public class M93BBT {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static int checkBalanced(TreeNode t){
        if(t==null)
            return 0;

        int leftheight = checkBalanced(t.left);
        if(leftheight == -1)
            return -1;

        int rightheight = checkBalanced(t.right);
        if(rightheight == -1)
            return -1;

        if(Math.abs(leftheight-rightheight)>1)
            return -1;
        else
            return Math.max(leftheight,rightheight)+1;
    }

    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public static boolean isBalanced(TreeNode root) {
        // write your code here
        if(checkBalanced(root) == -1)
            return false;
        else
            return true;
    }

    public static void main(String [] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        e.left = f;
        e.right = g;
        b.left = c;
        b.right = d;
        a.left = b;
        a.right = e;
        boolean ss = isBalanced(a);
    }
}
