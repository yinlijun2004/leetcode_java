package com.johnny.leetcode.easy.Remove_Linked_List_Elements_203;

import com.johnny.leetcode.ListNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/remove-linked-list-elements/#/description

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) {
            head = head.next;
        }
        if(head == null) {
            return head;
        }

        ListNode prev = head;
        ListNode next = prev == null ? null : prev.next;
        while(prev != null) {
            if(next != null) {
                if(next.val == val) {
                    prev.next = next.next;
                    next = next.next;
                } else {
                    prev = next;
                    next = next.next;
                }
            } else {
                prev = next;
            }
        }
        return head;
    }
}
