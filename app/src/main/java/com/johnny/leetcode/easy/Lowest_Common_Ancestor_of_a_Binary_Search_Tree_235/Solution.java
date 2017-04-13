package com.johnny.leetcode.easy.Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/13.
 */
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/#/description

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
    private TreeNode target;
    private void travelNode(TreeNode root, TreeNode p, TreeNode q) {
        if(target != null || root == null) {
            return;
        }
        if(root.val == p.val || root.val == q.val) {
            target = root;
            return;
        }

        if(root.val > p.val && root.val > q.val) {
            travelNode(root.left, p, q);
        } else if(root.val < p.val && root.val < q.val) {
            travelNode(root.right, p, q);
        } else {
            target = root;

            return;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        travelNode(root, p, q);

        return target;
    }
}