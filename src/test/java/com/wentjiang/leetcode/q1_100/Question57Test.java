package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question57Test {

    private Question57 question57;

    @Before
    public void setUp() throws Exception {
        question57 = new Question57();
    }

    @Test
    public void insert() {
        Assert.assertArrayEquals(new int[][]{{1, 5}, {6, 9}},
                question57.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
    }

    @Test
    public void insert1() {
        Assert.assertArrayEquals(new int[][]{{1, 5}},
                question57.insert(new int[][]{{1, 5}}, new int[]{2, 3}));
    }

    @Test
    public void insert2() {
        Assert.assertArrayEquals(new int[][]{{1, 7}},
                question57.insert(new int[][]{{1, 5}}, new int[]{5, 7}));
    }

    @Test
    public void insert3() {
        Assert.assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}},
                question57.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));
    }

    @Test
    public void insert4() {
        Assert.assertArrayEquals(new int[][]{{0,5}},
                question57.insert(new int[][]{{1,5}}, new int[]{0,3}));
    }

}