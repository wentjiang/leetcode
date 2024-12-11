package com.wentjiang.leetcode.q301_400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question374Test {

    @Test
    public void guessNumber() {
        Question374 question374 = new Question374(6);
        Assertions.assertEquals(6, question374.guessNumber(10));
    }

    @Test
    public void guessNumber1() {
        Question374 question374 = new Question374(1);
        Assertions.assertEquals(1, question374.guessNumber(1));
    }

    @Test
    public void guessNumber2() {
        Question374 question374 = new Question374(1);
        Assertions.assertEquals(1, question374.guessNumber(2));
    }

    @Test
    public void guessNumber3() {
        Question374 question374 = new Question374(2);
        Assertions.assertEquals(2, question374.guessNumber(2));
    }

    @Test
    public void guessNumber4() {
        Question374 question374 = new Question374(1);
        Assertions.assertEquals(1, question374.guessNumber(3));
    }
}