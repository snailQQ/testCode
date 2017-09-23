package leetcode.leetcode.to320;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _295FindMedianFromDataStream {
    private static Queue<Long> small = new PriorityQueue();
    private static Queue<Long> large = new PriorityQueue();

    public static void addNum(int num) {
        large.add((long) num);
        small.add(-large.poll());
        if (large.size() < small.size())
            large.add(-small.poll());
    }

    public static double findMedian() {
        return large.size() > small.size()
                ? large.peek()
                : (large.peek() - small.peek()) / 2.0;
    }

    public static void main(String[] args) {
        _295FindMedianFromDataStream a = new _295FindMedianFromDataStream();
        a.addNum(1);
        System.out.println(findMedian());
        a.addNum(2);
        System.out.println(findMedian());
        a.addNum(3);
        System.out.println(findMedian());

    }
}
