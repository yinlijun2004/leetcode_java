package com.johnny.leetcode.easy.Minimum_Depth_of_Binary_Tree_111;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/minimum-depth-of-binary-tree/#/description

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
    public int travelDepth(TreeNode node, int depth) {
        if(node.left == null && node.right == null) {
            return depth;
        }

        int minLeft = Integer.MAX_VALUE;
        if(node.left != null) {
            minLeft = travelDepth(node.left, depth + 1);
        }
        int minRight = Integer.MAX_VALUE;
        if(node.right != null) {
            minRight = travelDepth(node.right, depth + 1);
        }
        return Math.min(minLeft, minRight);
    }

    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return travelDepth(root, 1);
    }
}