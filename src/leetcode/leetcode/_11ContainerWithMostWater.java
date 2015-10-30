package leetcode.leetcode;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>https://leetcode.com/problems/container-with-most-water/
 * answer link
 * https://leetcode.com/discuss/59635/easy-concise-java-o-n-solution-with-proof-and-explanation
 */
public class _11ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2) {
            return 0;
        }

        int start = 0;
        int end = height.length -1;
        int max = 0;
        while(start < end) {
            max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
