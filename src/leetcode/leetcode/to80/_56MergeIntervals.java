package leetcode.leetcode.to80;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 * http://www.cnblogs.com/springfor/p/3872332.html
 * comparetor and cpmparable
 */
public class _56MergeIntervals {
    /**
     * Definition for an interval.
     * public class Interval {
     *     int start;
     *     int end;
     *     Interval() { start = 0; end = 0; }
     *     Interval(int s, int e) { start = s; end = e; }
     * }
     */
    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0) {
            return list;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        for(int i = 0; i < intervals.size(); ) {
            Interval interval = intervals.get(i);
            int j;
            for(j = i + 1; j < intervals.size(); j++) {
                Interval interval2 = intervals.get(j);
                if(interval2.start > interval.end) {

                    break;
                } else {
                    int a = Math.max(interval.end, interval2.end);
                    interval.end = Math.max(interval.end, interval2.end);
                }
            }
            i = j;
            list.add(interval);
        }
        return list;
    }

    public static void main(String[] args) {
        Interval a = new Interval(1,4);
        Interval b = new Interval(0,2);
        Interval c = new Interval(3,5);
        List<Interval> l = new ArrayList<Interval>();

        l.add(a);
        l.add(b);
        l.add(c);
        List<Interval> rst = merge(l);
    }
}
