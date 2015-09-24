package leetcode;

import java.util.HashSet;

/**
 * Created by Paul on 9/23/15.
 * https://leetcode.com/problems/happy-number/
 * http://www.jianshu.com/p/f7b632e31d5f
 *
 */
//Happy Number My Submissions Question Solution
//        Total Accepted: 32078 Total Submissions: 98710 Difficulty: Easy
//        Write an algorithm to determine if a number is "happy".
//
//        A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
//
//        Example: 19 is a happy number
//
//        12 + 92 = 82
//        82 + 22 = 68
//        62 + 82 = 100
//        12 + 02 + 02 = 1
//        Credits:
//        Special thanks to @mithmatt and @ts for adding this problem and creating all test cases.
//
//        Hide Tags Hash Table Math
//        Hide Similar Problems (E) Add Digits (E) Ugly Number

public class LeetE202HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        while(n != 1) {
            if(hs.contains(n)) {
                return false;
            }
            hs.add(n);
            n = getNextHappy(n);
        }
        return true;
    }

    private static int getNextHappy(int n) {
        int sum = 0;
        while(n > 0) {
            int a = n % 10;
            sum += a * a;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean a = isHappy(7);
    }
}
