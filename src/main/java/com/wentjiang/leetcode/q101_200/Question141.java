package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.ListNode;

public class Question141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode first = head.next;
        ListNode second = head;

        while(first!= second){
            if (first.next == null || first.next.next == null){
                return false;
            }
            first = first.next.next;
            second = second.next;
        }
        return true;
    }
}
