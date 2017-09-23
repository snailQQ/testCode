package leetcode.leetcode.to320;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _296BestMeetingPoint {
    public static int minTotalDistance(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        List<Integer> I = new ArrayList<Integer>();
        List<Integer> J = new ArrayList<Integer>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    I.add(i);
                }
            }
        }
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m; i ++) {
                if(grid[i][j] == 1) {
                    J.add(j);
                }
            }
        }
        return minTotalDistance(I) + minTotalDistance(J);
    }

    public static int minTotalDistance(List<Integer> grid) {
        int i = 0, j = grid.size() - 1, sum = 0;

        while(i < j) {
            sum += grid.get(j--) - grid.get(i++);
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = minTotalDistance(new int[][]{{1,0,0,0,1},{0,0,0,0,0},{0,0,1,0,0}});
    }
}
