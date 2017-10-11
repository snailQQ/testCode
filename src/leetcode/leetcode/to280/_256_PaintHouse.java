package leetcode.leetcode.to280;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _256_PaintHouse {
  public int minCost(int[][] costs) {
    // write your code here
    if(costs == null || costs.length == 0 || costs[0].length == 0) {
      return 0;
    }

    int row = costs.length;

    int[][] anArray = new int[row][3];

    for(int i= 0; i < row; i++) {
      for(int j = 0; j < 3; j++) {
        if(i == 0) {
          anArray[i][j] = costs[i][j];
        } else {
          if(j == 0) {
            anArray[i][0] = Math.min(anArray[i-1][1], anArray[i-1][2])
                +  costs[i][j];
          } else if(j == 1) {
            anArray[i][1] = Math.min(anArray[i-1][0], anArray[i-1][2])
                +  costs[i][j];
          } else {
            anArray[i][2] = Math.min(anArray[i-1][0], anArray[i-1][1])
                +  costs[i][j];
          }
        }
      }
    }

    return Math.min(Math.min(anArray[row-1][0], anArray[row-1][1]), anArray[row-1][2]);
  }
}
