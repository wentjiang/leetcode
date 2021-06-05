package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.ListNode;

public class Question203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode temp = first;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return first.next;
    }
}
