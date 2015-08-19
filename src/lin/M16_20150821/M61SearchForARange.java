package lin.M16_20150821;

import java.util.ArrayList;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/search-for-a-range/
 */
//Search for a Range
//
//        20% Accepted
//        Given a sorted array of n integers, find the starting and ending position of a given target value.
//
//        If the target is not found in the array, return [-1, -1].
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
//
//        Challenge
//        O(log n) time.
public class M61SearchForARange {
    /**
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
        // write your code here
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        if(A == null || A.size() == 0) {
            returnList.add(-1);
            returnList.add(-1);
            return returnList;
        }

        int start = 0;
        int end = A.size() - 1;
        int left = -1;
        int right = -1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(target == A.get(mid)) {
                end = mid;
            }else if(target > A.get(mid)) {
                start = mid;
            }else {
                end = mid;
            }
        }

        if(A.get(start) == target) {
            left = start;
        }
        else if(A.get(end) == target) {
            left = end;
        }


        start = 0;
        end = A.size() - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(target == A.get(mid)) {
                start = mid;
            }else if(target > A.get(mid)) {
                start = mid;
            }else {
                end = mid;
            }
        }

        if(A.get(end) == target) {
            right = end;
        }
        else if(A.get(start) == target) {
            right = start;
        }

        returnList.add(left);
        returnList.add(right);
        return returnList;
    }
}
