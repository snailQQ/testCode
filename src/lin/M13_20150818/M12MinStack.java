package lin.M13_20150818;

import java.util.ArrayList;

/**
 * Created by Paul on 8/17/15.
 * http://www.lintcode.com/en/problem/min-stack/
 * http://zjalgorithm.blogspot.com/2014/11/leecode-java-min-stack.html
 * http://blog.csdn.net/linhuanmars/article/details/41008731
 */
//Min Stack
//
//        29% Accepted
//        Implement a stack with min() function, which will return the smallest number in the stack.
//
//        It should support push, pop and min operation all in O(1) cost.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Operations: push(1), pop(), push(2), push(3), min(), push(1), min() Return: 1, 2, 1
//
//        Note
//        min operation will never be called if there is no number in the stack
public class M12MinStack {
    static class MinStack {
        ArrayList<Integer> stack = new ArrayList<Integer>();
        ArrayList<Integer> minStack = new ArrayList<Integer>();
        public void push(int x) {
            stack.add(x);
            if(minStack.isEmpty()) {
                minStack.add(x);
            } else {
                minStack.add(Math.min(x, minStack.get(minStack.size()-1)));
            }

        }

        public void pop() {
            if(!stack.isEmpty()) {
                return;
            }
            stack.remove(stack.size()-1);
            minStack.remove(minStack.size()-1);
        }

        public int top() {
            if(!stack.isEmpty()) {
                return stack.get(stack.size()-1);
            }
            return 0;
        }

        public int getMin() {
            if(!minStack.isEmpty()) {
                return minStack.get(minStack.size()-1);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(2);
        ms.push(0);
        ms.push(3);
        ms.push(0);
        ms.getMin();
        ms.pop();
        ms.getMin();
        ms.pop();
        ms.getMin();
        ms.pop();
        ms.getMin();

    }
}
