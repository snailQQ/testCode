package lin.E5_20150807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/3-sum/
 * http://www.cnblogs.com/springfor/p/3859670.html
 */
//3 Sum
//
//        19% Accepted
//        Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
// Find all unique triplets in the array which gives the sum of zero.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For example, given array S = {-1 0 1 2 -1 -4}, A solution set is:
//
//        (-1, 0, 1)
//        (-1, -1, 2)
//        Note
//        Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
//
//        The solution set must not contain duplicate triplets.
public class E57ThreeSum {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
//    solution 1
//    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
//        // write your code here
//        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
//        if(num == null || num.length < 3) {
//            return rst;
//        }
//        Arrays.sort(num);
//        for (int i = 0; i < num.length - 2; i++) {
//            if (i != 0 && num[i] == num[i - 1]) {
//                continue; // to skip duplicate numbers; e.g [0,0,0,0]
//            }
//
//            int left = i + 1;
//            int right = num.length - 1;
//            while (left < right) {
//                int sum = num[left] + num[right] + num[i];
//                if (sum == 0) {
//                    ArrayList<Integer> tmp = new ArrayList<Integer>();
//                    tmp.add(num[i]);
//                    tmp.add(num[left]);
//                    tmp.add(num[right]);
//                    rst.add(tmp);
//                    left++;
//                    right--;
//                    while (left < right && num[left] == num[left - 1]) { // to skip duplicates
//                        left++;
//                    }
//                    while (left < right && num[right] == num[right + 1]) { // to skip duplicates
//                        right--;
//                    }
//                } else if (sum < 0) {
//                    left++;
//                } else {
//                    right--;
//                }
//            }
//        }
//        return rst;
//    }

    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if(numbers == null || numbers.length < 3) {
            return rst;
        }

        HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();

        for(int i = 0; i < numbers.length - 2; i++) {
            int left = i + 1;
            int right = numbers.length - 1;
            while(left <right) {
                if(numbers[i] + numbers[left] + numbers[right] == 0) {
                    ArrayList<Integer> unit = new ArrayList<Integer>();
                    unit.add(numbers[i]);
                    unit.add(numbers[left]);
                    unit.add(numbers[right]);
                    if(!hashSet.contains(unit)) {
                        hashSet.add(unit);
                        rst.add(unit);
                    } else {
                        left++;
                        right--;
                    }
                } else if(numbers[i] + numbers[left] + numbers[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return rst;
    }
}
