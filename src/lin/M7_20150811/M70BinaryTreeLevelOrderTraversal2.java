package lin.M7_20150811;

import lin.E66BinaryTreePerorderT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Paul on 8/10/15.
 * http://www.lintcode.com/en/problem/binary-tree-level-order-traversal-ii/
 */

//Binary Tree Level Order Traversal II
//
//        41% Accepted
//        Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given binary tree {3,9,20,#,#,15,7},
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//
//
//        return its bottom-up level order traversal as:
//
//        [
//        [15,7],
//        [9,20],
//        [3]
//        ]
public class M70BinaryTreeLevelOrderTraversal2 {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    /**
     * @param root: The root of binary tree.
     * @return: buttom-up level order a list of lists of integer
     */
    public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(root == null) {
            return rst;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<ArrayList<Integer>> aStack = new Stack<ArrayList<Integer>>();

        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode aNode = queue.poll();
                list.add(aNode.val);
                if(aNode.left != null) {
                    queue.offer(aNode.left);
                }
                if(aNode.right != null) {
                    queue.offer(aNode.right);
                }
            }
            if(list.size() > 0) {
                aStack.push(list);
            }
        }

        while(!aStack.isEmpty()) {
            rst.add(aStack.pop());
        }
        return rst;
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
        ArrayList<ArrayList<Integer>> ss = levelOrderBottom(a);
    }
}
