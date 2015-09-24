package lin.M17_20150822;

/**
 * Created by Paul on 8/22/15.
 * http://www.lintcode.com/en/problem/unique-binary-search-trees/
 * http://bangbingsyb.blogspot.com/2014/11/leetcode-unique-binary-search-trees-i-ii.html
 */
//Unique Binary Search Trees
//
//        32% Accepted
//        Given n, how many structurally unique BSTs (binary search trees) that store values 1...n?
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given n = 3, there are a total of 5 unique BST's.
//
//        1           3    3       2      1
//        \         /    /       / \      \
//        3      2     1       1   3      2
//        /      /       \                  \
//        2     1          2                  3
public class M163UniqueBinarySearchTrees {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
    public static int numTrees(int n) {
        // write your code here
        int[] array = new int[n+1];
        array[0] = 1;
        array[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                array[i] += array[j] * array[i-j-1];
            }

        }

        return array[n];
    }

    public static void main(String[] args) {
        int a = numTrees(2);
    }
}
