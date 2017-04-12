package com.johnny.leetcode.easy.Intersection_of_Two_Arrays_II_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/intersection-of-two-arrays-ii/#/description

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            if(m1.containsKey(n)) {
                m1.put(n, m1.get(n) + 1);
            } else {
                m1.put(n, 1);
            }
        }
        Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums2.length; i++) {
            int n = nums2[i];
            if(m2.containsKey(n)) {
                m2.put(n, m2.get(n) + 1);
            } else {
                m2.put(n, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : m1.keySet()) {
            if(!m2.containsKey(num)) {
                continue;
            }
            int c1 = m1.get(num);
            int c2 = m2.get(num);
            if(c1 > 0 && c2 > 0) {
                int n = Math.min(c1, c2);
                while(n-- > 0) {
                    list.add(num);
                }
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
