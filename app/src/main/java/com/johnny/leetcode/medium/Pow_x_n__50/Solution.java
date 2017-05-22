package com.johnny.leetcode.medium.Pow_x_n__50;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/19.
 */
//https://leetcode.com/problems/powx-n/#/description

public class Solution {
    public Double helper(Double x, int n) {
        if(x.isInfinite()) {
            return Double.POSITIVE_INFINITY;
        }
        if(n == 0) {
            return new Double(1.0);
        } else if(n == 1) {
            return x;
        } else if(n == 2) {
            return x*x;
        }

        Double y = myPow(x, n / 2);
        boolean odd = (n % 2 == 0);

        if(y.isInfinite()) {
            return Double.POSITIVE_INFINITY;
        }

        return y*y*(odd ? 1 : x);
    }
    public double myPow(double x, int n) {
        if(n < 0) {
            double m = 1.0;
            if(n == Integer.MIN_VALUE) {
                m = x;
                n = Integer.MAX_VALUE;
            } else {
                n *= -1;
            }
            double r = helper(x, n);
            if(new Double(r).isInfinite()) {
                return 0;
            } else {
                return m * 1/r;
            }
        }
        return helper(x, n);
    }
}
