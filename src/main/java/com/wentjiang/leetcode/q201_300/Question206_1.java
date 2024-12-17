package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.ListNode;

public class Question206_1 {
    /**
     * 使用头查法,遍历所有的元素
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode preNode = new ListNode(-1);
        if (head == null || head.next == null) {
            return head;
        }
        while (head != null) {
            //头插法,保存头的next
            ListNode temp1 = preNode.next;
            //头的下一个为当前的head
            preNode.next = head;
            //保存head的next
            ListNode temp2 = head.next;
            //重新设置head的next
            head.next = temp1;
            //重设head的值
            head = temp2;
        }
        return preNode.next;
    }
}
