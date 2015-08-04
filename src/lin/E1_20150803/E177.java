package lin.E1_20150803;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/convert-sorted-array-to-binary-search-tree-with-minimal-height/
 */
//
//Convert Sorted Array to Binary Search Tree With Minimal Height
//
//        35% Accepted
//        Given a sorted (increasing order) array, Convert it to create a binary tree with minimal height.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1,2,3,4,5,6,7], return
//
//        4
//        /   \
//        2     6
//        / \    / \
//        1   3  5   7
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
public class E177 {
    public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    private TreeNode buildTree(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode node = new TreeNode(num[(start + end) / 2]);
        node.left = buildTree(num, start, (start + end) / 2 - 1);
        node.right = buildTree(num, (start + end) / 2 + 1, end);
        return node;
    }
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] num) {
        // write your code here
            if (num == null) {
                return null;
            }
            return buildTree(num, 0, num.length - 1);

    }

}
