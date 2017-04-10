package com.johnny.leetcode.easy.Minimum_Absolute_Difference_in_BST_530;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/minimum-absolute-difference-in-bst/#/description

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
//TODO need to be optimized
public class Solution {
    private int getNum(TreeNode parent, TreeNode child) {
        if(child == null) {
            return Integer.MAX_VALUE;
        }

        int lv = Integer.MAX_VALUE;
        int rv = Integer.MAX_VALUE;
        int lcv = Integer.MAX_VALUE;
        int rcv = Integer.MAX_VALUE;

        if(child.left != null) {
            //lv = Math.min(getNum(parent, child.left), getNum(child, child.left));
            lcv = Math.abs(parent.val - child.left.val);
        }
        if(child.right != null) {
            rcv = Math.abs(parent.val - child.right.val);
            //rv = Math.min(getNum(parent, child.right), getNum(child, child.right));
        }

        int llv = getNum(child, child.left);
        int rrv = getNum(child, child.right);
        int vv = Math.min(llv, rrv);
        if(lcv < rcv) {
            lv = Math.min(getNum(parent, child.left), vv);
        } else {
            rv = Math.min(getNum(parent, child.right), vv);
        }

        return Math.min(Math.abs(parent.val - child.val), Math.min(lv, rv));
    }
    public int getMinimumDifference(TreeNode root) {
        return Math.min(getNum(root, root.left), getNum(root, root.right));
    }
}