package com.johnny.leetcode.easy.Path_Sum_III_437;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/path-sum-iii/#/description

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

    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        return sumUp(root, 0, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int sumUp(TreeNode node, int pre, int sum) {
        if(node == null) return 0;
        int cur = node.val + pre;
        int has = cur == sum  ? 1 : 0;
        return has + sumUp(node.left, cur, sum) + sumUp(node.right, cur, sum);
    }
}