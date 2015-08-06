package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/single-number/
 */
//Single Number
//
//        58% Accepted
//        Given 2*n + 1 numbers, every numbers occurs twice except one, find it.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1,2,2,1,3,4,3], return 4
//
//        Challenge
//        One-pass, constant extra space.


public class E82SingleNumber {
    /**
     *@param A : an integer array
     *return : a integer
     */
    public int singleNumber(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int n = A[0];
        for(int i = 1; i < A.length; i++) {
            n = n ^ A[i];
        }

        return n;
    }
}
