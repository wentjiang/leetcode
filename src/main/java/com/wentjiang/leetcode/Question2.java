package com.wentjiang.leetcode;

/**
 * @author wentaojiang
 * @date 2019/2/24 3:07 PM
 * @description
 */
public class Question2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tail = null;
        ListNode header = null;
        int jinwei = 0;
        while (l1 != null || l2 != null || jinwei > 0) {
            int intValue = jinwei;
            if (l1 != null) {
                intValue += l1.val;
            }
            if (l2 != null) {
                intValue += l2.val;
            }
            if (intValue >= 10) {
                jinwei = 1;
            } else {
                jinwei = 0;
            }
            ListNode temp = new ListNode(intValue % 10);
            if (tail == null) {
                tail = temp;
                header = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return header;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder(String.valueOf(val));
            while (next != null) {
                str.append(next.toString());
                next = next.next;
            }
            return str.toString();
        }
    }

}
