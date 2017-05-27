package com.johnny.leetcode.easy.Implement_Stack_using_Queues_225;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/implement-stack-using-queues/#/description

public class Solution {
    public class MyStack {
        private Queue mQueue;
        /** Initialize your data structure here. */
        public MyStack() {
            mQueue = new ArrayDeque();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            Queue tmp = new ArrayDeque();
            tmp.add(x);
            while(!mQueue.isEmpty()) {
                tmp.add(mQueue.poll());
            }
            mQueue = tmp;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return (int)mQueue.poll();

        }

        /** Get the top element. */
        public int top() {
            return (int)mQueue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return mQueue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
