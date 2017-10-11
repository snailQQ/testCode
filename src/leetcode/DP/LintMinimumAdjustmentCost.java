//package leetcode.DP;
//
//import java.util.List;
//
///**
// * Created by pengcheng.qi on 10/7/17.
// * Given an integer array, adjust each integers so that the difference of every adjacent integers are not greater than a given number target.
//
// If the array before adjustment is A, the array after adjustment is B, you should minimize the sum of |A[i]-B[i]|
//
// Notice
//
// You can assume each number in the array is a positive integer and not greater than 100.
//
// Have you met this question in a real interview? Yes
// Example
// Given [1,4,2,3] and target = 1, one of the solutions is [2,3,2,3], the adjustment cost is 2 and it's minimal.
//
// Return 2.
// http://www.lintcode.com/en/problem/minimum-adjustment-cost/
// */
//public class LintMinimumAdjustmentCost {
//  /*
// * @param A: An integer array
// * @param target: An integer
// * @return: An integer
// */
//  public static int MinAdjustmentCost(List<Integer> A, int target) {
//    // write your code here
//    if(A == null || A.size() <= 1 ) {
//      return 0;
//    }
//
//    int min;
//    int max;
//
//    int dpMin = 0;
//    int dpMax = 0;
//
//    if(A.get(0) > A.get(1)) {
//      min = A.get(1);
//      max = A.get(0);
//    } else {
//      min = A.get(0);
//      max = A.get(1);
//    }
//
//    if(Math.abs(max - min) >= target) {
//      min++;
//      max++;
//      dpMin = min + (max - target);
//    }
//
//    for(int i = 2; i < A.size(); i++) {
//
//    }
//
//
//  }
//
//}
