package com.wentjiang.leetcode.utils;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ListNodeUtilTest {

    @Test
    public void should_create_listNode_success_when_createListNodeByArray_given_array() {
        int[] array = new int[]{1, 2, 3, 4};
        ListNode listNode = ListNodeUtil.createListNodeByArray(array);
        Assertions.assertArrayEquals(array, listNode.toArray());
    }

}
