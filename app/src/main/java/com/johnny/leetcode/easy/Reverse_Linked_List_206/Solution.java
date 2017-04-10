package com.johnny.leetcode.easy.Reverse_Linked_List_206;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/reverse-linked-list/#/description

import com.johnny.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;

        while(head != null) {
            ListNode headNext = head.next;
            head.next = newHead;
            newHead = head;
            head = headNext;
        }
        return newHead;
    }
}
