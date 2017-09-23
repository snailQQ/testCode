package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 * https://leetcode.com/discuss/61105/java-python-solution-o-h-time-and-o-1-space-iterative
 * https://leetcode.com/discuss/59787/share-my-java-recursive-solution
 */
public class _285InorderSuccessorInBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode succ = null;
        while (root != null) {
            if (p.val < root.val) {
                succ = root;
                root = root.left;
            }
            else
                root = root.right;
        }
        return succ;
    }

    public static void main(String [] args) {
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(7);
        e.left = f;
        e.right = g;
        b.left = c;
        b.right = d;
        a.left = b;
        a.right = e;
        TreeNode ss = inorderSuccessor(a, f);
    }
}
