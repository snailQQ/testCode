package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/insert-interval/
 */

//Insert Interval
//
//        22% Accepted
//        Given a non-overlapping interval list which is sorted by start point.
//
//        Insert a new interval into it, make sure the list is still in order and non-overlapping (merge intervals if necessary).
//
//        Have you met this question in a real interview? Yes
//        Example
//        Insert [2, 5] into [[1,2], [5,9]], we get [[1,9]].
//
//        Insert [3, 4] into [[1,2], [5,9]], we get [[1,2], [3,4], [5,9]].
public class E30InsertInterval {
    /**
     * Definition of Interval:
     * public classs Interval {
     *     int start, end;
     *     Interval(int start, int end) {
     *         this.start = start;
     *         this.end = end;
     *     }
     */
    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        // write your code here
        return result;
    }
}
