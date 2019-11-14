package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2019/11/14 3:22 PM
 * @description
 */
public class Question109 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 使用双指针先寻找中间节点
     * [-10, -3, 0, 5, 9],
     *
     * @param head 头指针
     * @return
     */
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode first = head;
        ListNode second = head;
        ListNode preMid = head;
        boolean isFirst = true;
        while (second != null && second.next != null) {
            if (isFirst) {
                isFirst = false;
            } else {
                preMid = preMid.next;
            }
            first = first.next;
            second = second.next.next;
        }
        TreeNode treeNode = new TreeNode(first.val);
        preMid.next = null;
        treeNode.left = sortedListToBST(head);
        treeNode.right = sortedListToBST(first.next);
        return treeNode;
    }

}
