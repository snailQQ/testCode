package leetcode.leetcode.to280;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/binary-tree-paths/
 * answer link
 */
public class _257BinaryTreePaths {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root == null) {
            return list;
        }
        String str = "";
        helper(list, root, str);
        return list;
    }

    private static void helper(List<String> list, TreeNode root, String str) {
        if(root.left == null && root.right == null) {
            str += root.val;
            list.add(str);
            return;
        }
        str += root.val;
        str += "->";
        if(root.left != null) {
            helper(list, root.left, str);
        }
        if(root.right != null) {
            helper(list,root.right, str);
        }
    }

    public static void main(String[] args) {
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
        List<String> ss = binaryTreePaths(a);
    }
}
