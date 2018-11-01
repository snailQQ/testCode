package leetcode.leetcode.to360;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by SNAILQQ on 10/27/17.
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.

 https://www.jiuzhang.com/solution/intersection-of-two-arrays/
 */
public class _349IntersectionOfTwoArrays {
  public static int[] intersection(int[] nums1, int[] nums2) {
    if(nums1 == null || nums2 == null) {
      return new int[]{};
    }

    Set<Integer> n1 = new HashSet<Integer>();
    for(int num : nums1) {
      n1.add(num);
    }

    Set<Integer> n2 = new HashSet<Integer>();
    for(int num : nums2) {
      if(n1.contains(num)) {
        n2.add(num);
      }
    }

    int[] result = new int[n2.size()];
    int i = 0;
    for(int num : n2) {
      result[i++] = num;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] a = new int[]{1,2,2,1};
    int[] b = new int[]{2,2};
    int[] c = intersection(a,b);
    for(int n: c) {
      System.out.println(n);
    }
  }
}
