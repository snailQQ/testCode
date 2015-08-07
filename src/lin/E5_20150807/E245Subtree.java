package lin.E5_20150807;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/subtree/
 */
//Subtree
//
//        19% Accepted
//        You have two every large binary trees: T1, with millions of nodes, and T2, with hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.
//
//        Have you met this question in a real interview? Yes
//        Example
//        T2 is a subtree of T1 in the following case:
//
//        1                3
//        / \              /
//        T1 = 2   3      T2 =  4
//        /
//        4
//        T2 isn't a subtree of T1 in the following case:
//
//        1               3
//        / \               \
//        T1 = 2   3       T2 =    4
//        /
//        4
//        Note
//        A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n is identical to T2. That is,
//        if you cut off the tree at node n, the two trees would be identical.
public class E245Subtree {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
//    public boolean isSubtree(TreeNode T1, TreeNode T2) {
//        // write your code here
//    }
}
