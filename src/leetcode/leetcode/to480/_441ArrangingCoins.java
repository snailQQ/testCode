package leetcode.leetcode.to480;

/**
 * Created by SNAILQQ on 10/27/17.
 *
 * https://leetcode.com/problems/arranging-coins/description/
 *
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

 Given n, find the total number of full staircase rows that can be formed.

 n is a non-negative integer and fits within the range of a 32-bit signed integer.

 Example 1:

 n = 5

 The coins can form the following rows:
 ¤
 ¤ ¤
 ¤ ¤

 Because the 3rd row is incomplete, we return 2.
 Example 2:

 n = 8

 The coins can form the following rows:
 ¤
 ¤ ¤
 ¤ ¤ ¤
 ¤ ¤

 Because the 4th row is incomplete, we return 3.
 */
public class _441ArrangingCoins {

  public static int arrangeCoins(int n) {
    if(n <= 1) {
      return n;
    }

    long start = 1;
    long end = n;
    while(start + 1 < end) {
      long mid = start + (end - start) / 2;
      if(mid * (mid + 1) / 2 <= n) {
        start = mid;
      } else {
        end = mid;
      }
    }
    return (int)start;
  }

  public static void main(String[] args) {
    System.out.println(arrangeCoins(5));
    System.out.println(arrangeCoins(6));
    System.out.println(arrangeCoins(7));
    System.out.println(arrangeCoins(8));
    System.out.println(arrangeCoins(9));
    System.out.println(arrangeCoins(10));
    System.out.println(arrangeCoins(11));
    System.out.println(arrangeCoins(12));
    System.out.println(arrangeCoins(13));
    System.out.println(arrangeCoins(14));
    System.out.println(arrangeCoins(15));
    System.out.println(arrangeCoins(16));
    System.out.println(arrangeCoins(17));
    System.out.println(arrangeCoins(18));
    System.out.println(arrangeCoins(19));
    System.out.println(arrangeCoins(20));
    System.out.println(arrangeCoins(21));
    System.out.println(arrangeCoins(22));



  }

}
