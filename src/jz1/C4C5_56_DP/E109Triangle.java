package jz1.C4C5_56_DP;

import java.util.ArrayList;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/triangle/
 * http://www.cnblogs.com/springfor/p/3887908.html
 */
//Triangle
//
//        25% Accepted
//        Given a triangle, find the minimum path sum from top to bottom.
// Each step you may move to adjacent numbers on the row below.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For example, given the following triangle
//
//        [
//        [2],
//        [3,4],
//        [6,5,7],
//        [4,1,8,3]
//        ]
//        The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
//
//        Note
//        Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
//

public class E109Triangle {
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // write your code here

        if(triangle == null || triangle.size() == 0) {
            return 0;
        }

        int[] dp = new int[triangle.size()];

        //计算最下层
        for(int i = 0; i < triangle.size(); i++) {
            dp[i] = triangle.get(triangle.size()-1).get(i);
        }

        for(int i = triangle.size()-2; i >= 0; i-- ) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
//        if (triangle == null || triangle.size() == 0) {
//            return 0;
//        }
//
//        int n = triangle.size();
//        int[][] sum = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            sum[n - 1][i] = triangle.get(n - 1).get(i);
//        }
//
//        for (int i = n - 2; i >= 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                sum[i][j] = Math.min(sum[i + 1][j], sum[i + 1][j + 1]) + triangle.get(i).get(j);
//            }
//        }
//
//        return sum[0][0];

//solution 3
//        if(triangle == null || triangle.size() == 0) {
//            return 0;
//        }
//
//        int[][] dp = new int[triangle.size()][triangle.get(triangle.size()-1).size()];
//
//        for(int i = 0; i < triangle.get(triangle.size()-1).size(); i++) {
//            dp[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
//        }
//
//        for(int i = triangle.size()-2; i >= 0; i--) {
//            for(int j = 0; j < triangle.get(i).size(); j++) {
//                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + triangle.get(i).get(j);
//            }
//        }
//
//        return dp[0][0];
    }
}
