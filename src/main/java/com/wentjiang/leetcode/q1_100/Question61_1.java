package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

public class Question61_1 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 0;
        ListNode originalHead = head;
        ListNode backupHead = head;

        ListNode tail = null;
        // 第一遍遍历链表获取长度
        while (head != null) {
            if (head.next == null) {
                tail = head;
            }
            head = head.next;
            length++;
        }

        // 计算挪多少次
        int move = k % length;
        if (move == 0) {
            return originalHead;
        }

        ListNode preTail = backupHead;
        // 找到分割点, 挪多少次,就是将最后的多少个元素切割成新的链表
        for (int i = 0; i < length - move; i++) {
            preTail = backupHead;
            backupHead = backupHead.next;
        }

        // 分割点后的第一个点是新的头
        ListNode newHead = backupHead;
        // 分割点前的点的next设为空,防止循环
        preTail.next = null;
        // 将第二个链表的尾的next设置为第一个的头
        tail.next = originalHead;

        return newHead;
    }
}
