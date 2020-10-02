package com.wentjiang.leetcode.q701_800;

import org.junit.Assert;
import org.junit.Test;

public class Question771Test {
    private final Question771 question771 = new Question771();

    @Test
    public void numJewelsInStonesTest1() {
        String J = "aA";
        String S = "aAAbbbb";
        Assert.assertEquals(3, question771.numJewelsInStones(J, S));
    }

    @Test
    public void numJewelsInStonesTest2() {
        String J = "z";
        String S = "ZZ";
        Assert.assertEquals(0, question771.numJewelsInStones(J, S));
    }

}
