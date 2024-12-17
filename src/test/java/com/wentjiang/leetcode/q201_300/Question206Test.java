package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.ListNode;
import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Question206Test {

    Question206 question206 = new Question206();

    @Test
    void reverseList() {
        ListNode ln = ListNodeUtil.createListNodeByArray(new int[]{1,2,3,4,5});
        ListNode result = question206.reverseList(ln);
        Assertions.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, result.toArray());
    }
}