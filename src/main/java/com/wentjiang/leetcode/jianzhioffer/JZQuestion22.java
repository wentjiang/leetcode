package com.wentjiang.leetcode.jianzhioffer;

import com.wentjiang.leetcode.utils.ListNode;

/**
 * 剑指offer 第22题
 */
public class JZQuestion22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i <= k; i++) {
            first = first.next;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
