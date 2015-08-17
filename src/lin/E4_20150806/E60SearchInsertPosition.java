package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/search-insert-position/
 */
//Search Insert Position
//
//        29% Accepted
//        Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You may assume NO duplicates in the array.
//
//        Have you met this question in a real interview? Yes
//        Example
//        [1,3,5,6], 5 → 2
//
//        [1,3,5,6], 2 → 1
//
//        [1,3,5,6], 7 → 4
//
//        [1,3,5,6], 0 → 0
//
//        Challenge
//        O(log(n)) time
public class E60SearchInsertPosition {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public static int searchInsert(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0 ){
            return 0;
        }

        if(A[0] >= target) {
            return 0;
        }

        if(A[A.length-1] < target) {
            return A.length;
        }
        int start = 0;
        int end = A.length - 1;

        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(target <= A[mid]) {
                end = mid;
            }else {
                start = mid;
            }
        }

        if(A[start] == target) {
            return start;
        }
        if(A[end] == target) {
            return end;
        }
        if(A[start] != target && A[end] != target) {
            return start + 1;
        }
        return 0;
    }

    public static void main(String [] args) {
        int [] a = {1,3,5,6,8,9};
        searchInsert(a, 7);
    }
}
