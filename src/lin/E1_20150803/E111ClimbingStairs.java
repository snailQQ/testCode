package lin.E1_20150803;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/climbing-stairs/
 */
//Climbing Stairs
//
//        40% Accepted
//        You are climbing a stair case. It takes n steps to reach to the top.
//
//        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given an example n=3 , 1+1+1=2+1=1+2=3
//
//        return 3
public class E111ClimbingStairs {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if(n <= 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return n;
        }


        int pre = 1;
        int count = 2;

        for(int i = 3; i <= n; i++) {
            int tmp = count;
            count = pre + count;
            pre = tmp;
        }

        return count;
    }
}
