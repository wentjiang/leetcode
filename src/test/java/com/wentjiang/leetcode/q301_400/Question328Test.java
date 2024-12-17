package com.wentjiang.leetcode.q301_400;

import com.wentjiang.leetcode.utils.ListNode;
import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question328Test {

    Question328 question328 = new Question328();

    @Test
    void oddEvenList() {
        ListNode result = question328.oddEvenList(ListNodeUtil.createListNodeByArray(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 2, 4}, ListNodeUtil.createArrayByListNode(result));
    }

    @Test
    void oddEvenList2() {
        ListNode result = question328.oddEvenList(ListNodeUtil.createListNodeByArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, ListNodeUtil.createArrayByListNode(result));
    }
}