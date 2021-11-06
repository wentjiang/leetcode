package com.wentjiang.leetcode.q601_700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question697Test {

    private Question697 question697 = new Question697();

    @Test
    void findShortestSubArray() {
        Assertions.assertEquals(6, question697.findShortestSubArray(new int[] { 1, 2, 2, 3, 1, 4, 2 }));
    }

    @Test
    void findShortestSubArray_1() {
        Assertions.assertEquals(2, question697.findShortestSubArray(new int[] { 1, 2, 2, 3, 1 }));
    }
}