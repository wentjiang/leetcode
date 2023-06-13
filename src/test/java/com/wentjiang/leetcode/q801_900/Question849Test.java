package com.wentjiang.leetcode.q801_900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question849Test {

    private Question849 question849 = new Question849();

    @Test
    public void case1() {
        int result = question849.maxDistToClosest(new int[] { 1, 0, 0, 0, 1, 0, 1 });
        Assertions.assertEquals(2, result);
    }

    @Test
    public void case2() {
        int result = question849.maxDistToClosest(new int[] { 1, 0, 0, 0 });
        Assertions.assertEquals(3, result);
    }

    @Test
    public void case3() {
        int result = question849.maxDistToClosest(new int[] { 0, 1 });
        Assertions.assertEquals(1, result);
    }

}