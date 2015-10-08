package leetcode;

/**
 * Created by Paul on 10/1/15.
 */
public class LeetMPaintHouse256 {
    public static int minCost(int[][] costs) {
        if(costs == null || costs.length == 0 || costs[0].length == 0) {
            return 0;
        }
        int row = costs.length;
        int col = costs[0].length;

        int[][] dp = new int[row][col];

        for(int i = 0; i < col; i++) {
            dp[0][i] = costs[0][i];
        }

        for(int i = 1; i < row; i++) {
            for(int j = 0; j < col; j++) {
                int min = Integer.MAX_VALUE;
                for(int k = 0; k < col; k++) {
                    if(j != k) {
                        min = Math.min(min, dp[i-1][k]);
                    }
                }
                dp[i][j] = costs[i][j] + min;
            }
        }

        int rst = Integer.MAX_VALUE;
        for(int i = 0; i < col; i++) {
            rst = Math.min(rst, dp[row-1][i]);
        }
        return rst;

    }

    public static void main(String[] args) {
//        int a = minCost(new int[][]{{20,18,4},{9,9,10}});
        int a = minCost(new int[][]{{17,2,17},{16,16,5},{14,3,19}});
    }
}
