package lin.M10_20150814;

/**
 * Created by Paul on 8/13/15.
 * http://www.lintcode.com/en/problem/first-missing-positive/
 */
//First Missing Positive
//
//        22% Accepted
//        Given an unsorted integer array, find the first missing positive integer.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1,2,0] return 3, and [3,4,-1,1] return 2.
//
//        Challenge
//        Your algorithm should run in O(n) time and uses constant space.
public class M189FirstMissingPositive {
    /**
     * @param A: an array of integers
     * @return: an integer
     */
    public static int firstMissingPositive(int[] A) {
        // write your code here

        if (A == null) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            while (A[i] > 0 && A[i] <= A.length && A[i] != A[A[i]-1]) {
                int tmp = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = tmp;
            }
        }

        for (int i = 0; i < A.length; i ++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        return A.length + 1;
    }

    public static void main(String[] args) {
        int[] b = {3,4,-1,1};
        int a = firstMissingPositive(b);
    }
}
