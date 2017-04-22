package com.johnny.leetcode.easy.Linked_List_Cycle_141;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/17.
 */
//https://leetcode.com/problems/linked-list-cycle/#/description

import com.johnny.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode worker = head;
        ListNode runner = head;
        while(runner.next != null && runner.next.next != null) {
            runner = runner.next.next;
            worker = worker.next;
            if(worker == runner) return true;
        }
        return false;
    }
}