package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;
import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question61_1Test {

    Question61_1 question61_1 = new Question61_1();

    @Test
    void rotateRight() {
        ListNode result = question61_1.rotateRight(ListNodeUtil.createListNodeByArray(new int[] { 1, 2 }), 1);
        Assertions.assertArrayEquals(new int[] { 2, 1 }, ListNodeUtil.createArrayByListNode(result));
    }

    @Test
    void rotateRight1() {
        ListNode result = question61_1.rotateRight(ListNodeUtil.createListNodeByArray(new int[] { 0, 1, 2 }), 4);
        Assertions.assertArrayEquals(new int[] { 2, 0, 1 }, ListNodeUtil.createArrayByListNode(result));
    }

    @Test
    void rotateRight2() {
        ListNode result = question61_1.rotateRight(ListNodeUtil.createListNodeByArray(new int[] { 1, 2 }), 2);
        Assertions.assertArrayEquals(new int[] { 1, 2 }, ListNodeUtil.createArrayByListNode(result));
    }
}