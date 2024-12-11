package com.wentjiang.leetcode.q401_500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question477Test {

    private Question477 question477 = new Question477();

    @Test
    public void totalHammingDistance() {
        Assertions.assertEquals(6, question477.totalHammingDistance(new int[] { 4, 14, 2 }));
        Assertions.assertEquals(6, question477.totalHammingDistance1(new int[] { 4, 14, 2 }));
    }
}