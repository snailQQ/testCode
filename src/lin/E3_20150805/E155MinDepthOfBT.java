package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/minimum-depth-of-binary-tree/
 * http://gongxuns.blogspot.com/2012/12/leetcode-minimum-depth-of-binary-tree.html
 */
//Minimum Depth of Binary Tree
//
//        32% Accepted
//        Given a binary tree, find its minimum depth.
//
//        The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given a binary tree as follow:
//
//        1
//
//        /     \
//
//        2       3
//
//        /    \
//
//        4      5
//
//        The minimum depth is 2
public class E155MinDepthOfBT {
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
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if (root == null) {
            return 0;
        }
        return getMin(root);
    }

    public int getMin(TreeNode root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return Math.min(getMin(root.left), getMin(root.right)) + 1;
    }
}
//public class Solution {
//    public int minDepth(TreeNode root) {
//        // Start typing your Java solution below
//        // DO NOT write main() function
//        if(root==null) return 0;
//
//        if(root.left==null && root.right==null) return 1;
//
//        if(root.left==null){
//            return 1+minDepth(root.right);
//        }else if(root.right==null){
//            return 1+minDepth(root.left);
//        }else
//            return 1+Math.min(minDepth(root.left), minDepth(root.right));
//    }
//}
//public class Solution {
//    public int minDepth(TreeNode root) {
//        // Start typing your Java solution below
//        // DO NOT write main() function
//        if(root==null) return 0;
//
//        ArrayList<TreeNode> last =new ArrayList<TreeNode>();
//        last.add(root);
//        int count=1;
//        while(!last.isEmpty()){
//            ArrayList<TreeNode> curr = new ArrayList<TreeNode>();
//            for(TreeNode n:last){
//                if(n.left==null && n.right==null) return count;
//                if(n.left!=null) curr.add(n.left);
//                if(n.right!=null) curr.add(n.right);
//            }
//            count++;
//            last=new ArrayList<TreeNode>(curr);
//        }
//        return count;
//    }
//}