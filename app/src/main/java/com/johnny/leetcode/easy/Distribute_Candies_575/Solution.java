package com.johnny.leetcode.easy.Distribute_Candies_575;

import java.util.HashSet;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/5.
 */
//https://leetcode.com/problems/distribute-candies/#/description

public class Solution {
    /**
     * 保存到set里面，求数量的一半和种类数的较小值。
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int c : candies) {
            set.add(c);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}
