package lin.M6_20150810;

/**
 * Created by Paul on 8/9/15.
 * http://www.lintcode.com/en/problem/a-b-problem/
 */
//A + B Problem
//
//        54% Accepted
//        Write a function that add two numbers A and B. You should not use + or any arithmetic operators.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given a=1 and b=2 return 3
//
//        Note
//        There is no need to read data from standard input stream. Both parameters are given in function aplusb, you job is to calculate the sum and return it.
//
//        Challenge
//        Of course you can just return a + b to get accepted. But Can you challenge not do it like that?
//
//        Clarification
//        Are a and b both 32-bit integers?
//
//        Yes.
//        Can I use bit operation?
//
//        Sure you can.
public class M1APlusB {
    /*
 * param a: The first integer
 * param b: The second integer
 * return: The sum of a and b
 */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return aplusb(sum, carry);
    }
}
