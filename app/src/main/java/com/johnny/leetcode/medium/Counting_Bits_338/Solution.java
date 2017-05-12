package com.johnny.leetcode.medium.Counting_Bits_338;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */

public class Solution {
    /**
     * solution 2
     * 按位与
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] nums = new int[num + 1];

        int base = 1;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            nums[i] = 0;
            base = 0x01;
            while(i >= base) {
                if((i & base) > 0) {
                    ++nums[i];
                }
                base <<= 1;
            }
        }
        return nums;
    }
    /**
     * solution 1
     * 暴力求解
     */
    /*
    public class Solution {
        public int[] countBits(int num) {
            int[] nums = new int[num + 1];

            int base = 0;
            int len = nums.length;
            for(int i = 0; i < len; i++) {
                if(i == 0) {
                    nums[i] = 0;
                    continue;
                }
                base = (int)Math.pow(2, i - 1);
                int n = base;
                boolean dec = true;
                for(int j = base; j < len; j++) {
                    if(dec) {
                        n--;
                        nums[j]++;
                    } else {
                        n++;
                    }
                    if(dec && n == 0) {
                        dec = !dec;
                    } else if(!dec && n == base) {
                        dec = !dec;
                    }
                }

            }
            return nums;
        }
    }
    */
}
