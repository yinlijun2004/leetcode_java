package com.johnny.leetcode.easy.Count_Primes_204;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/count-primes/#/description

public class Solution {
    /**
     * 筛选法找素数
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        if(n <= 2) {
            return 0;
        }

        boolean[] nums = new boolean[n];
        nums[0] = false;
        nums[1] = false;
        nums[2] = true;
        for(int i = 2; i < n; i++){
            nums[i] = true;
        }
        int ret = 0;
        for(int i = 2; i < n; i++) {
            if(nums[i]) {
                ++ret;
                for(int j = i + i; j < n; j += i) {
                    nums[j] = false;
                }
            }
        }

        return ret;
    }
}