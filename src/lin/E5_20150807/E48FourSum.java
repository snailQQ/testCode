package lin.E5_20150807;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/4-sum/
 */
//4 Sum
//
//        18% Accepted
//        Given an array S of n integers, are there elements a, b, c,
// and d in S such that a + b + c + d = target?
// Find all unique quadruplets in the array which gives the sum of target.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For example, given array S = {1 0 -1 0 -2 2}, and target = 0. A solution set is:
//
//        (-1, 0, 0, 1)
//
//        (-2, -1, 1, 2)
//
//        (-2, 0, 0, 2)
//
//        Note
//        Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
//
//        The solution set must not contain duplicate quadruplets.
public class E48FourSum {
    /**
     * @param numbers : Give an array numbersbers of n integer
     * @param target : you need to find four elements that's sum of target
     * @return : Find all unique quadruplets in the array which gives the sum of
     *           zero.
     */
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        //write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);

        for (int i = 0; i < num.length - 3; i++) {
            if (i != 0 && num[i] == num[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < num.length - 2; j++) {
                if (j != i + 1 && num[j] == num[j - 1])
                    continue;

                int left = j + 1;
                int right = num.length - 1;
                while (left < right) {
                    int sum = num[i] + num[j] + num[left] + num[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(num[i]);
                        tmp.add(num[j]);
                        tmp.add(num[left]);
                        tmp.add(num[right]);
                        rst.add(tmp);
                        left++;
                        right--;
                        while (left < right && num[left] == num[left - 1]) {
                            left++;
                        }
                        while (left < right && num[right] == num[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }

        return rst;
    }

}
