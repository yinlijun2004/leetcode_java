package com.johnny.leetcode.easy.Binary_Watch_401;

import java.util.ArrayList;
import java.util.List;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/binary-watch/#/description

public class Solution {
    public List<String> readBinaryWatch(int num) {
        int n = num;
        int max = 0;
        while(n > 0) {
            max = max + (1 << (10 - n));
            --n;
        }
        n = num;
        int min = 0;
        while(n > 0) {
            min = min + (1 << (n - 1));
            --n;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++) {
            int x = i;
            int oc = 0;
            if((i >> 6 & 0xf) > 11) {
                continue;
            }
            if((i & 0x3f) >= 60) {
                continue;
            }
            while(x > 0) {
                if((x & 0x01) == 0x01) {
                    ++oc;
                }
                x >>= 1;
                if(oc > num) {
                    break;
                }
            }
            if(oc == num) {
                list.add(i);
            }
        }
        List<String> ret = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++) {
            n = list.get(i);
            //high four
            int h = (n >> 6) & 0xf;
            int l = n &= 0x3f;
            String one = String.valueOf(h) + ":" + (l < 10 ? ("0" + String.valueOf(l)) : String.valueOf(l));
            ret.add(one);
        }
        return ret;
    }
}
