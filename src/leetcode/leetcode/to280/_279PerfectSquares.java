package leetcode.leetcode.to280;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _279PerfectSquares {
  public static int numSquares(int n) {
    // write your code here
    if(n == 0) {
      return 1;
    }

    int[] numArray = new int[n+1];

    for(int i = 1; i <= n; i++) {
      if(i == 1) {
        numArray[i] = 1;
        continue;
      }
      numArray[i] = Integer.MAX_VALUE;
      for(int j = 1; j*j <= i; j++) {
        numArray[i] = Math.min(numArray[i-j*j]+1, numArray[i]);
      }

    }
    return numArray[n];
  }

  public static void main(String[] args) {
    System.out.println(numSquares(12));
  }
}
