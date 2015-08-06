package lin.E3_20150805;

import java.util.ArrayList;

/**
 * Created by Paul on 8/5/15.
 */
//Product of Array Exclude Itself
//
//        25% Accepted
//        Given an integers array A.
//
//        Define B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1], calculate B WITHOUT divide operation.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For A = [1, 2, 3], return [6, 3, 2].
public class E50ProductOfArrayExcludeItself {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> result = new ArrayList<Long>();
        if (A.size() <= 1) {
            return result;
        }
        long[] left = new long[A.size()];
        long[] right = new long[A.size()];
        left[0] = 1;
        for (int i = 1; i < A.size(); i++) {
            left[i] = left[i-1] * A.get(i-1);
        }
        right[A.size()-1] = 1;
        for (int i = A.size()-2; i >= 0; i--) {
            right[i] = right[i+1] * A.get(i+1);
        }
        for (int i = 0; i < A.size(); i++) {
            result.add(left[i] * right[i]);
        }
        return result;
    }
}
