package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * Implement pow(x, n).
 * <p/>
 * answer link
 * http://www.cnblogs.com/springfor/p/3870929.html
 * 题解：

 pow(x,n)就是求x的n次方。x的N次方可以看做：x^n = x^(n/2)*x^(n/2)*x^(n%2)。
 所以利用递归求解，当n==1的时候，x^n=x。

 当然n是可以小于0的，2^(-3) = 1/(2^3)。按照上面那个规律就可以解决了。


 */
public class _50PowXN {
  public static double myPow(double x, int n) {
    if(n == 0) {
      return 1;
    }

    double temp = x;

    temp = myPow(x, n/2);

    if(n % 2 == 0) {
      return temp * temp;
    } else {
      if(n > 0) {
        return x * temp * temp;
      } else {
        return (temp * temp) / x;
      }
    }

  }
}
