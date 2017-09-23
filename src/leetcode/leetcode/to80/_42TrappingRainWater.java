package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/trapping-rain-water/
 * answer link
 */
public class _42TrappingRainWater {
    public int trap(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }

        int[] left = new int[height.length];
        int[] right = new int[height.length];

        left[0] = height[0];
        int max = left[0];
        for(int i = 1; i < height.length; i++) {
            left[i] = Math.max(height[i], max);
            max = Math.max(height[i], max);
        }

        right[height.length-1] = height[height.length-1];
        max = right[height.length-1];
        for(int i = height.length-2; i>=0; i--) {
            right[i] = Math.max(height[i], max);
            max = Math.max(height[i], max);
        }

        int total = 0;
        for(int i = 1; i < height.length-1; i++) {
            int number = Math.min(left[i], right[i]) - height[i];
            if(number > 0) {
                total += number;
            }
        }
        return total;
    }
}
