package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

public class Question92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //开始位置
        ListNode first = head;
        //截断前一个
        ListNode preHead = head;
        for (int i = 1; i < left; i++) {
            preHead = head;
            head = head.next;
        }

        //截后尾部的头
        ListNode tailFirst = preHead.next;
        //获取反转的中间列表
        ListNode tempNode = new ListNode(0);
        //反转部分的尾
        ListNode tempLast = tempNode;
        for (int i = left; i < right; i++) {
            ListNode currentNode = head.next;
            head.next = currentNode.next;
            tailFirst = currentNode.next;

            ListNode tempNext = tempNode.next;
            tempNode.next = currentNode;
            currentNode.next = tempNode.next;
            tempLast = tempNext;
        }
        head.next = tempNode.next;
        tempLast.next = tailFirst;
        return first;
    }

}
