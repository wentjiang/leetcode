package com.wentjiang.leetcode.q601_700;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question643Test {

    private Question643 question643 = new Question643();

    @Test
    public void findMaxAverage() {
        Assertions.assertEquals(12.75, question643.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

}