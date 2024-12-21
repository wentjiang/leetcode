package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.ListNode;

public class Question141 {

    /**
     * 使用快慢指针进行遍历, 快指针一次跳两个,慢指针一次一个,如果有环,快指针和慢指针会重合,如果没环,快指针会遍历到结尾
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode first = head.next;
        ListNode second = head;

        while (first != second) {
            if (first.next == null || first.next.next == null) {
                return false;
            }
            first = first.next.next;
            second = second.next;
        }
        return true;
    }
}
