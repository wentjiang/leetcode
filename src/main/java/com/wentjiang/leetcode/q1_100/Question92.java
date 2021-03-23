package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

public class Question92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //开始位置
        ListNode first = new ListNode(0);
        first.next = head;
        head = first;

        for (int i = 1; i < left; i++) {
            head = head.next;
        }

        //截后尾部的头
        ListNode tailFirst = head.next;
        //获取反转的中间列表
        ListNode tempHead = new ListNode(0);
        //反转部分的尾
        ListNode tempNode = tempHead;
        for (int i = left; i < right + 1; i++) {
            //取出当前的反转节点
            ListNode currentNode = head.next;
            //在原链表去掉当前反转的节点
            head.next = currentNode.next;

            //临时反转链表添加当前节点到head节点后
            ListNode tempNext = tempHead.next;
            tempHead.next = currentNode;
            currentNode.next = tempNext;

            //将当前后边顺序不变的头节点设置为当前节点后的节点
            tailFirst = head.next;
        }

        //找到head 链表后边为null的节点(最后一个节点)
        head.next = tempHead.next;
        while (head.next != null) {
            head = head.next;
        }
        //连接后边顺序不变的节点
        head.next = tailFirst;
        return first.next;
    }

}
