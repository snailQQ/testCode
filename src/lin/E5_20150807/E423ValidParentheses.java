package lin.E5_20150807;

import java.util.Stack;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/valid-parentheses/
 * http://www.jiuzhang.com/solutions/valid-parentheses/
 */
//Valid Parentheses
//
//        28% Accepted
//        Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
//
//        Have you met this question in a real interview? Yes
//        Example
//        The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
//
//        Tags Expand

public class E423ValidParentheses {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public static  boolean isValidParentheses(String s) {
        // Write your code here
        if(s == null || s.length() <= 1 ) {
            return false;
        }

        Stack<Character> aStack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                aStack.push(s.charAt(i));
            }else if(s.charAt(i) == ')') {
                if(!aStack.isEmpty()) {
                    char last = aStack.peek();
                    if(last == '(') {
                        aStack.pop();
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }

            }else if(s.charAt(i) == ']') {
                if(!aStack.isEmpty()) {
                    char last = aStack.peek();
                    if(last == '[') {
                        aStack.pop();
                    }else {
                        return false;
                    }
                } else {
                    return false;
                }

            }else if( s.charAt(i) == '}') {
                if(!aStack.isEmpty()) {
                    char last = aStack.peek();
                    if(last == '{') {
                        aStack.pop();
                    }else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if(!aStack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String [] args) {
        String s = "()[]{}";
        boolean a = isValidParentheses(s);
    }
}
