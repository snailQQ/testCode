//package lin.E5_20150807;
//
///**
// * Created by Paul on 8/6/15.
// * http://www.lintcode.com/en/problem/unique-paths-ii/
// * http://www.jiuzhang.com/solutions/unique-paths-ii/
// */
////Unique Paths II
////
////        27% Accepted
////        Follow up for "Unique Paths":
////
////        Now consider if some obstacles are added to the grids. How many unique paths would there be?
////
////        An obstacle and empty space is marked as 1 and 0 respectively in the grid.
////
////        Have you met this question in a real interview? Yes
////        Example
////        For example,
////        There is one obstacle in the middle of a 3x3 grid as illustrated below.
////
////        [
////        [0,0,0],
////        [0,1,0],
////        [0,0,0]
////        ]
////        The total number of unique paths is 2.
////
////        Note
////        m and n will be at most 100.
//public class E115UniquePath2 {
//    /**
//     * @param obstacleGrid: A list of lists of integers
//     * @return: An integer
//     */
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        // write your code here
//        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
//            return 0;
//        }
//
//        int row = obstacleGrid.length;
//        int col = obstacleGrid[0].length;
//
//        int[][] anArray = new int[row][col];
//
//        for(int i = 0; i < col; i++) {
//            if(obstacleGrid[0][i] == 1) {
//                anArray[0][i] = 0;
//            } else {
//              if(i != 0 && anArray[0][i-1] == 0) {
//                  anArray[0][i] = 0;
//              }else {
//                  anArray[0][i] = 1;
//              }
//            }
//        }
//
//        for(int i = 0; i < row; i++) {
//            if(obstacleGrid[i][0] == 1) {
//                anArray[i][0] = 0;
//            } else {
//                if(i != 0 && anArray[i-1][0] == 0) {
//                    anArray[i][0] = 0;
//                }else {
//                    anArray[i][0] = 1;
//                }
//            }
//        }
//
//        for(int i = 1; i < row; i++) {
//            for(int j = 1; j < col; j++) {
//                if(obstacleGrid[i][j] == 1) {
//                    anArray[i][j] = 0;
//                } else {
//                    anArray[i][j] = anArray[i-1][j] + anArray[i][j-1];
//                }
//            }
//        }
//
//        return anArray[row-1][col-1];
//    }
//}
