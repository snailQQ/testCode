package leetcode.leetcode.to120;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * answer link
 */
public class _104MaximumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int depth = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public int maxDepth2(TreeNode root) {
        if(root == null) {
            return depth;
        }
        helper(root, 1);
        return depth;
    }

    public void helper(TreeNode node, int curDepth) {
        if(node == null) {
            return;
        }
        if(curDepth > depth) {
            depth = curDepth;
        }

        helper(node.left, curDepth + 1);
        helper(node.right, curDepth + 1);
    }
}
