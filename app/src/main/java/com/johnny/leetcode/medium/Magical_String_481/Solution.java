package com.johnny.leetcode.medium.Magical_String_481;

import java.util.LinkedList;
import java.util.Queue;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/10.
 */

public class Solution {
    public int magicalString(int n) {
        if(n == 0) {
            return 0;
        }
        if(n < 4) {
            return 1;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        int last = 1;
        queue.add(2);
        int result = 1;
        for(int i = 3; i <= n; i++) {
            int j = queue.remove();

            if(j == 1) {
                ++result;
            }
            while(j-- > 0) {
                queue.add(last);
            }
            last = (last == 2) ? 1 : 2;
        }
        return result;
    }
}