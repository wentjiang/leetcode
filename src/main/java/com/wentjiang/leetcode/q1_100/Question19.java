package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

/**
 * @author wentaojiang
 * @date 2019/9/2 7:47 PM
 * @description
 */
public class Question19 {

    /**
     * 需要引入岗哨节点,不然出现一堆堆难解决的问题
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode tail = temp;
        ListNode header = temp;
        while (n > 0) {
            tail = tail.next;
            n--;
        }
        while (tail.next != null) {
            tail = tail.next;
            header = header.next;
        }
        header.next = header.next.next;
        return temp.next;
    }
}
