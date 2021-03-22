package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question92Test {

    private Question92 question92 = new Question92();

    @Test
    void reverseBetween() {
        Assertions.assertEquals(ListNodeUtil.createListNodeByArray(new int[]{1, 4, 3, 2, 5}),
                question92.reverseBetween(ListNodeUtil.createListNodeByArray(new int[]{1, 2, 3, 4, 5}), 2, 4));
    }
}