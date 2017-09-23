package leetcode.leetcode.to200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/missing-ranges/
 * answer link
 */
public class _163_MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<String>();
        if(nums == null || nums.length == 0) {
            if(lower == upper) {
                list.add("" + lower);
            } else {
                list.add("" + lower + "->" + upper);
            }
            return list;
        }

        if(lower < nums[0]) {
            if(nums[0] - lower > 1) {
                list.add("" + lower + "->" + (nums[0] - 1));
            } else {
                list.add("" + lower);
            }
        }

        for(int i = 1; i < nums.length; i++) {
            if((nums[i] - nums[i-1]) > 1) {
                if((nums[i] - nums[i-1]) == 2) {
                    list.add("" + (nums[i]-1));
                } else {
                    list.add("" + (nums[i-1]+1) + "->" + (nums[i]-1));
                }
            }
        }

        if(nums[nums.length-1] < upper) {
            if(upper - nums[nums.length-1]> 1) {
                list.add("" + (nums[nums.length-1]+1) + "->" + upper);
            } else {
                list.add("" + upper);
            }
        }
        return list;
    }
}
