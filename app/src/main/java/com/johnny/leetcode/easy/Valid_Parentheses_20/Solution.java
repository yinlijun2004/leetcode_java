package com.johnny.leetcode.easy.Valid_Parentheses_20;

import java.util.Stack;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/valid-parentheses/#/description

public class Solution {
    private char findMatch(char c) {
        switch(c) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
            default:
                return (char)-1;
        }
    }

    public boolean isValid(String s) {
        Stack stack = new Stack();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.empty()) {
                stack.push(c);
            } else if(findMatch(c) == (char)stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
