package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 9/29/15.
 * https://leetcode.com/discuss/52250/binary-tree-paths-dfs-java-solution
 */
public class leetE257BinaryTreePaths {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root == null) {
            return list;
        }
        //   String str = Integer.toString(root.val);
        DFS(root, list, new String());
        return list;
    }

    private static void DFS(TreeNode root, List<String> list, String str) {
        if(root.left == null && root.right == null) {
            str = str + root.val;
            list.add(new String(str));
            return;
        }

        str = str + root.val;
        str = str + "->";
        if(root.left != null) {
            DFS(root.left, list, str);
        }

        if(root.right != null) {
            DFS(root.right, list, str);
        }

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
        List<String> ss = binaryTreePaths(a);
    }
}
