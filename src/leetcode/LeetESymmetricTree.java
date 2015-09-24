package leetcode;

/**
 * Created by Paul on 9/24/15.
 * https://leetcode.com/problems/symmetric-tree/
 * http://www.cnblogs.com/springfor/p/3879595.html
 */
//Symmetric Tree My Submissions Question Solution
//        Total Accepted: 72484 Total Submissions: 227451 Difficulty: Easy
//        Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//        For example, this binary tree is symmetric:
//
//        1
//        / \
//        2   2
//        / \ / \
//        3  4 4  3
//        But the following is not:
//        1
//        / \
//        2   2
//        \   \
//        3    3
//        Note:
//        Bonus points if you could solve it both recursively and iteratively.
//
//        confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
//
//        Hide Tags Tree Depth-first Search

public class LeetESymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricTree(root.left, root.right);
    }

    private boolean isSymmetricTree(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }

        return (left.val == right.val && isSymmetricTree(left.left, right.right) && isSymmetricTree(left.right, right.left));
    }
}
