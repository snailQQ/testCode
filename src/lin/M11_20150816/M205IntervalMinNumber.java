package lin.M11_20150816;

import java.util.ArrayList;

/**
 * Created by Paul on 8/16/15.
 * http://www.lintcode.com/en/problem/interval-minimum-number/
 */
//Interval Minimum Number
//
//        24% Accepted
//        Given an integer array (index from 0 to n-1, where n is the size of this array), and an query list.
// Each query has two integers [start, end]. For each query,
// calculate the minimum number between index start and end in the given array, return the result list.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For array [1,2,7,8,5], and queries [(1,2),(0,4),(2,4)], return [2,1,5]
//
//        Note
//        We suggest you finish problem Segment Tree Build, Segment Tree Query and Segment Tree Modify first.
//
//        Challenge
//        O(logN) time for each query
public class M205IntervalMinNumber {
/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
class SegmentTreeNode {
    public int start, end, min;
    public SegmentTreeNode left, right;
    public SegmentTreeNode(int start, int end, int min) {
        this.start = start;
        this.end = end;
        this.min = min;
        this.left = this.right = null;
    }
}
    public class Interval {
        int start, end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
    }

    public SegmentTreeNode build(int start, int end, int[] A) {
        // write your code here
        if(start > end) {  // check core case
            return null;
        }

        SegmentTreeNode root = new SegmentTreeNode(start, end, Integer.MAX_VALUE);

        if(start != end) {
            int mid = (start + end) / 2;
            root.left = build(start, mid, A);
            root.right = build(mid+1, end, A);

            root.min = Math.min(root.left.min, root.right.min);
        } else {
            root.min = A[start];
        }
        return root;
    }
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
        if(start == root.start && root.end == end) { // 相等
            return root.min;
        }


        int mid = (root.start + root.end)/2;
        int leftmin = Integer.MAX_VALUE, rightmin = Integer.MAX_VALUE;
        // 左子区
        if(start <= mid) {
            if( mid < end) { // 分裂
                leftmin =  query(root.left, start, mid);
            } else { // 包含
                leftmin = query(root.left, start, end);
            }
        }
        // 右子区
        if(mid < end) { // 分裂 3
            if(start <= mid) {
                rightmin = query(root.right, mid+1, end);
            } else { //  包含
                rightmin = query(root.right, start, end);
            }
        }
        // else 就是不相交
        return Math.min(leftmin, rightmin);
    }
    /**
     *@param A, queries: Given an integer array and an query list
     *@return: The result list
     */
    public ArrayList<Integer> intervalMinNumber(int[] A,
                                                ArrayList<Interval> queries) {
        // write your code here
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        if(queries.size() == 0) {
            return returnList;
        }
        for(Interval anInterval : queries) {
            if(A == null || A.length == 0) {
                returnList.add(-1);
            }
            int min = Integer.MAX_VALUE;
            for(int i = anInterval.start; i <= anInterval.end; i++) {
                if(A[i] <= min) {
                    min = A[i];
                }
            }
            returnList.add(min);

        }
        return returnList;

    }}
}
