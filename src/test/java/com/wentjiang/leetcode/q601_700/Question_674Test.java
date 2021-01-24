package com.wentjiang.leetcode.q601_700;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question_674Test {

    private Question_674 question = new Question_674();

    @Test
    public void findLengthOfLCIS() {
        int max = question.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
        Assertions.assertEquals(3, max);
    }
}