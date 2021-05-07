package com.wentjiang.leetcode.q1401_1500;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question1486Test {

    private Question1486 question1486 = new Question1486();

    @Test
    public void xorOperation() {
        Assertions.assertEquals(8, question1486.xorOperation(5, 0));
    }

    @Test
    public void xorOperation1() {
        Assertions.assertEquals(8, question1486.xorOperation(4, 3));
    }

    @Test
    public void xorOperation2() {
        Assertions.assertEquals(7, question1486.xorOperation(1, 7));
    }

    @Test
    public void xorOperation3() {
        Assertions.assertEquals(2, question1486.xorOperation(10, 5));
    }

}