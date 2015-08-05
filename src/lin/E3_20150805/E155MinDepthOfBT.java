package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/minimum-depth-of-binary-tree/
 */
//Minimum Depth of Binary Tree
//
//        32% Accepted
//        Given a binary tree, find its minimum depth.
//
//        The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given a binary tree as follow:
//
//        1
//
//        /     \
//
//        2       3
//
//        /    \
//
//        4      5
//
//        The minimum depth is 2
public class E155MinDepthOfBT {
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
//    public int minDepth(TreeNode root) {
//        // write your code here
//    }
}
