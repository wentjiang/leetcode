package com.wentjiang.leetcode.q101_200;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question168Test {

    private Question168 question168;

    @Before
    public void setUp() throws Exception {
        question168 = new Question168();
    }

    @Test
    public void convertToTitle() {
        assertEquals("A", question168.convertToTitle(1));
    }

    @Test
    public void convertToTitle1() {
        assertEquals("AB", question168.convertToTitle(28));
    }

    @Test
    public void convertToTitle2() {
        assertEquals("ZY", question168.convertToTitle(701));
    }

    @Test
    public void convertToTitle3() {
        assertEquals("Z", question168.convertToTitle(26));
    }

    @Test
    public void convertToTitle4() {
        assertEquals("AZ", question168.convertToTitle(52));
    }
}