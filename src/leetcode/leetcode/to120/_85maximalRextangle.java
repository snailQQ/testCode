package leetcode.leetcode.to120;

import java.util.Stack;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/maximal-rectangle/
 * answer link
 * http://www.cnblogs.com/springfor/p/3869492.html
 */
public class _85maximalRextangle {
    public static int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[] array = new int[matrix[0].length];
        int max = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '0') {
                    array[j] = 0;
                } else {
                    array[j] += 1;
                }
            }
            max = Math.max(max, findMax(array));
        }
        return max;
    }

    private static int findMax(int[] array) {
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < array.length; ) {
            if(stack.isEmpty() || array[stack.peek()] <= array[i]) {
                stack.push(i++);
            } else {
                int index = stack.pop();
                if(stack.isEmpty()) {
                    max = Math.max(max, array[index] * i);
                } else {
                    max = Math.max(max, array[index] * (i - stack.peek() - 1));
                }
            }
        }
        while(!stack.isEmpty()) {
            int index = stack.pop();
            if(stack.isEmpty()) {
                max = Math.max(max, array[index] * array.length);
            } else {
                max = Math.max(max, array[index] * (array.length - stack.peek() - 1));
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int a = maximalRectangle(new char[][]{{'1','1','0','1'},{'1','1','0','1'},{'1','1','1','1'}});
    }
}
