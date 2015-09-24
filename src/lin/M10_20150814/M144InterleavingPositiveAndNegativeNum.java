package lin.M10_20150814;

/**
 * Created by Paul on 8/13/15.
 * http://www.lintcode.com/en/problem/interleaving-positive-and-negative-numbers/
 */
//Interleaving Positive and Negative Numbers
//
//        19% Accepted
//        Given an array with positive and negative integers. Re-range it to interleaving with positive and negative integers.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [-1, -2, -3, 4, 5, 6], after re-range, it will be [-1, 5, -2, 4, -3, 6] or any other reasonable answer.
//
//        Note
//        You are not necessary to keep the original order of positive integers or negative integers.
//
//        Challenge
//        Do it in-place and without extra memory.
public class M144InterleavingPositiveAndNegativeNum {
    /**
     * @param A: An integer array.
     * @return: void
     */
    public void rerange(int[] A) {
        // write your code here
        if(A == null || A.length <= 1) {
            return;
        }
        int countP = 0, countN = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i]>0) {
                countP++;
            }else{
                countN++;
            }
        }

        if((countP > countN) && A[0] < 0) {
            for(int i = 1; i < A.length; i++) {
                if(A[i] > 0) {
                    int temp = A[0];
                    A[0] = A[i];
                    A[i] = temp;
                    break;
                }
            }
        }

        if((countP < countN) && A[0] > 0) {
            for(int i = 1; i < A.length; i++) {
                if(A[i] < 0) {
                    int temp = A[0];
                    A[0] = A[i];
                    A[i] = temp;
                    break;
                }
            }
        }

        for(int i = 1; i < A.length; i++) {
            if(A[i-1] > 0 && A[i] > 0) {
                for(int j = A.length-1; j>i; j--) {
                    if(A[j] < 0) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        break;
                    }
                }
            }else if(A[i-1] < 0 && A[i] < 0) {
                for(int j = A.length-1; j>i; j--) {
                    if(A[j] > 0) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        break;
                    }
                }
            }
        }
    }
}
