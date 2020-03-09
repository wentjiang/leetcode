package com.wentjiang.leetcode.q101_200;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question171Test {

    private Question171 question171;

    @Before
    public void setUp() throws Exception {
        question171 = new Question171();
    }

    @Test
    public void titleToNumber() {
        assertEquals(1,question171.titleToNumber("A"));
    }

    @Test
    public void titleToNumber1() {
        assertEquals(28,question171.titleToNumber("AB"));
    }

    @Test
    public void titleToNumber2() {
        assertEquals(701,question171.titleToNumber("ZY"));
    }
}