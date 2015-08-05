package lin.E2_20150804;

import java.util.ArrayList;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/insert-interval/
 */

//Insert Interval
//
//        22% Accepted
//        Given a non-overlapping interval list which is sorted by start point.
//
//        Insert a new interval into it, make sure the list is still in order
// and non-overlapping (merge intervals if necessary).
//
//        Have you met this question in a real interview? Yes
//        Example
//        Insert [2, 5] into [[1,2], [5,9]], we get [[1,9]].
//
//        Insert [3, 4] into [[1,2], [5,9]], we get [[1,2], [3,4], [5,9]].
public class E30InsertInterval {
//    Definition of Interval:
    public static class Interval {
        int start, end;
        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if (newInterval == null || intervals == null) {
            return intervals;
        }

        ArrayList<Interval> results = new ArrayList<Interval>();
        int insertPos = 0;

        for (Interval interval : intervals) {
            if (interval.end < newInterval.start) {
                results.add(interval);
                insertPos++;
            } else if (interval.start > newInterval.end) {
                results.add(interval);
            } else {
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }

        results.add(insertPos, newInterval);

        return results;
    }

    public static void main(String [] args) {
        Interval i1 = new Interval(1, 2);
        Interval i2 = new Interval(5, 9);
        Interval i3 = new Interval(12, 14);
        Interval i4 = new Interval(2, 5);
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);

        ArrayList<Interval> intervals2 = insert(intervals, i4);


    }
}
