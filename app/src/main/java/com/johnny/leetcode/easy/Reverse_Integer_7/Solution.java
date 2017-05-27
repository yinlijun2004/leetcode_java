package com.johnny.leetcode.easy.Reverse_Integer_7;

import java.util.Stack;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/reverse-integer/#/description

public class Solution {
    /**
     * 判断溢出，将位压栈，最后再与反转的位比较。
     * @param x
     * @return
     */
    public int reverse(int x) {
        boolean minus = x < 0;
        x = Math.abs(x);
        int ret = 0;
        int n = 32;
        int b = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while(x > 0 && n-- > 0) {
            b = x % 10;
            ret = ret * 10 + b;
            stack.push(b);
            x /= 10;
            if(ret < 0) {
                return 0;
            }
        }

        int savedRet = ret;

        while(ret > 0) {
            if(stack.isEmpty() || ret % 10 != stack.pop()) {
                return 0;
            }
            ret /= 10;
        }

        return minus ? -savedRet : savedRet;
    }
}