package lin.M9_20150813;

import java.util.Stack;

/**
 * Created by Paul on 8/12/15.
 * http://www.lintcode.com/en/problem/evaluate-reverse-polish-notation/
 */
//Evaluate Reverse Polish Notation
//
//        26% Accepted
//        Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//
//        Valid operators are +, -, *, /. Each operand may be an integer or another expression.
//
//        Have you met this question in a real interview? Yes
//        Example
//        ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
//        ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
public class M424EvaluateReversePolishNotation {
    /**
     * @param tokens The Reverse Polish Notation
     * @return the value
     */
    public static int evalRPN(String[] tokens) {
        // Write your code here
        if(tokens.length == 1) {
            return Integer.valueOf(tokens[0]);
        }
        Stack<Integer> aStack = new Stack<Integer>();
        int returnValue = 0;
        for(int i = 0; i < tokens.length; i++) {
            switch (tokens[i]){
                case "+" :
                    Integer a = aStack.pop();
                    Integer b = aStack.pop();
                    returnValue = a+b;
                    aStack.push(returnValue);
                    break;
                case "/":
                    Integer c = aStack.pop();
                    Integer d = aStack.pop();
                    returnValue = d/c;
                    aStack.push(returnValue);
                    break;
                case "-":
                    Integer e = aStack.pop();
                    Integer f = aStack.pop();
                    returnValue = f-e;
                    aStack.push(returnValue);
                    break;
                case "*":
                    Integer g = aStack.pop();
                    Integer h = aStack.pop();
                    returnValue = h*g;
                    aStack.push(returnValue);
                    break;
                default:
                    aStack.push(Integer.valueOf(tokens[i]));

            }

        }
        return returnValue;
    }

    public static void main(String [] args) {
        String[] a = {"2", "1", "+", "3", "*"};
        int b = evalRPN(a);
        String[] c = {"4", "13", "5", "/", "+"};
        int d = evalRPN(c);
    }
}
