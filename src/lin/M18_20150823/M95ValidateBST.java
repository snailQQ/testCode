package lin.M18_20150823;

/**
 * Created by Paul on 8/23/15.
 * http://www.lintcode.com/en/problem/validate-binary-search-tree/
 */
//Validate Binary Search Tree
//
//        23% Accepted
//        Given a binary tree, determine if it is a valid binary search tree (BST).
//
//        Assume a BST is defined as follows:
//
//        The left subtree of a node contains only nodes with keys less than the node's key.
//        The right subtree of a node contains only nodes with keys greater than the node's key.
//        Both the left and right subtrees must also be binary search trees.
//        Have you met this question in a real interview? Yes
//        Example
//        An example:
//
//        2
//        / \
//        1   3
//        /
//        4
//        \
//        5
//        The above binary tree is serialized as {2,1,3,#,#,4,#,#,5} (in level order).
//

public class M95ValidateBST {
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
     * @return: True if the binary tree is BST, or false
     */
//    public boolean isValidBST(TreeNode root) {
//        // write your code here
//    }
}
