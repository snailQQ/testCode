package lin.M17_20150822;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 8/22/15.
 * http://bangbingsyb.blogspot.com/2014/11/leetcode-unique-binary-search-trees-i-ii.html
 */

//要求生成所有的unique BST，类似combination/permutation的题目，可以递归构造。
//
//        1. 根节点可以任取min ~ max (例如min  = 1, max = n)，假如取定为i。
//        2. 则left subtree由min ~ i-1组成，假设可以有L种可能。right subtree由i+1 ~ max组成，假设有R种可能。生成所有可能的left/right subtree。
//        3 对于每个生成的left subtree/right subtree组合<T_left(p), T_right(q)>，p = 1...L，q = 1...R，添加上根节点i而组成一颗新树。
//Unique Binary Search Trees II
//
//        30% Accepted
//        Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given n = 3, your program should return all 5 unique BST's shown below.
//
//        1         3     3      2      1
//        \       /     /      / \      \
//        3     2     1      1   3      2
//        /     /       \                 \
//        2     1         2                 3
public class M164UniqueBinarySearchTrees2 {
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
     * @paramn n: An integer
     * @return: A list of root
     */
    public List<TreeNode> generateTrees(int n) {
        // write your code here
        return genBST(1, n);
    }

    private List<TreeNode> genBST(int min, int max) {
        List<TreeNode> rst = new ArrayList<TreeNode>();
        if(min > max) {
            rst.add(null);
            return rst;
        }
        for(int i = min; i <= max; i++) {
            List<TreeNode> leftSubTree = genBST(min, i-1);
            List<TreeNode> rightSubTree = genBST(i+1, max);
            for(int j = 0; j < leftSubTree.size(); j++) {
                for(int k = 0; k < rightSubTree.size(); k++) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftSubTree.get(j);
                    root.right = rightSubTree.get(k);
                   rst.add(root);
                }
            }
        }
        return rst;
    }
}
