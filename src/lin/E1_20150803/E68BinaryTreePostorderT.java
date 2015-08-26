package lin.E1_20150803;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/binary-tree-postorder-traversal/
 *
 * http://www.cnblogs.com/springfor/p/3877260.html
 * http://blog.csdn.net/linhuanmars/article/details/22009351
 * 1）先将节点P入栈；
 2）若P不存在左孩子和右孩子，或者P存在左孩子或右孩子，但左右孩子已经被输出，则可以直接输出节点P，并将其出栈，将出栈节点P标记为上一个输出的节点，再将此时的栈顶结点设为当前节点；
 3）若不满足2）中的条件，则将P的右孩子和左孩子依次入栈，当前节点重新置为栈顶结点，之后重复操作2）；
 4）直到栈空，遍历结束。
 */
//Given a binary tree, return the postorder traversal of its nodes' values.
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
//        return [3,2,1].
public class E68BinaryTreePostorderT {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    /**
     * @param root: The root of binary tree.
     * @return: Postorder in ArrayList which contains node values.
     */
    public static ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        if(root == null)
//        {
//            return res;
//        }
//        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
//        TreeNode pre = null;
//        while(root != null || !stack.isEmpty())
//        {
//            if(root!=null)
//            {
//                stack.push(root);
//                root = root.left;
//            }
//            else
//            {
//                TreeNode peekNode = stack.peek();
//                if(peekNode.right!=null && pre != peekNode.right)
//                {
//                    root = peekNode.right;
//                }
//                else
//                {
//                    stack.pop();
//                    res.add(peekNode.val);
//                    pre = peekNode;
//                }
//            }
//        }
//        return res;
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode prev = null; // previously traversed node
        TreeNode curr = root;

        if (root == null) {
            return result;
        }

        stack.push(root);
        while (!stack.empty()) {
            curr = stack.peek();
            if (prev == null || prev.left == curr || prev.right == curr) { // traverse down the tree
                if (curr.left != null) {
                    stack.push(curr.left);
                } else if (curr.right != null) {
                    stack.push(curr.right);
                }
            } else if (curr.left == prev) { // traverse up the tree from the left
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            } else { // traverse up the tree from the right
                result.add(curr.val);
                stack.pop();
            }
            prev = curr;
        }

        return result;
    }

    public static void main(String [] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        e.left = f;
        e.right = g;
        b.left = c;
        b.right = d;
        a.left = b;
        a.right = e;
        ArrayList<Integer> ss = postorderTraversal(a);
    }
}
