package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question70Test {

    private Question70 question70 = new Question70();

    @Test
    public void case1() {
        Assertions.assertEquals(1, question70.climbStairs(1));
    }

    @Test
    public void case2() {
        Assertions.assertEquals(2, question70.climbStairs(2));
    }

    @Test
    public void case3() {
        Assertions.assertEquals(3, question70.climbStairs(3));
    }

}