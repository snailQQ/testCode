package leetcode.leetcode.to160;

import java.util.Stack;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * answer link
 * http://www.cnblogs.com/springfor/p/3869714.html
 */
public class _150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")) {
                Integer num = Integer.valueOf(str);
                stack.push(num);
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(cal(a, b, str));
            }
        }
        return stack.pop();
    }

    private int cal(int a, int b, String op) {
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else {
            return a / b;
        }

    }
}
