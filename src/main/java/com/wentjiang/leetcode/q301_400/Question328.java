package com.wentjiang.leetcode.q301_400;

import com.wentjiang.leetcode.utils.ListNode;

public class Question328 {
    /**
     * 分别记录 奇节点的头和偶节点的头, 计算完两个节点之后,将奇节点的尾的next指向偶节点的头,返回奇数节点的头
     *
     * @param head
     * 
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode jiHead = head;
        ListNode currentJiNode = jiHead;
        ListNode ouHead = head.next;
        ListNode currentOuNode = ouHead;
        head = head.next.next;
        while (head != null) {
            currentJiNode.next = head;
            currentJiNode = currentJiNode.next;
            head = head.next;
            if (head != null) {
                currentOuNode.next = head;
                currentOuNode = currentOuNode.next;
                head = head.next;
            }
        }
        currentOuNode.next = null;
        currentJiNode.next = ouHead;
        return jiHead;
    }
}
