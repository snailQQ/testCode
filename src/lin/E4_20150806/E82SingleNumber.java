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
    public static int singleNumber(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int n = A[0];
        for(int i = 1; i < A.length; i++) {
            System.out.println(Integer.toBinaryString(A[i]));
            n = n ^ A[i];
            System.out.println(n);
        }
        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {
        int[] A = {1,2,2,1,3,4,3};
        int b = singleNumber(A);
    }
}
