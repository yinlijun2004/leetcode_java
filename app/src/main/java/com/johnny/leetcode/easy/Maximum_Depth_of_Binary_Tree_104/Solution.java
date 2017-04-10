package com.johnny.leetcode.easy.Maximum_Depth_of_Binary_Tree_104;

import com.johnny.leetcode.TreeNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */

//https://leetcode.com/problems/maximum-depth-of-binary-tree/#/description


// Definition for a binary tree node.
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
    private int maxDepth = 0;
    private void travelTree(TreeNode node) {
        if(node.val > maxDepth) {
            maxDepth = node.val;
        }
        if(node.left != null) {
            node.left.val = node.val + 1;
            travelTree(node.left);
        }
        if(node.right != null) {
            node.right.val = node.val + 1;
            travelTree(node.right);
        }
    }
    public int maxDepth(TreeNode root) {
        maxDepth = 0;
        if(root != null) {
            root.val = 1;
            travelTree(root);
        }
        return maxDepth;
    }
}
