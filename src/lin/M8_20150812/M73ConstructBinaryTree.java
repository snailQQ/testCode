package lin.M8_20150812;

/**
 * Created by Paul on 8/11/15.
 */
//Construct Binary Tree from Preorder and Inorder Traversal
//
//        28% Accepted
//        Given preorder and inorder traversal of a tree, construct the binary tree.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given in-order [1,2,3] and pre-order [2,1,3], return a tree:
//
//        2
//        / \
//        1   3

public class M73ConstructBinaryTree {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    /**
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if(preorder == null || inorder == null || preorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }

        TreeNode root = helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    private TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if(preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int key = preorder[preStart];
        int position = -1;
        for(int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == key) {
                position = i;
                break;
            }
        }
        TreeNode root = new TreeNode(key);


        root.left = helper(preorder, preStart + 1, preStart + position - inStart, inorder, inStart, position - 1);
        root.right = helper(preorder, preStart + position - inStart + 1, preEnd, inorder, position + 1, inEnd);
        return root;
    }
}
