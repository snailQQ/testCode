package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/sqrtx/description/
 * Implement int sqrt(int x).

 Compute and return the square root of x.
 * <p/>
 * answer link
 */
public class _69Sqrt {
  public static int mySqrt_BinarySearch(int x) {
    if(x == 0) {
      return 0;
    }
    int start = 1;
    int end = x;
    while(start + 1 < end) {
      int mid = start + (end - start) / 2;
      if(mid < x / mid && (mid + 1) > x / (mid + 1)) {
        return mid;
      } else if(mid > x / mid) {
        end = mid;
      } else {
        start = mid ;
      }
    }
    return start;
  }

  public static void main(String[] args) {
//    System.out.println(mySqrt(1));
//    System.out.println(mySqrt(2));
//    System.out.println(mySqrt(3));
//    System.out.println(mySqrt(4));
//    System.out.println(mySqrt(5));
//    System.out.println(mySqrt(6));
//    System.out.println(mySqrt(7));
//    System.out.println(mySqrt(8));
//    System.out.println(mySqrt(9));
//    System.out.println(mySqrt(10));

  }
}
