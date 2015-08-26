package lin.E1_20150803;

/**
 * Created by Paul on 8/2/15.
 */
//Binary Tree Inorder Traversal
//
//        38% Accepted
//        Given a binary tree, return the inorder traversal of its nodes' values.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given binary tree {1,#,2,3},
//
//        1
//        \
//        2
//        /
//        3
//
//
//        return [1,3,2].
    //http://www.lintcode.com/en/problem/binary-tree-inorder-traversal/

import java.util.ArrayList;
import java.util.Stack;

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

public class E67BinaryTreeInorderTraversal {
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
     * @return: Inorder in ArrayList which contains node values.
     */
//    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
//        ArrayList<Integer> rst = new ArrayList<Integer>();
//        if(root == null) {
//            return rst;
//        }
//        Stack<TreeNode> aStack = new Stack<TreeNode>();
//        aStack.push(root);
//        while(!aStack.isEmpty()) {
//            TreeNode aNode = aStack.peek();
//            if(aNode.left != null) {
//                aStack.push(aNode.left);
//            }
//            if()
//        }
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        if(root == null)
//            return res;
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        while(root!=null || !stack.isEmpty()){
//            if(root!=null){
//                stack.push(root);
//                root = root.left;
//            }else{
//                root = stack.pop();
//                res.add(root.val);
//                root = root.right;
//            }
//        }
//        return res;
//    }
}
