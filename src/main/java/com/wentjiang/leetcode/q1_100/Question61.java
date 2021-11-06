package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

public class Question61 {
    /**
     * @param head
     * @param k
     * 
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;

        // 遍历获取list的长度
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }

        if (length <= 1) {
            return preHead.next;
        }

        if (k % length == 0) {
            return preHead.next;
        } else if (k > length) {
            k = k % length;
        }

        // 每次移动一个尾元素到头元素,移动k次
        for (int i = 0; i < k; i++) {
            // 每次遍历从头开始
            head = preHead.next;
            // 找到当前最后一个元素的前一个元素置为null
            while (head.next.next != null) {
                head = head.next;
            }
            // 获取当前的最后一个元素,挪到最前边的位置
            ListNode currentLast = head.next;
            // 将倒数第二个元素的next置为null
            head.next = null;
            // 取出当前的head
            ListNode currentHead = preHead.next;
            // 将尾元素放在头
            preHead.next = currentLast;
            // 设置尾元素的next
            currentLast.next = currentHead;
        }
        return preHead.next;
    }
}
