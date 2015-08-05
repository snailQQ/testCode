package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 */
//O(1) Check Power of 2
//
//        25% Accepted
//        Using O(1) time to check whether an integer n is a power of 2.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For n=4, return true;
//
//        For n=5, return false;
//
//        Challenge
//        O(1) time
//
//        Tags Expand

public class E142O1CheckPower2 {
    /*
 * @param n: An integer
 * @return: True or false
 */
    public boolean checkPowerOf2(int n) {
//        // write your code here
    if (n<=0) return false;
    boolean res = ((n & (n-1))==0) ? true : false;
    return res;
    }
}
