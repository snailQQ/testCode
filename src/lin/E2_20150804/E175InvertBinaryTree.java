package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/invert-binary-tree/
 * http://blog.csdn.net/zzc8265020/article/details/46473757
 */
//Invert Binary Tree
//
//        42% Accepted
//        Invert a binary tree.
//
//        Have you met this question in a real interview? Yes
//        Example
//        1         1
//        / \       / \
//        2   3  => 3   2
//        /       \
//        4         4

public class E175InvertBinaryTree {
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
    public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

        /**
         * @param root: a TreeNode, the root of the binary tree
         * @return: nothing
         */
        public void invertBinaryTree(TreeNode root) {
            // write your code here
        }
}

//1
//    public TreeNode invertTree(TreeNode root) {
//        if(root!=null){
//            helper(root);
//        }
//
//        return root;
//    }
//
//    public void helper(TreeNode p){
//
//        TreeNode temp = p.left;
//        p.left = p.right;
//        p.right = temp;
//
//        if(p.left!=null)
//            helper(p.left);
//
//        if(p.right!=null)
//            helper(p.right);
//    }


//2
//public TreeNode invertTree(TreeNode root) {
//    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
//
//    if(root!=null){
//        queue.add(root);
//    }
//
//    while(!queue.isEmpty()){
//        TreeNode p = queue.poll();
//        if(p.left!=null)
//            queue.add(p.left);
//        if(p.right!=null)
//            queue.add(p.right);
//
//        TreeNode temp = p.left;
//        p.left = p.right;
//        p.right = temp;
//    }
//
//    return root;
//}