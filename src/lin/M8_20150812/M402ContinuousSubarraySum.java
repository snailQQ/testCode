package lin.M8_20150812;

import java.util.ArrayList;

/**
 * Created by Paul on 8/11/15.
 * http://www.lintcode.com/en/problem/continuous-subarray-sum/
 */
//Continuous Subarray Sum
//
//        20% Accepted
//        Given an integer array, find a continuous subarray where the sum of numbers is the biggest.
// Your code should return the index of the first number and the index of the last number.
// (If their are duplicate answer, return anyone)
//
//        Have you met this question in a real interview? Yes
//        Example
//        Give [-3, 1, 3, -3, 4], return [1,4].
//
//        Tags Expand
public class M402ContinuousSubarraySum {
    /**
     * @param A an integer array
     * @return  A list of integers includes the index of the first number and the index of the last number
     */
    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        // Write your code here
        ArrayList<Integer> rst = new ArrayList<Integer>();
        if(A == null || A.length == 0) {
            return rst;
        }

        int[] count = new int[A.length];
        count[0] = A[0];
        int begin = 0;
        int end = 0;
        rst.add(begin);
        rst.add(end);
        int max = count[0];


        for(int i = 1; i<A.length; i++) {
            if(count[i-1] < 0) {
                count[i] = A[i];
                begin = i;
                end = i;
                if(max < count[i]) {
                    max = count[i];
                    rst.set(0, begin);
                    rst.set(1, end);
                }
            } else {
                count[i] = A[i] + count[i-1];
                if(max < count[i]) {
                    max = count[i];
                    rst.set(0, begin);
                    rst.set(1, i);
                }

            }
        }

        return rst;
    }
}
