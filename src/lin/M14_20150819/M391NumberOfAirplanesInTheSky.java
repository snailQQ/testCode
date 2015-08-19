package lin.M14_20150819;

import java.util.List;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/number-of-airplanes-in-the-sky/
 */
//Number of Airplanes in the Sky
//
//        21% Accepted
//        Given an interval list which are flying and landing time of the flight. How many airplanes are on the sky at most?
//
//        Have you met this question in a real interview? Yes
//        Example
//        For interval list [[1,10],[2,3],[5,8],[4,7]], return 3
//
//        Note
//        If landing and flying happens at the same time, we consider landing should happen at first.
public class M391NumberOfAirplanesInTheSky {
    /**
     * Definition of Interval:
     * public classs Interval {
     *     int start, end;
     *     Interval(int start, int end) {
     *         this.start = start;
     *         this.end = end;
     *     }
     */
    public class Interval

    {
        int start, end;
        Interval( int start, int end){
        this.start = start;
        this.end = end;
    }
    }
    /**
     * @param intervals: An interval array
     * @return: Count of airplanes are in the sky.
     */
//    public int countOfAirplanes(List<Interval> airplanes) {
//        // write your code here
//    }
}
