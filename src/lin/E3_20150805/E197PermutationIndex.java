package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/permutation-index/
 * http://blog.csdn.net/u010500263/article/details/18178243
 * http://algorithm.yuanbin.me/zh-cn/exhaustive_search/permutation_index.html
 */
//Permutation Index
//
//        24% Accepted
//        Given a permutation which contains no repeated number,
// find its index in all the permutations of these numbers,
// which are ordered in lexicographical order. The index begins at 1.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1,2,4], return 1.
//
//        Related Problems Expand
public class E197PermutationIndex {
    /**
     * @param A an integer array
     * @return a long integer
     */
    public static long permutationIndex(int[] A) {
        // Write your code here
        if (A == null || A.length == 0) return 0;

        long index = 1;
        long factor = 1;
        for (int i = A.length - 1; i >= 0; i--) {
            int rank = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) rank++;
            }
            index += rank * factor;
            factor *= (A.length - i);
            System.out.println("index " + index +" factor "+factor+" rank "+rank);
        }

        return index;
    }

    public static void main(String [] args) {
        int[] a = {1,2,4};
        long b = permutationIndex(a);
    }
}
