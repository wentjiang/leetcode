package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question82Test {

    private Question82 question82 = new Question82();

    @Test
    void deleteDuplicates() {
        Assertions.assertArrayEquals(new int[]{1, 2, 5},
                ListNodeUtil.createArrayByListNode(
                        question82.deleteDuplicates(ListNodeUtil.createListNodeByArray(new int[]{1, 2, 3, 3, 4, 4, 5}))));
        Assertions.assertArrayEquals(new int[]{1, 2, 5},
                ListNodeUtil.createArrayByListNode(
                        question82.deleteDuplicates1(ListNodeUtil.createListNodeByArray(new int[]{1, 2, 3, 3, 4, 4, 5}))));
    }

    @Test
    void deleteDuplicates1() {
        Assertions.assertArrayEquals(new int[]{2, 3},
                ListNodeUtil.createArrayByListNode(
                        question82.deleteDuplicates(ListNodeUtil.createListNodeByArray(new int[]{1, 1, 1, 2, 3}))));
        Assertions.assertArrayEquals(new int[]{2, 3},
                ListNodeUtil.createArrayByListNode(
                        question82.deleteDuplicates1(ListNodeUtil.createListNodeByArray(new int[]{1, 1, 1, 2, 3}))));

    }
}