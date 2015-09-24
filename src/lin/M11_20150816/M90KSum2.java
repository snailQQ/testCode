package lin.M11_20150816;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Paul on 8/16/15.
 * http://www.lintcode.com/en/problem/k-sum-ii/
 * http://blog.welkinlan.com/2015/08/20/k-sum-i-ii-lintcode-java/
 */
//k Sum II
//
//        32% Accepted
//        Given n unique integers, number k (1<=k<=n)  and target. Find all possible k integers where their sum is target.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1,2,3,4], k=2, target=5, [1,4] and [2,3] are possible solutions.


public class M90KSum2 {
    /**
     * @param A: an integer array.
     * @param k: a positive integer (k <= length(A))
     * @param target: a integer
     * @return a list of lists of integer
     */
    public static ArrayList<ArrayList<Integer>> kSumII(int A[], int k, int target) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(A == null || A.length == 0 || k > A.length) {
            return rst;
        }

        Arrays.sort(A);
        ArrayList<Integer> list = new ArrayList<Integer>();
        DFS(rst, list, A, k, target, 0);
        return rst;
    }

    private static void DFS(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> list, int A[], int k, int target, int pos) {
        if(list.size() == k && target == 0) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = pos; i < A.length; i++) {
            list.add(A[i]);
            if(list.size() <= k) {
                DFS(rst, list, A, k, target - A[i], i + 1);
            }
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        ArrayList<ArrayList<Integer>> b = kSumII(a, 2, 5);
    }
}
