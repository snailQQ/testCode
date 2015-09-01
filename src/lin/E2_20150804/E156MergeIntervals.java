package lin.E2_20150804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/merge-intervals/
 * http://www.cnblogs.com/springfor/p/3872332.html
 */
//Merge Intervals
//
//        18% Accepted
//        Given a collection of intervals, merge all overlapping intervals.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given intervals => merged intervals:
//
//        [                     [
//        [1, 3],               [1, 6],
//        [2, 6],      =>       [8, 10],
//        [8, 10],              [15, 18]
//        [15, 18]            ]
//        ]
//        Challenge
//        O(n log n) time and O(1) extra space.
public class E156MergeIntervals {
    /**
     * Definition of Interval:
     * public class Interval {
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
         * @param intervals: Sorted interval list.
         * @return: A new sorted interval list.
         */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if (intervals == null || intervals.size() <= 1)
            return intervals;

        // sort intervals by using self-defined Comparator
        Collections.sort(intervals, new IntervalComparator());

        ArrayList<Interval> result = new ArrayList<Interval>();

        Interval prev = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);

            if (prev.end >= curr.start) {
                // merged case
                Interval merged = new Interval(prev.start, Math.max(prev.end, curr.end));
                prev = merged;
            } else {
                result.add(prev);
                prev = curr;
            }
        }

        result.add(prev);

        return result;
    }

    class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }



}
