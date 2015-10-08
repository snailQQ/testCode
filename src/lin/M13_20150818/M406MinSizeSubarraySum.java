package lin.M13_20150818;

/**
 * Created by Paul on 8/17/15.
 * http://www.lintcode.com/en/problem/minimum-size-subarray-sum/
 */
//Minimum Size Subarray Sum
//
//        23% Accepted
//        Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return -1 instead.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given the array [2,3,1,2,4,3] and s = 7, the subarray [4,3] has the minimal length under the problem constraint.
//
//        Challenge
//        If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).
public class M406MinSizeSubarraySum {
    /**
     * @param nums: an array of integers
     * @param s: an integer
     * @return: an integer representing the minimum size of subarray
     */
    public static int minimumSize(int[] nums, int s) {
        // write your code here
//        if(nums == null || nums.length == 0) {
//            return 0;
//        }
//
//        int sum = 0;
//        int left = 0;
//        int right = 0;
//        int min = Integer.MAX_VALUE;
//        while(right < nums.length) {
//            while(sum < s && right < nums.length) {
//                sum += nums[right];
//                right++;
//            }
//            while(sum >= s) {
//                min = Math.min(min, right-left);
//                sum -= nums[left];
//                left++;
//            }
//        }
//        return min;
        int j = 0, i = 0;
        int sum =0;
        int ans = Integer.MAX_VALUE;
        for(i = 0; i < nums.length; i++) {
            while(j < nums.length && sum < s ) {
                sum += nums[j];
                j ++;
            }
            if(sum >=s)
                ans = Math.min(ans, j - i  );
            sum -= nums[i];
        }
        if(ans == Integer.MAX_VALUE)
            ans = -1;
        return ans;

    }

    public static void main(String[] args) {
        int a = minimumSize(new int[]{1,2,3,4,5}, 11);
    }
}
