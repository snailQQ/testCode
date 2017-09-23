package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link https://leetcode.com/problems/range-sum-query-immutable/description/
 *
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

 Example:
 Given nums = [-2, 0, 3, -5, 2, -1]

 sumRange(0, 2) -> 1
 sumRange(2, 5) -> -1
 sumRange(0, 5) -> -3
 Note:
 You may assume that the array does not change.
 There are many calls to sumRange function.
 * <p/>
 * answer link
 */
public class _303RangeSumQueryImmutable {
  private int[] sums;

  public _303RangeSumQueryImmutable(int[] nums) {
    if(nums == null || nums.length == 0) {
      throw new ExceptionInInitializerError();
    }
    this.sums = new int[nums.length];
    sums[0] = nums[0];
    for(int i = 1; i<nums.length; i++) {
      sums[i] = sums[i-1] + nums[i];
      System.out.println(i +" " + sums[i] );
    }
  }

  public int sumRange(int i, int j) throws Exception {
    if(i < 0 || j > this.sums.length -1) {
      throw new Exception();
    }

    if(i == 0) {
      return sums[j];
    }

    return sums[j] - sums[i-1];
  }

  public static void main(String[] args) throws Exception {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    _303RangeSumQueryImmutable abc = new _303RangeSumQueryImmutable(nums);

    System.out.println(abc.sumRange(0,2));
    System.out.println(abc.sumRange(2,5));
    System.out.println(abc.sumRange(0,5));
  }
}
