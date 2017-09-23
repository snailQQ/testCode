package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/climbing-stairs/description/
 * <p/>
 * You are climbing a stair case. It takes n steps to reach to the top.

   Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

   Note: Given n will be a positive integer.
 * answer link
 */
public class _70ClimbingStairs {
  public int climbStairs(int n) {
    if(n == 1) {
      return 1;
    }

    if(n == 2) {
      return 2;
    }

    int[] stepsForI = new int[n];
    stepsForI[0] = 1;
    stepsForI[1] = 2;

    for(int i = 2; i < n; i++) {
      stepsForI[i] = stepsForI[i-1] + stepsForI[i-2];
    }

    return stepsForI[n-1];
  }
}
