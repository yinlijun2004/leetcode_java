package com.johnny.leetcode.easy.Next_Greater_Element_I_496;

import java.util.ArrayList;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/next-greater-element-i/#/description

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums) list.add(i);
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i : findNums) {
            int idx = list.indexOf(i);
            int size = list.size();
            boolean found = false;
            for(int j = idx + 1; j < size; j++) {
                int t = list.get(j);
                if(t > i) {
                    ret.add(t);
                    found = true;
                    break;
                }
            }
            if(!found) {
                ret.add(-1);
            }
        }
        int[] retArr = new int[ret.size()];
        for(int i = 0; i < retArr.length; i++) {
            retArr[i] = ret.get(i);
        }

        return retArr;
    }
}