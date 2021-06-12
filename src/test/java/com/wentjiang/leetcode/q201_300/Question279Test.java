package com.wentjiang.leetcode.q201_300;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class Question279Test {

    private Question279 question279 = new Question279();

    @Test
    public void numSquares() {
        Assertions.assertEquals(3,question279.numSquares(12));
    }
}