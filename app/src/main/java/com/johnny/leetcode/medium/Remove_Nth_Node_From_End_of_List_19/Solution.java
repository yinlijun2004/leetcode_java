package com.johnny.leetcode.medium.Remove_Nth_Node_From_End_of_List_19;

import com.johnny.leetcode.ListNode;

import java.util.ArrayList;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/27.
 */

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/#/description
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        ListNode node = head;
        while(node != null) {
            list.add(node);
            node = node.next;
        }
        int idx = list.size() - n;
        if(idx == 0) {
            return list.size() == 1 ? null : list.get(1);
        } else if(idx == list.size() - 1) {
            list.get(idx - 1).next = null;
            return head;
        } else {
            list.get(idx - 1).next = list.get(idx + 1);
            return head;
        }
    }
}