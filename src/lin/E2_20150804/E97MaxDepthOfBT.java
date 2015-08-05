package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/maximum-depth-of-binary-tree/
 */
//
//Maximum Depth of Binary Tree
//
//        55% Accepted
//        Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given a binary tree as follow:
//
//        1
//        / \
//        2   3
//        / \
//        4   5
//        The maximum depth is 3.


public class E97MaxDepthOfBT {
    /**
     * Definition of TreeNode:
     * public class TreeNode {
     *     public int val;
     *     public TreeNode left, right;
     *     public TreeNode(int val) {
     *         this.val = val;
     *         this.left = this.right = null;
     *     }
     * }
     */
    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
        /**
         * @param root: The root of binary tree.
         * @return: An integer.
         */
        public int maxDepth(TreeNode root) {
            // write your code here
            if (root == null) {
                return 0;
            }

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
}
