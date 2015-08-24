package lin;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/binary-tree-preorder-traversal/
 */
//Given a binary tree, return the preorder traversal of its nodes' values.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given binary tree {1,#,2,3}:
//
//        1
//        \
//        2
//        /
//        3
//        return [1,2,3].
public class E66BinaryTreePerorderT {
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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        Stack<TreeNode> aStack = new Stack<TreeNode>();
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        if(root == null) {
            return returnList;
        }
        aStack.push(root);
        while(!aStack.isEmpty()) {
            TreeNode aNode = aStack.pop();
            returnList.add(aNode.val);
            if(aNode.right != null) {
                aStack.push(aNode.right);
            }
            if(aNode.left != null) {
                aStack.push(aNode.left);
            }

        }

        return returnList;
    }
}
