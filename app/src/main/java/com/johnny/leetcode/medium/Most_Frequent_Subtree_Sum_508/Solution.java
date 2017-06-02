package com.johnny.leetcode.medium.Most_Frequent_Subtree_Sum_508;

import com.johnny.leetcode.TreeNode;

import java.util.HashMap;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/2.
 */

public class Solution {
    private void addVal(HashMap<Integer, Integer> map, int val) {
        if(map.containsKey(val)) {
            map.put(val, map.get(val) + 1);
        } else {
            map.put(val, 1);
        }
    }

    private int sumTree(TreeNode root, HashMap<Integer, Integer> map) {
        if(root.left == null && root.right == null) {
            addVal(map, root.val);
            return root.val;
        }
        int lv = 0;
        if(root.left != null) {
            lv = sumTree(root.left, map);
        }
        int rv = 0;
        if(root.right != null) {
            rv = sumTree(root.right, map);
        }
        int v = root.val + lv + rv;
        addVal(map, v);
        return v;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        int[] ret = new int[0];
        if(root != null) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            sumTree(root, map);
            int c = 0;
            int m = 0;
            for(int k : map.keySet()) {
                if(m < map.get(k)) {
                    m = map.get(k);
                    c = 1;
                } else if(m == map.get(k)) {
                    ++c;
                }
            }
            ret = new int[c];
            for(int k : map.keySet()) {
                if(m == map.get(k)) {
                    ret[--c] = k;
                }
            }
        }
        return ret;
    }
}