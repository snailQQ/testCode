package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//Meeting Rooms II My Submissions Question Solution 
//Total Accepted: 1911 Total Submissions: 6647 Difficulty: Medium
//Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
//
//For example,
//Given [[0, 30],[5, 10],[15, 20]],
//return 2.
//
//Hide Tags Heap Greedy Sort
//Hide Similar Problems (H) Merge Intervals (E) Meeting Rooms

//https://leetcode.com/problems/meeting-rooms-ii/
//解法
//http://buttercola.blogspot.com/2015/08/leetcode-meeting-rooms-ii.html
	
	
public class LeetcodeMMeetingRoomsII253 {
	public static class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	
	public static int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
         
        Arrays.sort(intervals, new IntervalComparator());
         
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int numRooms = 1;
         
        pq.offer(intervals[0].end);
         
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < pq.peek()) {
                numRooms++;
                pq.offer(intervals[i].end);
            } else {
                pq.poll();
                pq.offer(intervals[i].end);
            }
        }
         
        return numRooms;
         
    }
     
    public static class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }
    
    public static void main(String[] args) {
//    	[[9,10],[4,9],[4,17]]
    	Interval a = new Interval(9, 10);
    	Interval b = new Interval(4, 9);
    	Interval c = new Interval(4, 17);
    	Interval[] intervals = new Interval[]{a,b,c};
    	int d = minMeetingRooms(intervals);
	}
    
}
