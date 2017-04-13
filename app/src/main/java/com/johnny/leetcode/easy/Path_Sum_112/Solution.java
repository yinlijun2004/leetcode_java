package com.johnny.leetcode.easy.Path_Sum_112;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */

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
//https://leetcode.com/problems/path-sum/#/description

public class Solution {
    private boolean has = false;
    public void travelTree(TreeNode root, int sum) {
        if(root.left == null && root.right == null && root.val == sum) {
            has = true;
            return;
        }
        if(root.left != null) {
            root.left.val += root.val;
            hasPathSum(root.left, sum);
        }
        if(root.right != null) {
            root.right.val += root.val;
            hasPathSum(root.right, sum);
        }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        travelTree(root, sum);
        return has;
    }
}