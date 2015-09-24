package lin.M7_20150811;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Paul on 8/10/15.
 * http://www.lintcode.com/en/problem/binary-tree-serialization/
 */
//Binary Tree Serialization
//
//        16% Accepted
//        Design an algorithm and write code to serialize and deserialize a binary tree. Writing the tree to a file is called 'serialization' and reading back from the file to reconstruct the exact same binary tree is 'deserialization'.
//
//        There is no limit of how you deserialize or serialize a binary tree, you only need to make sure you can serialize a binary tree to a string and deserialize this string to the original structure.
//
//        Have you met this question in a real interview? Yes
//        Example
//        An example of testdata: Binary tree {3,9,20,#,#,15,7}, denote the following structure:
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        Our data serialization use bfs traversal. This is just for when you got wrong answer and want to debug the input.
//
//        You can use other method to do serializaiton and deserialization.
public class M7BinaryTreeSerialization {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public static String serialize(TreeNode root) {
        // write your code here
        if(root == null) {
            return "#";
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        String rst = String.valueOf(root.val);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.left != null) {
                queue.offer(node.left);
                rst = rst + "," + String.valueOf(node.left.val);
            }else {
                rst = rst + ",#";
            }
            if(node.right != null) {
                queue.offer(node.right);
                rst = rst + "," + String.valueOf(node.right.val);
            }else {
                rst = rst + ",#";
            }
        }

        return rst;
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
//    public TreeNode deserialize(String data) {
//        // write your code here
//    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        c.left = d;
        c.right = e;
        a.left = b;
        a.right = c;
        String s = serialize(a);


    }
}
