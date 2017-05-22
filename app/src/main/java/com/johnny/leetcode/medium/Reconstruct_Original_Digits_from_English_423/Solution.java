package com.johnny.leetcode.medium.Reconstruct_Original_Digits_from_English_423;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/18.
 */

public class Solution {
    /**
     * 枚举法，hash之后，先算出具有唯一字符的数字，其他的去减已经确定的数字的字母个数。
     * 此方法效率极高，击败了95.99%的java提交。
     * @param s
     * @return
     */
    public String originalDigits(String s) {
        int[] map = new int[256];
        char[] cs = s.toCharArray();
        for(int i = 0; i < cs.length; i++) {
            map[(byte)cs[i]] += 1;
        }

        int n0 = map['z'];
        int n2 = map['w'];
        int n6 = map['x'];
        int n8 = map['g'];
        int n4 = map['u'];
        int n7 = map['s'] - n6;
        int n5 = map['v'] - n7;
        int n3 = map['r'] - n4 - n0;
        int n9 = map['i'] - n5 - n6 - n8;
        int n1 = map['o'] - n0 - n2 - n4;
        StringBuilder sb = new StringBuilder();
        while(n0-- > 0) {
            sb.append('0');
        }
        while(n1-- > 0) {
            sb.append('1');
        }
        while(n2-- > 0) {
            sb.append('2');
        }
        while(n3-- > 0) {
            sb.append('3');
        }
        while(n4-- > 0) {
            sb.append('4');
        }
        while(n5-- > 0) {
            sb.append('5');
        }
        while(n6-- > 0) {
            sb.append('6');
        }
        while(n7-- > 0) {
            sb.append('7');
        }
        while(n8-- > 0) {
            sb.append('8');
        }
        while(n9-- > 0) {
            sb.append('9');
        }
        return sb.toString();
    }
}
