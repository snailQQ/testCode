package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/longest-increasing-continuous-subsequence/
 * https://codesolutiony.wordpress.com/2015/05/25/lintcode-longest-increasing-continuous-subsequence/
 */

//Longest Increasing Continuous subsequence
//
//        26% Accepted
//        Give you an integer array (index from 0 to n-1, where n is the size of this array)，
// find the longest increasing continuous subsequence in this array.
// (The definition of the longest increasing continuous subsequence here can be from right to left or from left to right)
//
//        Have you met this question in a real interview? Yes
//        Example
//        For [5, 4, 2, 1, 3], the LICS is [5, 4, 2, 1], return 4.
//
//        For [5, 1, 2, 3, 4], the LICS is [1, 2, 3, 4], return 4.
//
//        Note
//        O(n) time and O(1) extra space.
public class E397LongestIncreasing {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public static int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        if(A == null || A.length == 0) {
            return 0;
        }

        if(A.length == 1) {
            return 1;
        }

        int[] dpI = new int[A.length];
        int[] dpD = new int[A.length];

        dpI[0] = 1;
        dpD[0] = 1;
        int max = 0;

        for(int i = 1; i < A.length; i++) {
            if(A[i] >= A[i-1]) {
                if(dpI[i-1] > 0) {
                    dpI[i] = dpI[i-1] + 1;
                }else{
                    dpI[i-1] = 1;
                    dpI[i] = dpI[i-1] + 1;
                }
                dpD[i] = 0;
                max = Math.max(max, dpI[i]);

            }else if(A[i] <= A[i-1]) {
                if(dpD[i-1] > 0) {
                    dpD[i] = dpD[i-1] + 1;
                }else{
                    dpD[i-1] = 1;
                    dpD[i] = dpD[i-1] + 1;
                }
                dpI[i] = 0;
                max = Math.max(max, dpD[i]);
            }
        }

        return max;
    }

    public static void main(String [] args) {
        int [] array = {5,1,2,3,4};
        int a = longestIncreasingContinuousSubsequence(array);
    }
}


