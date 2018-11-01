package leetcode.leetcode.to360;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by SNAILQQ on 10/27/17.
 *
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 Note:
 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.
 Follow up:
 What if the given array is already sorted? How would you optimize your algorithm?
 What if nums1's size is small compared to nums2's size? Which algorithm is better?
 What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class _350IntersectionOfTwoArraysII {
  public static int[] intersect(int[] nums1, int[] nums2) {
    if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
      return new int[]{};
    }

    HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
    for(int n : nums1) {
      if(hm.containsKey(n)) {
        hm.put(n, hm.get(n)+1);
      } else {
        hm.put(n, 1);
      }
    }

    List<Integer> list = new ArrayList<Integer>();

    for(int n : nums2) {
      if(hm.containsKey(n) && hm.get(n) > 0) {
        list.add(n);
        hm.put(n, hm.get(n) - 1);
      }
    }

    int[] result = new int[list.size()];
    for(int i = 0; i < list.size(); i++ ) {
      result[i] = list.get(i);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] a = new int[]{1,2,2,1};
    int[] b = new int[]{2,2};
    int[] c = intersect(a,b);
    for(int n: c) {
      System.out.println(n);
    }
  }
}
