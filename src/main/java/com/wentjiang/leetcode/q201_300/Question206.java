package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.ListNode;

public class Question206 {
    /**
     * 方法1: 记录所有节点的值,反转list,重建链表, 时间复杂度n 空间复杂度 n
     *
     * (当前方法)方法2: 使用递归方式完成反转, 时间复杂度n, 空间复杂度1
     *
     * 方法3: 使用迭代计算
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        } else {
            ListNode newHead = reverseList(head.next);
            //head的下一个元素是反转之后的最后一个元素, 最后一个元素的next指向head,将该部分反转
            head.next.next = head;
            //防止链表循环
            head.next = null;
            return newHead;
        }
    }
}
