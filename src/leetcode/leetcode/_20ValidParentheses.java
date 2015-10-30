package leetcode.leetcode;

import java.util.Stack;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>
 * answer link
 */
public class _20ValidParentheses {
    public static boolean isValid(String s) {
        if(s == null || s.length() == 1) {
            return false;
        }
        if(s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    char c = stack.pop();
                    if((s.charAt(i) == ')' && c == '(') || (s.charAt(i) == ']' && c == '[') || (s.charAt(i) == '}' && c == '{')) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean a = isValid("()");
    }
}
