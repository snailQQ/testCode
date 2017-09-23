package leetcode.leetcode.to120;

import java.util.Stack;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/largest-rectangle-in-histogram/
 * answer link
 * http://www.cnblogs.com/springfor/p/3869449.html
 * https://www.youtube.com/watch?v=ZmnqCZp9bBs
 */
public class _84LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] height) {
if(height == null || height.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        for(int i = 0; i < height.length;) {
            if(stack.isEmpty() || height[stack.peek()] <= height[i]) {
                stack.push(i++);
            } else {
                int index = stack.pop();
                if(stack.isEmpty()) {
                    max = Math.max(max, height[index] * i);
                } else {
                   max = Math.max(max, height[index] * (i - stack.peek() - 1));
                }
            }
        }

        while(!stack.isEmpty()) {
            int index = stack.pop();
            if(stack.isEmpty()) {
               max = Math.max(max, height[index] * height.length);
            } else {
               max = Math.max(max, height[index] * (height.length - stack.peek() - 1));
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int a = largestRectangleArea(new int[]{4,2,0,3,2,5});
    }
}
