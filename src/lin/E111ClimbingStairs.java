//package lin;
//
///**
// * Created by Paul on 8/2/15.
// * http://www.lintcode.com/en/problem/climbing-stairs/
// */
////Climbing Stairs
////
////        40% Accepted
////        You are climbing a stair case. It takes n steps to reach to the top.
////
////        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
////
////        Have you met this question in a real interview? Yes
////        Example
////        Given an example n=3 , 1+1+1=2+1=1+2=3
////
////        return 3
//public class E111ClimbingStairs {
//    /**
//     * @param n: An integer
//     * @return: An integer
//     */
//    public int climbStairs(int n) {
//        // write your code here
////        if(n == 0 || n == 1) {
////            return 1;
////        } else {
////            return climbStairs(n - 1) + climbStairs(n - 2);
////        }
//
//        if(n <= 1) {
//            return n;
//        }
//        int last = 1;
//        int lastLast = 1;
//        int returnValue = 0;
//        for(int i = 2; i<= n; i++) {
//            returnValue = last + lastLast;
//            lastLast = last;
//            last = returnValue;
//        }
//            return returnValue;
//    }
//}
