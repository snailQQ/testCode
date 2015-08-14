package lin.M9_20150813;

/**
 * Created by Paul on 8/12/15.
 */
//Find Peak Element
//
//        44% Accepted
//        There is an integer array which has the following features:
//
//        The numbers in adjacent positions are different.
//        A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
//        We define a position P is a peek if:
//
//        A[P] > A[P-1] && A[P] > A[P+1]
//        Find a peak element in this array. Return the index of the peak.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1, 2, 1, 3, 4, 5, 7, 6]
//
//        Return index 1 (which is number 2) or 6 (which is number 7)
//
//        Note
//        The array may contains multiple peeks, find any of them.
//
//        Challenge
//        Time complexity O(logN)
public class M75FindPeakElement {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public static int findPeak(int[] A) {
        // write your code here
        if(A == null || A.length == 0) {
            return -1;
        }
        if(A.length == 1) {
            return 0;
        }
        for(int i = 0; i < A.length-1; i++) {
            if(i != 0) {
                if(A[i] >= A[i-1] && A[i] >= A[i+1]) {
                    return i;
                }
            }else {
                if(A[i] >= A[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        int[] a = {1, 2, 1, 3, 4, 5, 7, 6};
        int b = findPeak(a);
    }
}
