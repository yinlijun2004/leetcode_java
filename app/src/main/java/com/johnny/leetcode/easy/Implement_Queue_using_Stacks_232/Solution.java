package com.johnny.leetcode.easy.Implement_Queue_using_Stacks_232;

import java.util.Stack;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/implement-queue-using-stacks/#/description

public class Solution {
    public class MyQueue {
        private Stack mStack;
        private int mFront;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            mStack = new Stack();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            if (mStack.empty()) {
                mFront = x;
            }
            mStack.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            Stack tmpStack = new Stack();
            while (!mStack.empty()) {
                tmpStack.push(mStack.pop());
            }
            int ret = (int) tmpStack.pop();
            if (!tmpStack.empty()) {
                mFront = (int) tmpStack.peek();
            }
            while (!tmpStack.empty()) {
                mStack.push(tmpStack.pop());
            }
            return ret;
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return mFront;
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return mStack.empty();
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */