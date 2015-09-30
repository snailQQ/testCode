package leetcode;

/**
 * Created by Paul on 9/25/15.
 */
//Contains Duplicate II My Submissions Question Solution
//        Total Accepted: 27322 Total Submissions: 103346 Difficulty: Easy
//        Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
//
//        Hide Tags Array Hash Table
//        Hide Similar Problems (E) Contains Duplicate (M) Contains Duplicate III

public class LeetEContainsDupliacate2_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length < k) {
            return false;
        }

        for(int i = 0; i <= nums.length - k; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] && j-i <= k) {
                    return true;
                }
            }
        }

        return false;
    }
}
