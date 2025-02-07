package com.wentjiang.leetcode.q2401_2500;

import com.wentjiang.leetcode.utils.ListNode;

public class Question2487 {
    /**
     * 使用递归遍历
     */

    public ListNode removeNodes(ListNode head) {
        if (head.next == null) {
            return head;
        } else {
            ListNode p = removeNodes(head.next);
            if (head.val < p.val) {
                return p;
            } else {
                head.next = p;
                return head;
            }
        }
    }
}
