package com.wentjiang.leetcode.q201_300;

import java.util.Stack;

public class Question232 {
    class MyQueue {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            stack1.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            int result = stack1.pop();
            while (stack2.size() > 0) {
                stack1.push(stack2.pop());
            }
            return result;
        }

        /**
         * Get the front element.
         */
        public int peek() {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            int result = stack1.peek();
            while (stack2.size() > 0) {
                stack1.push(stack2.pop());
            }
            return result;
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack1.size() == 0;
        }
    }
}
