package lin.M17_20150822;

import java.util.Arrays;

/**
 * Created by Paul on 8/22/15.
 * http://www.lintcode.com/en/problem/the-smallest-difference/
 * https://codesolutiony.wordpress.com/2015/05/21/lintcode-the-smallest-difference/
 */
//The Smallest Difference
//
//        35% Accepted
//        Given two array of integers(the first array is array A, the second array is array B),
// now we are going to find a element in array A which is A[i], and another element in array B which is B[j],
// so that the difference between A[i] and B[j] (|A[i] - B[j]|) is as small as possible,
// return their smallest difference.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For example, given array A = [3,6,7,4], B = [2,8,9,3], return 0
//
//        Challenge
//        O(n log n) time
public class M387TheSmallestDifference {
    /**
     * @param A, B: Two integer arrays.
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
        // write your code here
        Arrays.sort(A);
        Arrays.sort(B);
        int p1 = 0, p2 = 0;
        int res = Integer.MAX_VALUE;
        while (p1 < A.length && p2 < B.length) {
            if (A[p1]<=B[p2]) {
                res = Math.min(res, B[p2] - A[p1++]);
                // if (p1< A.length && A[p1] > B[p2]) {
                //     res = Math.min(res, A[p1] - B[p2]);
                // }
            } else {
                res = Math.min(res, A[p1] - B[p2++]);
                // if (p2 < B.length && B[p2] > A[p1]) {
                //     res = Math.min(res, B[p2] - A[p1]);
                // }
            }
            if(res == 0) {
                return 0;
            }
        }
        return res;
    }
}
