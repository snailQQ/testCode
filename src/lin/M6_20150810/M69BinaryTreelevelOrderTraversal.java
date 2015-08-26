package lin.M6_20150810;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Paul on 8/9/15.
 */
//Binary Tree Level Order Traversal
//
//        32% Accepted
//        Given a binary tree, return the level order traversal of its nodes' values.
// (ie, from left to right, level by level).
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
//        return its level order traversal as:
//
//        [
//        [3],
//        [9,20],
//        [15,7]
//        ]
public class M69BinaryTreelevelOrderTraversal {
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
     * @return: Level order a list of lists of integer
     */
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(root == null) {
            return rst;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int count = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < count; i++) {
                TreeNode aNode = queue.poll();
                list.add(aNode.val);
                if(aNode.left != null) {
                    queue.offer(aNode.left);
                }
                if(aNode.right != null) {
                    queue.offer(aNode.right);
                }
            }
            if(list.size() >0){
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
        ArrayList<ArrayList<Integer>> ss = levelOrder(a);
    }
}
