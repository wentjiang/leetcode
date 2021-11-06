package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question61Test {

    private Question61 question61 = new Question61();

    @Test
    public void rotateRight() {
        Assertions.assertArrayEquals(new int[] { 4, 5, 1, 2, 3 }, ListNodeUtil.createArrayByListNode(
                question61.rotateRight(ListNodeUtil.createListNodeByArray(new int[] { 1, 2, 3, 4, 5 }), 2)));
    }
}