package com.johnny.leetcode.easy.Intersection_of_Two_Arrays_349;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/intersection-of-two-arrays/#/description

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set s1 = new HashSet();
        for(int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }
        Set s2 = new HashSet();
        for(int i = 0; i < nums2.length; i++) {
            s2.add(nums2[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Object i : s1) {
            if(s2.contains(i)) {
                list.add((int)i);
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
