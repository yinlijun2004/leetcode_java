package com.johnny.leetcode.easy.Palindrome_Linked_List_234;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/24.
 */

//https://leetcode.com/problems/palindrome-linked-list/#/description

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
    private ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head;
        head = head.next;
        newHead.next = null;
        while(head != null) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = newHead;
            newHead = tmp;

        }
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode tmp = head;
        while(tmp != null) {
            tmp = tmp.next;
            ++len;
        }
        tmp = head;
        int i = 0;
        int mid = len / 2;
        while(i++ < mid) {
            tmp = tmp.next;
        }
        ListNode t = reverseList(tmp);
        ListNode h = head;
        while(t != null && h != null) {
            if(t.val != h.val) {
                return false;
            }
            t = t.next;
            h = h.next;

        }
        return true;
    }
}