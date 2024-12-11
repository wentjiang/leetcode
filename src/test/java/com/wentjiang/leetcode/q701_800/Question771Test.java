package com.wentjiang.leetcode.q701_800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question771Test {
    private final Question771 question771 = new Question771();

    @Test
    public void numJewelsInStonesTest1() {
        String J = "aA";
        String S = "aAAbbbb";
        assertEquals(3, question771.numJewelsInStones(J, S));
    }

    @Test
    public void numJewelsInStonesTest2() {
        String J = "z";
        String S = "ZZ";
        assertEquals(0, question771.numJewelsInStones(J, S));
    }

}
