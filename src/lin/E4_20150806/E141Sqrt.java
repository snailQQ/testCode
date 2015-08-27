package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/sqrtx/
 * http://www.cnblogs.com/yuzhangcmu/p/4198959.html
 */
//Sqrt(x)
//
//        23% Accepted
//        Implement int sqrt(int x).
//
//        Compute and return the square root of x.
//
//        Have you met this question in a real interview? Yes
//        Example
//        sqrt(3) = 1
//
//        sqrt(4) = 2
//
//        sqrt(5) = 2
//
//        sqrt(10) = 3
//
//        Challenge
//        O(log(x))
public class E141Sqrt {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public static int sqrt(int x) {
        // write your code here
        long left = 0;
        long right = x;

        while(left < right) {
            long mid = left + (right - left) / 2;
            if(mid * mid == x) {
                return (int)mid;
            } else if(mid * mid > x) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return (int)right;
    }

    public static void main(String [] args) {
//        int a = sqrt(90);
       int a = sqrt(80);
        a = sqrt(82);

    }

}
