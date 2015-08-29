package lin.M16_20150821;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/search-in-rotated-sorted-array-ii/
 * http://www.lintcode.com/en/problem/search-in-rotated-sorted-array-ii/#
 */
//Search in Rotated Sorted Array II
//
//        39% Accepted
//        Follow up for "Search in Rotated Sorted Array":
//        What if duplicates are allowed?
//
//        Would this affect the run-time complexity? How and why?
//
//        Write a function to determine if a given target is in the array.
//
//        Have you met this question in a real interview? Yes

public class M63SearchInRotatedSortedArray2 {
    /**
     * param A : an integer ratated sorted array and duplicates are allowed
     * param target :  an integer to be search
     * return : a boolean
     */
    public boolean search(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0) {
            return false;
        }

        int start = 0;
        int end = A.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(A[mid] == target) {
                return true;
            }else if(A[mid] > target) {
                if(A[mid] == A[end]) {
                    end--;
                }else if(A[mid] < A[end]) {
                    end = mid;
                }else {
                    if(A[start] > target) {
                        start = mid;
                    }else {
                        end = mid;
                    }
                }
            }else {
                if(A[mid] == A[start]) {
                    start++;
                }else if(A[start] < A[mid]) {
                    start = mid;
                }else {
                    if(A[end] < target) {
                        end = mid;
                    }else {
                        start = mid;
                    }
                }
            }
        }

        if(A[start]  == target) {
            return true;
        }else if(A[end] == target){
            return true;
        }
        return false;
    }
}
