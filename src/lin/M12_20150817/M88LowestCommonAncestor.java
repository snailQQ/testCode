package lin.M12_20150817;

/**
 * Created by Paul on 8/17/15.
 */
//Lowest Common Ancestor
//
//        34% Accepted
//        Given the root and two nodes in a Binary Tree. Find the lowest common ancestor(LCA) of the two nodes.
//
//        The lowest common ancestor is the node with largest depth which is the ancestor of both nodes.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For the following binary tree:
//
//        4
//        / \
//        3   7
//        / \
//        5   6
//        LCA(3, 5) = 4
//
//        LCA(5, 6) = 7
//
//        LCA(6, 7) = 7
public class M88LowestCommonAncestor {
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
    /**
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // write your code here
        if(root == null) {
            return root;
        }

        if(q.val < p.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }

        if(p.val < root.val && q.val > root.val) {
            return root;
        } else if( q.val < root.val) {
            root = lowestCommonAncestor(root.left, p, q);
        } else if( root.val < p.val) {
            root = lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(1);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        d.left = f;

        TreeNode g = lowestCommonAncestor(a, f, e);

    }
}
