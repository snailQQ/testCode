package leetcode;

import java.util.Stack;

public class LeetMEvaluateReversePolishNotation150 {
	public static int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) {
            return Integer.MIN_VALUE;
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        for(String s : tokens) {
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(Integer.parseInt(s));
            } else {
                if(s.equals("+")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a+b);
                } else if(s.equals("")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b-a);
                } else if(s.equals("*")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a*b);
                } else {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a);
                }
            }
        }
        return stack.pop();
    }
	public static void main(String[] args) {
		int a = evalRPN(new String[]{"4","-2","/","2","-3","-","-"});
	}
}
