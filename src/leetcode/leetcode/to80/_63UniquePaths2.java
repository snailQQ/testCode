package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _63UniquePaths2 {

  public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
      return 0;
    }

    int row = obstacleGrid.length;
    int col = obstacleGrid[0].length;

    int[][] anArray = new int[row][col];

    for(int i = 0; i < col; i++) {
      if(obstacleGrid[0][i] == 0) {
        if(i != 0 && anArray[0][i-1] == 0) {
          anArray[0][i] = 0;
        } else {
          anArray[0][i] = 1;
        }
      } else {
        anArray[0][i] = 0;
      }
    }

    for(int i = 0; i < row; i++) {
      if(obstacleGrid[i][0] == 0) {
        if(i != 0 && anArray[i-1][0] == 0) {
          anArray[i][0] = 0;
        } else {
          anArray[i][0] = 1;
        }
      } else {
        anArray[i][0] = 0;
      }
    }

    for(int i = 1 ; i < row; i++) {
      for(int j = 1; j < col; j++) {
        if(obstacleGrid[i][j] == 1) {
          anArray[i][j] = 0;
        } else {
          anArray[i][j] = anArray[i-1][j] + anArray[i][j-1];
        }
      }
    }

    for(int i = 0; i < anArray.length; i++) {
      for(int j = 0; j <anArray[0].length; j++) {
        System.out.print(anArray[i][j]+ " ");
      }
      System.out.println();
    }


    return anArray[row-1][col-1];
  }

  public static void main(String[] args) {
    int[][] a = {{0,0}};

    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j <a[0].length; j++) {
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }

    System.out.println(uniquePathsWithObstacles(a));
  }
}
