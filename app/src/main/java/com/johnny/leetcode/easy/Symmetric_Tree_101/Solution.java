package com.johnny.leetcode.easy.Symmetric_Tree_101;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/symmetric-tree/#/description

import com.johnny.leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

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
    private boolean breadthTravel(Deque deque) {
        if(deque.size() == 0) {
            return true;
        }

        TreeNode[] arr = new TreeNode[deque.size()];
        deque.toArray(arr);
        int len  = arr.length;
        for(int i = 0; i < len / 2; i++) {
            TreeNode left = arr[i];
            TreeNode right = arr[len - i - 1];
            if(left.val != right.val) {
                return false;
            }
            if((left.left == null && right.right == null)
                    || (left.right == null && right.left == null)) {
                continue;
            }
            if(left.left == null || left.right == null
                    || right.left == null || right.right == null) {
                return false;
            }
        }

        deque.clear();
        for(int i = 0; i < len; i++){
            TreeNode node = arr[i];
            if(node.left != null) {
                deque.add(node.left);
            }
            if(node.right != null) {
                deque.add(node.right);
            }
        }

        return breadthTravel(deque);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        if(root.left == null && root.right == null) {
            return true;
        }

        if(root.left != null && root.right != null) {
            Deque deque = new ArrayDeque<TreeNode>();
            deque.add(root.left);
            deque.add(root.right);
            return breadthTravel(deque);
        }

        return false;
    }
}
