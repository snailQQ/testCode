package lin.M16_20150821;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/search-in-rotated-sorted-array/
 * http://www.cnblogs.com/springfor/p/3858140.html
 */
//Search in Rotated Sorted Array
//
//        29% Accepted
//        Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//
//        (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//        You are given a target value to search. If found in the array return its index, otherwise return -1.
//
//        You may assume no duplicate exists in the array.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For [4, 5, 1, 2, 3] and target=1, return 2.
//
//        For [4, 5, 1, 2, 3] and target=0, return -1.
//
//        Challenge
//        O(logN) time
public class M62SearchInRotatedSortedArray {
    /**
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public static int search(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0) {
            return -1;
        }

        int start = 0;
        int end = A.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(A[mid] == target) {
                return mid;
            }else if(A[mid] > target){
                if(A[mid] < A[end]) {
                    end = mid - 1;
                }else{
                    if(A[start] > target) {
                        start = mid + 1;
                    }else {
                        end = mid - 1;
                    }

                }
            }else {
                if(A[start] < A[mid]) {
                    start = mid + 1;
                }else{
                    if(A[end] < target) {
                        end = mid - 1;
                    }else {
                        start = mid + 1;
                    }

                }
            }



        }

        if(A[start] == target) {
            return start;
        }else if(A[end] == target) {
            return end;
        }
        return -1;
    }

    public static void main(String [] args) {
        int[] a = {0,1,2,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
        int b = search(a, -9);
    }
}
