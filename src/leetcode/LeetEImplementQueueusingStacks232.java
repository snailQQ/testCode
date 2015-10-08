package leetcode;

import java.util.Stack;

/**
 * Created by Paul on 9/30/15.
 */
public class LeetEImplementQueueusingStacks232 {
    class MyQueue {
        // Push element x to the back of queue.
        Stack<Integer> stack;

        MyQueue() {
            this.stack = new Stack<Integer>();
        }

        public void push(int x) {
            Stack<Integer> newStack = new Stack<Integer>();
            while(!stack.isEmpty()) {
                newStack.push(stack.pop());
            }
            stack.push(x);
            while(!newStack.isEmpty()) {
                stack.push(newStack.pop());
            }
        }

        // Removes the element from in front of queue.
        public void pop() {
            stack.pop();
        }

        // Get the front element.
        public int peek() {
            return stack.peek();
        }

        // Return whether the queue is empty.
        public boolean empty() {
            if(stack.isEmpty()) {
                return true;
            }
            return false;
        }
    }
}
