package com.wentjiang.leetcode.q701_800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question724Test {

    private Question724 question724 = new Question724();

    @Test
    void pivotIndex() {
        int result = question724.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        Assertions.assertEquals(3, result);
    }

    @Test
    void pivotIndex1() {
        int result = question724.pivotIndex(new int[]{2, 1, -1});
        Assertions.assertEquals(0, result);
    }

    @Test
    void pivotIndex2() {
        int result = question724.pivotIndex(new int[]{-1,-1,-1,1,1,1});
        Assertions.assertEquals(-1, result);
    }

    @Test
    void pivotIndex3() {
        int result = question724.pivotIndex(new int[]{-1,-1,0,0,-1,-1});
        Assertions.assertEquals(2, result);
    }
}