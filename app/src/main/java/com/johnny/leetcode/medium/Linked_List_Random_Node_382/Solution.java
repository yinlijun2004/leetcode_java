package com.johnny.leetcode.medium.Linked_List_Random_Node_382;

import com.johnny.leetcode.ListNode;

import java.util.ArrayList;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/10.
 */
//https://leetcode.com/problems/linked-list-random-node/#/description

public class Solution {
    ArrayList<ListNode> list;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        list = new ArrayList<ListNode>();
        while(head != null) {
            list.add(head);
            head = head.next;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int i = (int)(Math.random() * list.size());
        return list.get(i).val;
    }
}
