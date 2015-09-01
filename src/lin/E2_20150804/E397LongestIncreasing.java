package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/longest-increasing-continuous-subsequence/
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

        if(A.length == 2 ) {
            if(A[0] == A[1]) {
                return 1;
            }else {
                return 2;
            }

        }

        int count = 1;
        int max = 0;
        for(int i = 1; i < A.length - 1; i++) {
            if(count < 2 && ((A[i] > A[i-1] && A[i] > A[i+1]) || (A[i] < A[i-1] && A[i] < A[i+1]))) {
                if( max < count + 1) {
                    max = count + 1;
                }
                count = 1;
            }else{
                count++;
            }
        }
        return Math.max(max, count);
//        https://codesolutiony.wordpress.com/2015/05/25/lintcode-longest-increasing-continuous-subsequence/
    }

    public static void main(String [] args) {
        int [] array = {5,1,2,3,4};
        int a = longestIncreasingContinuousSubsequence(array);
    }
}
