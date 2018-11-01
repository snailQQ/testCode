package leetcode.leetcode.to400;

/**
 * Created by SNAILQQ on 10/17/17.
 * Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.

 Example1:

 a = 2
 b = [3]

 Result: 8
 Example2:

 a = 2
 b = [1,0]

 Result: 1024
 */
public class _372SuperPow {
    public static int superPow(int a, int[] b) {
      if(b == null || b.length == 0) {
        return 1;
      }
      int res = 1;
      for(int i = 0; i < b.length; i++) {
        res = myPow(res, 10) * myPow(a, b[i]) % 1337;
      }
      return (int)res;
    }

    public static int myPow(int x, int n) {
      if(n == 0) {
        return 1;
      }

      if(n == 1) {
        return x % 1337;
      }

      return myPow(x % 1337, n/2) * myPow(x % 1337, n-n/2) % 1337;
    }

  public static void main(String[] args) {
    System.out.println(superPow(2, new int[]{1,0}));
  }

}
