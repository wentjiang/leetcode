package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.ListNode;

public class Question203_1 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode currentNode = preHead;
        while (currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode.val == val) {
                currentNode.next = nextNode.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return preHead.next;
    }
}
