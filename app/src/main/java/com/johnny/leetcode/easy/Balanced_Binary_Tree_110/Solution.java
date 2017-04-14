package com.johnny.leetcode.easy.Balanced_Binary_Tree_110;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/balanced-binary-tree/#/description

import com.johnny.leetcode.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private boolean isblance = true;
    private int travelLength(TreeNode node, int lastLen) {
        if(!isblance) {
            return lastLen;
        }
        if(node == null) {
            return 0;
        }
        int llen = 0;
        if(node.left != null) {
            llen = travelLength(node.left, 1);
        }
        int rlen = 0;
        if(node.right != null) {
            rlen = travelLength(node.right, 1);
        }
        if(Math.abs(llen - rlen) > 1) {
            isblance = false;
        }
        return lastLen + Math.max(rlen, llen);

    }
    public boolean isBalanced(TreeNode root) {
        travelLength(root, 1);

        return isblance;
    }
}