package com.johnny.leetcode.easy.Third_Maximum_Number_414;

import java.util.HashSet;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */

public class Solution {
    //1.先去重
    //2.如果去重后数字小于3个，则返回最大的那个
    //3.否则，来3轮冒泡，返回第3个数，也就是第3个最大数字。
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums) {
            set.add(n);
        }
        Integer[] arr = new Integer[set.size()];
        set.toArray(arr);
        if(arr.length == 0) {
            return 0;
        } else if(arr.length == 1)  {
            return arr[0];
        } else if(arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        }

        for(int i = 0; i < 3; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr[2];
    }
}