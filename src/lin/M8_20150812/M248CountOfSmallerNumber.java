package lin.M8_20150812;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Paul on 8/11/15.
 * http://www.lintcode.com/en/problem/count-of-smaller-number/
 */
//Count of Smaller Number
//
//        19% Accepted
//        Give you an integer array (index from 0 to n-1, where n is the size of this array, value from 0 to 10000)
// and an query list. For each query, give you an integer,
// return the number of element in the array that are smaller that the given integer.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For array [1,2,7,8,5], and queries [1,8,5], return [0,4,2]
//
//        Note
//        We suggest you finish problem Segment Tree Build and Segment Tree Query II first.
//
//        Challenge
//        Could you use three ways to do it.
//
//        Just loop
//        Sort and binary search
//        Build Segment Tree and Search.
public class M248CountOfSmallerNumber {
    /**
     * @param A: An integer array
     * @return: The number of element in the array that
     *          are smaller that the given integer
     */
    public static ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        Arrays.sort(A);
//        int[] B = new int[A.length];
//        for(int i = 0; i < A.length; i++) {
//            B[i] = i;
//        }
        ArrayList<Integer> aList = new ArrayList<Integer>();
        for(int i = 0; i < queries.length; i++) {
            int a = binarySearch(A,queries[i]);
            aList.add(a);
        }
        return aList;
    }

    public static int binarySearch(int[] nums, int target) {
        //write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        if(nums[start] != target && nums[end] != target) {
            if(nums[end] < target) {
                return end + 1;
            }else if(nums[start] > target){
                return start;
            }else {
                return start + 1;
            }

        }
        return -1;

    }

    public static void main(String [] args) {
//        [1,2,7,8,5], and queries [1,8,5],
//        [30,87,56,25,36,69,47,49,28,3,59,61,16,63,77,63,83,27,15,31,38,81,45,4,93,16
//                ,82,24,12,99,18,21,44,69,60,60,86,19,88,62,86,98,58,53,35,24,59,46,67,21],
//        [11,39,89,46,1,70,65,93,71,7]
        int[] a = {30,87,56,25,36,69,47,49,28,3,59,61,16,63,77,63,83,27,15,31,38,81,45,4,93,16
                ,82,24,12,99,18,21,44,69,60,60,86,19,88,62,86,98,58,53,35,24,59,46,67,21};
        int[] b = {11,39,89,46,1,70,65,93,71,7};
        ArrayList<Integer> aList = countOfSmallerNumber(a,b);
    }
}
