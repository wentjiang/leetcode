package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/9/13 3:31 PM
 * @description
 */
public class Question33Test {

    private Question33 question33;

    @Before
    public void setUp() throws Exception {
        question33 = new Question33();
    }

    @Test
    public void search() {
        Assert.assertEquals(4, question33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    public void search1() {
        Assert.assertEquals(-1, question33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    public void search2() {
        Assert.assertEquals(-1, question33.search(new int[]{}, 5));
    }

    @Test
    public void search3() {
        Assert.assertEquals(-1, question33.search(new int[]{1}, 0));
    }

    @Test
    public void search4() {
        Assert.assertEquals(-1, question33.search(new int[]{3, 5, 1}, 4));
    }

    @Test
    public void search5() {
        Assert.assertEquals(-1, question33.search(new int[]{1, 3}, 0));
    }

    @Test
    public void search6() {
        Assert.assertEquals(4, question33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    public void search7() {
        Assert.assertEquals(0, question33.search(new int[]{1, 3}, 1));
    }

    @Test
    public void search8() {
        Assert.assertEquals(1, question33.search(new int[]{1, 3}, 3));
    }

    @Test
    public void search9() {
        Assert.assertEquals(3, question33.search(new int[]{7,8,1,2,3,4,5,6}, 2));
    }

}