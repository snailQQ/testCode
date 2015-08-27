package lin.M7_20150811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Paul on 8/10/15.
 * http://www.lintcode.com/en/problem/binary-tree-zigzag-level-order-traversal/
 */
//Binary Tree Zigzag Level Order Traversal
//
//        28% Accepted
//        Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
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
//        return its zigzag level order traversal as:
//
//        [
//        [3],
//        [20,9],
//        [15,7]
//        ]
public class M71BinaryTreeZigzaglevelOrderTraversal {
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
     * @return: A list of lists of integer include
     *          the zigzag level order traversal of its nodes' values
     */
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(root == null) {
            return rst;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean flg = true; //true means from left to right, false means from right to left

        while(!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            Stack<Integer> stack = new Stack<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(flg){
                    list.add(node.val);
                }else{
                    stack.push(node.val);
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            while(!stack.isEmpty()) {
               list.add(stack.pop());
            }
            if(flg) {
                flg = false;
            }else{
                flg = true;
            }

            if(!list.isEmpty()) {
                rst.add(list);
            }

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
        ArrayList<ArrayList<Integer>> ss = zigzagLevelOrder(a);
    }
}
