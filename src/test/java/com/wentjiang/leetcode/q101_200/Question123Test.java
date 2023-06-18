package com.wentjiang.leetcode.q101_200;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question123Test {

    private Question123 question123 = new Question123();

    @Test
    public void case1() {
        Assertions.assertEquals(6, question123.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

    @Test
    public void case2() {
        Assertions.assertEquals(4, question123.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void case3() {
        Assertions.assertEquals(0, question123.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void case4() {
        Assertions.assertEquals(0, question123.maxProfit(new int[]{1}));
    }

    @Test
    public void case5() {
        Assertions.assertEquals(13, question123.maxProfit(new int[]{
                1, 2, 4, 2, 5, 7, 2, 4, 9, 0
        }));
    }

}