package lin.M8_20150812;

/**
 * Created by Paul on 8/11/15.
 * http://www.lintcode.com/en/problem/construct-binary-tree-from-inorder-and-postorder-traversal/
 * http://blog.csdn.net/derrantcm/article/details/47371993
 */
//Construct Binary Tree from Inorder and Postorder Traversal
//
//        30% Accepted
//        Given inorder and postorder traversal of a tree, construct the binary tree.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given inorder [1,2,3] and postorder [1,3,2], return a tree:
//
//        2
//        / \
//        1   3

public class M72ConstructBinaryTree2 {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    /**
     *@param inorder : A list of integers that inorder traversal of a tree
     *@param postorder : A list of integers that postorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
//        TreeNode root = new TreeNode();
        if(inorder == null || postorder == null || inorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }

        TreeNode root = helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        return root;
    }

    private TreeNode helper(int[] inorder, int inStart, int intEnd, int[] postorder, int poStart, int poEnd) {
        if(inStart > intEnd || poStart > poEnd) {
            return null;
        }
        int key = postorder[poEnd];
        TreeNode root = new TreeNode(postorder[poEnd]);
        int position = -1;
        for(int i = inStart; i <= intEnd; i++) {
            if(inorder[i] == key) {
                position = i;
                break;
            }
        }
        //inorder 3241657
        //postorder 3426751
        root.left = helper(inorder, inStart, position - 1, postorder, poStart, poStart + position -1 - inStart);
        root.right = helper(inorder, position + 1, intEnd, postorder, poStart + position - inStart, poEnd - 1);
        return root;

    }
}
