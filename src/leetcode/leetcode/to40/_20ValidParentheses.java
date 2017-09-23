package leetcode.leetcode.to40;

import java.util.Stack;

/**
 * Created by Paul on 10/29/15.
 * question link https://leetcode.com/problems/valid-parentheses/description/
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * <p/>
 * answer link
 */
public class _20ValidParentheses {
    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        for (char c : s.toCharArray()) {
//            if (c == '(')
//                stack.push(')');
//            else if (c == '{')
//                stack.push('}');
//            else if (c == '[')
//                stack.push(']');
//            else if (stack.isEmpty() || stack.pop() != c)
//                return false;
//        }
//        return stack.isEmpty();
        if(s == null || s.length() == 0 || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(letter == '{' || letter == '[' || letter == '(') {
                stack.push(letter);
            } else if(letter == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            } else if(letter == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            } else if(letter == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        boolean a = isValid("()");
        System.out.println(a);
    }
}
