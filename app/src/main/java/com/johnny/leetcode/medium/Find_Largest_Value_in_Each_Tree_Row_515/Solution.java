package com.johnny.leetcode.medium.Find_Largest_Value_in_Each_Tree_Row_515;

import com.johnny.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/2.
 */

public class Solution {
    /**
     * DFS先序遍历。
     * @param node
     * @param list
     * @param depth
     */
    private void travelTree(TreeNode node, List<Integer> list, int depth) {
        if(node == null) {
            return;
        }
        if(list.size() < depth) {
            list.add(node.val);
        } else if(list.get(depth - 1) < node.val){
            list.set(depth - 1, node.val);
        }
        travelTree(node.left, list, depth + 1);
        travelTree(node.right, list, depth + 1);
    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        travelTree(root, list, 1);
        return list;
    }
}