package com.johnny.leetcode.medium.Linked_List_Cycle_II_142;

import com.johnny.leetcode.ListNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/26.
 */
//https://leetcode.com/problems/linked-list-cycle-ii/#/solutions
    
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast !=null) {
            slow = slow.next;
            if(fast.next == null) {
                return null;
            } else {
                fast = fast.next.next;
            }
            if(slow == fast) {
                break;
            }
        }
        if(fast == null) {
            return null;
        }
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}