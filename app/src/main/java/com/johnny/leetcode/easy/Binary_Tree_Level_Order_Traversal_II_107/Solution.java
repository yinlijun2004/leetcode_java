package com.johnny.leetcode.easy.Binary_Tree_Level_Order_Traversal_II_107;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/13.
 */
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/#/description

import com.johnny.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private void trevelOrderTree(TreeNode node, int level, Map<Integer, List<Integer>> map) {
        if(node == null) {
            return;
        }
        List<Integer> curLevel = map.get(level);
        if(curLevel == null) {
            curLevel = new ArrayList<Integer>();
            map.put(level, curLevel);
        }
        trevelOrderTree(node.left, level + 1, map);
        curLevel.add(node.val);
        trevelOrderTree(node.right, level + 1, map);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map map = new HashMap<Integer, ArrayList<Integer>>();
        trevelOrderTree(root, 0, map);
        List<List<Integer>> ret = new ArrayList<>();
        int[] nums = new int[map.size()];
        int i = 0;
        for(Object num : map.keySet()) {
            nums[i++] = (int)num;
        }
        Arrays.sort(nums);
        for(i = nums.length - 1; i >= 0; i--) {
            List<Integer> list = (List<Integer>)map.get(i);
            if(list == null) {
                break;
            }
            ret.add(list);
        }
        return ret;
    }
}
