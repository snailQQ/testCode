package lin.M11_20150816;

import java.util.ArrayList;

/**
 * Created by Paul on 8/16/15.
 * http://www.lintcode.com/en/problem/interval-sum/
 */
//Interval Sum
//
//        24% Accepted
//        Given an integer array (index from 0 to n-1, where n is the size of this array), and an query list.
// Each query has two integers [start, end].
// For each query, calculate the sum number between index start and end in the given array, return the result list.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For array [1,2,7,8,5], and queries [(0,4),(1,2),(2,4)], return [23,9,20]
//
//        Note
//        We suggest you finish problem Segment Tree Build, Segment Tree Query and Segment Tree Modify first.
//
//        Challenge
//        O(logN) time for each query
public class M206IntervalSum {
    /**
     * Definition of Interval:
     * public classs Interval {
     *     int start, end;
     *     Interval(int start, int end) {
     *         this.start = start;
     *         this.end = end;
     *     }
     */
    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    /**
     *@param A, queries: Given an integer array and an query list
     *@return: The result list
     */
    public ArrayList<Long> intervalSum(int[] A,
                                       ArrayList<Interval> queries) {
        // write your code here
        ArrayList<Long> returnValue = new ArrayList<Long>();
        if(queries.size() == 0 || queries == null) {
            return returnValue;
        }
        for(Interval element : queries) {
            int start = element.start;
            int end = element.end;
            long sum = 0;
            for(int i = start; i <= end; i++) {
                sum += A[i];
            }
            returnValue.add(sum);
        }
        return returnValue;
    }
}
