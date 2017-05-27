package com.johnny.leetcode.medium.Integer_to_Roman_12;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/18.
 */
//https://leetcode.com/problems/integer-to-roman/#/description

public class Solution {
    /**
     * 枚举法，枚举出整数的罗马数字，然后num求余获取对应的数字。
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        String[][] nums = new String[][]{
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"},
        };
        StringBuilder ret = new StringBuilder();
        ret.append(nums[3][num / 1000 % 10]);
        ret.append(nums[2][num / 100 % 10]);
        ret.append(nums[1][num / 10 % 10]);
        ret.append(nums[0][num % 10]);
        return ret.toString();
    }
}
