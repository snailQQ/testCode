package leetcode.leetcode.to160;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/max-points-on-a-line/
 * answer link
 * http://www.cnblogs.com/springfor/p/3896120.html
 */
public class _149MaxPointsOnALine {
    /**
     * Definition for a point.
     * class Point {
     *     int x;
     *     int y;
     *     Point() { x = 0; y = 0; }
     *     Point(int a, int b) { x = a; y = b; }
     * }
     */
    static class Point {
        int x;
        int y;
        Point() { x = 0; y = 0; }
        Point(int a, int b) { x = a; y = b; }
    }

    public static int maxPoints(Point[] points) {
        if(points == null || points.length == 0) {
            return 0;
        }
        int max = 1;

        for(int i = 0; i < points.length; i++) {
            Map<Double, Integer> hm = new HashMap<Double, Integer>();
            int dup = 0;
            int tempMax = 1;
            for(int j = 0; j < points.length; j++) {
                if(i == j) {
                    continue;
                }
                if(points[j].x == points[i].x && points[j].y == points[i].y) {
                    dup++;
                    continue;
                }

                double key = ((double)(points[i].y - points[j].y))/(points[i].x - points[j].x);

                if(hm.containsKey(key))
                    hm.put(key, hm.get(key) + 1);
                else
                    hm.put(key, 2);  //two points form a line
            }

            for(Integer number : hm.values()) {
                tempMax = Math.max(tempMax, number);
            }

            max = Math.max(max, tempMax + dup);
        }
        return max;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        int a = maxPoints(new Point[]{p1, p2});
    }
}
