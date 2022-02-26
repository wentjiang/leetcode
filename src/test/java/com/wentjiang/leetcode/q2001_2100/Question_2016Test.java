package com.wentjiang.leetcode.q2001_2100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question_2016Test {

    private Question_2016 question2016 = new Question_2016();

    @Test
    void maximumDifference() {
        Assertions.assertEquals(4, question2016.maximumDifference(new int[]{7,1,5,4}));
    }

    @Test
    void maximumDifference2() {
        Assertions.assertEquals(-1, question2016.maximumDifference(new int[]{9,4,3,2}));
    }

    @Test
    void maximumDifference3() {
        Assertions.assertEquals(9, question2016.maximumDifference(new int[]{1,5,2,10}));
    }
}