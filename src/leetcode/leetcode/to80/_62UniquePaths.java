package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _62UniquePaths {
  public static int uniquePaths(int m, int n) {
    if(m == 0 || n == 0) {
      return 1;
    }

    int[][] anArray = new int[m][n];

    for(int i = 0; i < n; i ++) {
      anArray[0][i] = 1;
    }

    for(int i = 0; i < m; i++) {
      anArray[i][0] = 1;
    }

    for(int i = 1; i < m; i++) {
      for(int j = 1; j < n; j++) {
        anArray[i][j] = anArray[i-1][j] + anArray[i][j-1];
      }
    }

    return anArray[m-1][n-1];
  }

  public static void main(String[] args) {
    int a = uniquePaths(3,7);

    System.out.println(a);
  }
}
