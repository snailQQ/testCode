package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Paul on 9/30/15.
 */
public class LeetEImplementStackUsingQueues225 {
    class MyStack {
        // Push element x onto stack.
        Queue<Integer> queue;

        MyStack() {
           this.queue = new LinkedList<Integer>();
        }

        public void push(int x) {
            Queue<Integer> newQueue = new LinkedList<Integer>();
            while(!queue.isEmpty()) {
                newQueue.offer(queue.poll());
            }
            queue.offer(x);
            while(!newQueue.isEmpty()) {
                queue.offer(newQueue.poll());
            }
        }

        // Removes the element on top of the stack.
        public void pop() {
            queue.poll();
        }

        // Get the top element.
        public int top() {
            return queue.peek();
        }

        // Return whether the stack is empty.
        public boolean empty() {
            if(queue.isEmpty()) {
                return true;
            }
            return false;
        }
    }
}
