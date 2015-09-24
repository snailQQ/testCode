package leetcode;

/**
 * Created by Paul on 9/22/15.
 */
//Same Tree My Submissions Question Solution
//        Total Accepted: 81094 Total Submissions: 194845 Difficulty: Easy
//        Given two binary trees, write a function to check if they are equal or not.
//
//        Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
//
//        Hide Tags Tree Depth-first Search

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class LeetE100SameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        if(p == null && q != null) {
            return false;
        }

        if(p != null && q == null) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        if(left && right && p.val == q.val) {
            return true;
        }
        return false;
    }
}
