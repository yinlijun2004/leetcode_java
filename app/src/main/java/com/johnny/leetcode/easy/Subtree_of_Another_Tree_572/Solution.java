package com.johnny.leetcode.easy.Subtree_of_Another_Tree_572;

import com.johnny.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 莉军 on 2017/6/4.
 */

public class Solution {
    /**
     * 遍历列表保存，匹配到根节点的节点，然后依次匹配节点。
     * @param s
     * @param t
     * @return
     */
    private boolean match(TreeNode s, TreeNode t) {
        if(s == null && t == null) {
            return true;
        } else if(s == null || t == null) {
            return false;
        } else if(s.val == t.val) {
            return (match(s.left, t.left) && match(s.right, t.right));
        } else {
            return false;
        }
    }
    private void inorder(TreeNode s, TreeNode t, List<TreeNode> list) {
        if(s.left != null) {
            inorder(s.left, t, list);
        }
        if(s.val == t.val) {
            list.add(s);
        }
        if(s.right != null) {
            inorder(s.right, t, list);
        }
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        inorder(s, t, list);
        for(TreeNode node : list) {
            if(match(node, t)) {
                return true;
            }
        }
        return false;
    }
}
