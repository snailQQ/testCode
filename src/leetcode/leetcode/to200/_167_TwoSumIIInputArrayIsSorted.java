package leetcode.leetcode.to200;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paul on 11/17/15.
 * question link https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 * <p/>
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution and you may not use the same element twice.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 * answer link
 */
public class _167_TwoSumIIInputArrayIsSorted {
  public static int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    if(numbers == null || numbers.length <= 1) {
      return result;
    }

    Map<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
    for(int i = 0; i < numbers.length; i++) {
      if(hashMap.containsKey(target-numbers[i])) {
        result[0] = hashMap.get(target-numbers[i])+1;
        result[1] = i+1;
      } else {
        hashMap.put(numbers[i], i);
      }
    }
    return result;
  }

  public static int[] twoSum2(int[] numbers, int target) {
    int[] result = new int[2];
    if(numbers == null || numbers.length <= 1) {
      return result;
    }

    int start = 0;
    int end = numbers.length - 1;
    while(start < end) {
      if(numbers[start] + numbers[end] == target) {
        result[0] = start+1;
        result[1] = end+1;
        break;
      } else if(numbers[start] + numbers[end] < target) {
        start++;
      } else {
        end--;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] a = new int[]{2, 7, 11, 15};
    int[] result = twoSum2(a, 18);
    for(int i : result) {
      System.out.println(i);
    }
  }
}
