package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/30 9:05 PM
 * 
 * @description
 */
public class Question160 {

    /**
     * 暴力法 将所有的B中的元素逐个和A中的进行对比,时间复杂度 m*n , 空间复杂度o(1)
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        while (headB != null) {
            listA = headA;
            while (listA != null) {
                if (listA == headB) {
                    return listA;
                }
                listA = listA.next;
            }
            headB = headB.next;
        }
        return null;
    }

    /**
     * 哈希表法 将headA中的所有元素放入set中,时间复杂度m+n,空间复杂度o(m)
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }

    /**
     * 双指针法 因为两个链表相交,从相交元素开始是相同的,所以,先求出两个链表的长度,让长的链表,指针先走多余的长度即可 时间复杂度 (m+n)+min(m,n) ,空间复杂度o(1)
     */
    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode currentA = headA;
        ListNode currentB = headB;
        while (currentA != null) {
            lengthA++;
            currentA = currentA.next;
        }
        while (currentB != null) {
            lengthB++;
            currentB = currentB.next;
        }
        for (int i = 0; i < Math.abs(lengthA - lengthB); i++) {
            if (lengthB > lengthA) {
                headB = headB.next;
            } else {
                headA = headA.next;
            }
        }
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
