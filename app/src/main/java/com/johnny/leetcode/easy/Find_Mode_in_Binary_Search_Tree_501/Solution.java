package com.johnny.leetcode.easy.Find_Mode_in_Binary_Search_Tree_501;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/13.
 */

import com.johnny.leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/find-mode-in-binary-search-tree/#/description

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
    private void travelTree(Map map, TreeNode root) {
        if(root == null) {
            return;
        }
        int time = map.containsKey(root.val) ? (int)map.get(root.val) : 0;//(int)map.getOrDefault(root.val, 0);
        map.put(root.val,  time + 1);
        travelTree(map, root.left);
        travelTree(map, root.right);
    }

    public int[] findMode(TreeNode root) {
        if(root == null) {
            return new int[]{};
        }
        Map map = new HashMap<Integer, Integer>();
        travelTree(map, root);
        int[] nums = new int[map.size()];
        int[] times = new int[map.size()];
        int i = 0;
        for(Object num : map.keySet()) {
            nums[i] = (int)num;
            times[i] = (int)map.get(num);
            i++;
        }
        int max = times[0];
        int mc = 1;
        for(i = 1; i < times.length; i++) {
            if(times[i] > max) {
                max = times[i];
                mc = 1;
            } else if(times[i] == max) {
                mc++;
            }
        }
        int[] ret = new int[mc];
        int j = 0;
        for(i = 0; i < times.length && mc > 0; i++) {
            if(times[i] == max) {
                ret[j++] = nums[i];
                --mc;
            }
        }
        return ret;
    }
}