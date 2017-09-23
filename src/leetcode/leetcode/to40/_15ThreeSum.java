package leetcode.leetcode.to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>https://leetcode.com/problems/3sum/
 * answer link
 */
public class _15ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> unit = new ArrayList<Integer>();
                    unit.add(nums[i]);
                    unit.add(nums[left]);
                    unit.add(nums[right]);
                    list.add(unit);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                } else if(sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return list;
    }
}
