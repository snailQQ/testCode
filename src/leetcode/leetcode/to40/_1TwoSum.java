package leetcode.leetcode.to40;


import java.util.HashMap;

/**
 * Created by Paul on 10/27/15.
 */
//题目
//https://leetcode.com/problems/two-sum/
//答案
//http://www.cnblogs.com/springfor/p/3859618.html
public class _1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] rst = new int[2];
        if(nums == null || nums.length == 0) {
            return rst;
        }

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target-nums[i])) {
                rst[0] = hm.get(target-nums[i])+1;
                rst[1] = i+1;
                return rst;
            } else {
                hm.put(nums[i], i);
            }
        }

        return rst;
    }

    public void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(_1TwoSum.this.twoSum(nums, target));

    }
}
