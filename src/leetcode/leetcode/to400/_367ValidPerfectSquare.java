package leetcode.leetcode.to400;

/**
 * Created by pengcheng.qi on 10/27/17.
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

 Note: Do not use any built-in library function such as sqrt.

 Example 1:

 Input: 16
 Returns: True
 Example 2:

 Input: 14
 Returns: False
 http://www.cnblogs.com/grandyang/p/5619296.html
 */
public class _367ValidPerfectSquare {

  public static boolean isPerfectSquare(int num) {
    if(num == 1) {
      return true;
    }
    long start = 1;
    long end = num;
    while(start + 1 < end) {
      long mid = start + (end - start) / 2;
      if(mid * mid == num) {
        return true;
      } else if( mid * mid < num) {
        start = mid;
      } else {
        end = mid;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    System.out.println(isPerfectSquare(808201));
    System.out.println(isPerfectSquare(2));
    System.out.println(isPerfectSquare(3));
    System.out.println(isPerfectSquare(4));
    System.out.println(isPerfectSquare(5));
    System.out.println(isPerfectSquare(6));
    System.out.println(isPerfectSquare(7));
    System.out.println(isPerfectSquare(8));
    System.out.println(isPerfectSquare(9));
    System.out.println(isPerfectSquare(10));
    System.out.println(isPerfectSquare(11));
    System.out.println(isPerfectSquare(12));
    System.out.println(isPerfectSquare(13));
    System.out.println(isPerfectSquare(14));
    System.out.println(isPerfectSquare(15));
    System.out.println(isPerfectSquare(16));
    System.out.println(isPerfectSquare(17));
    System.out.println(isPerfectSquare(18));
    System.out.println(isPerfectSquare(19));
    System.out.println(isPerfectSquare(20));

  }

}
