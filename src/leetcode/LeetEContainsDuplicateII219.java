package leetcode;

import java.util.HashMap;

/**
 * Created by Paul on 9/30/15.
 */
public class LeetEContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        if(nums == null || nums.length == 0) {
            return false;
        }

        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                if(i - hm.get(nums[i]) <= k) {
                    return true;
                } else {
                    hm.remove(nums[i]);
                    hm.put(nums[i], i);
                }
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }
}
