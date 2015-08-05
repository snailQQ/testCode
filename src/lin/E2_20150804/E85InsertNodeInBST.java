package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/insert-node-in-a-binary-search-tree/
 */

//Insert Node in a Binary Search Tree
//
//        41% Accepted
//        Given a binary search tree and a new tree node,
// insert the node into the tree.
// You should keep the tree still be a valid binary search tree.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given binary search tree as follow, after Insert node 6, the tree should be:
//
//        2             2
//        / \           / \
//        1   4   -->   1   4
//        /             / \
//        3             3   6
public class E85InsertNodeInBST {
//    Definition of TreeNode:
     public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
     }


        /**
         * @param root: The root of the binary search tree.
         * @param node: insert this node into the binary search tree
         * @return: The root of the new binary search tree.
         */
//        public TreeNode insertNode(TreeNode root, TreeNode node) {
//            // write your code here
//        }
}


//public class Solution {
//    /**
//     * @param root: The root of the binary search tree.
//     * @param node: insert this node into the binary search tree
//     * @return: The root of the new binary search tree.
//     */
//    public TreeNode insertNode(TreeNode root, TreeNode node) {
//        if (root == null) {
//            root = node;
//            return root;
//        }
//        TreeNode tmp = root;
//        TreeNode last = null;
//        while (tmp != null) {
//            last = tmp;
//            if (tmp.val > node.val) {
//                tmp = tmp.left;
//            } else {
//                tmp = tmp.right;
//            }
//        }
//        if (last != null) {
//            if (last.val > node.val) {
//                last.left = node;
//            } else {
//                last.right = node;
//            }
//        }
//        return root;
//    }
//}
//
//
//version 2:
///**
// * Definition of TreeNode:
// * public class TreeNode {
// *     public int val;
// *     public TreeNode left, right;
// *     public TreeNode(int val) {
// *         this.val = val;
// *         this.left = this.right = null;
// *     }
// * }
// */
//public class Solution {
//    /**
//     * @param root: The root of the binary search tree.
//     * @param node: insert this node into the binary search tree
//     * @return: The root of the new binary search tree.
//     */
//    public TreeNode insertNode(TreeNode root, TreeNode node) {
//        if (root == null) {
//            return node;
//        }
//        if (root.val > node.val) {
//            root.left = insertNode(root.left, node);
//        } else {
//            root.right = insertNode(root.right, node);
//        }
//        return root;
//    }
//}