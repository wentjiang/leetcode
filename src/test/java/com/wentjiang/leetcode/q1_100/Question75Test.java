package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wentao.jiang
 * @date 2019/11/19 1:59 PM
 * @description
 */
public class Question75Test {

    private Question75 question75;

    @Before
    public void setUp() throws Exception {
        question75 = new Question75();
    }

    @Test
    public void sortColors() {
        int[] array = new int[]{2, 0, 2, 1, 1, 0};
        question75.sortColors(array);
        Assert.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, array);
    }

    @Test
    public void sortColors1() {
        int[] array = new int[]{2, 0, 1};
        question75.sortColors(array);
        Assert.assertArrayEquals(new int[]{0, 1, 2}, array);
    }

    @Test
    public void sortColors2() {
        int[] array = new int[]{2, 1};
        question75.sortColors(array);
        Assert.assertArrayEquals(new int[]{1, 2}, array);
    }

    @Test
    public void sortColors3() {
        int[] array = new int[]{1, 0, 0};
        question75.sortColors(array);
        Assert.assertArrayEquals(new int[]{0, 0, 1}, array);
    }

    @Test
    public void sortColors4() {
        int[] array = new int[]{1, 2};
        question75.sortColors(array);
        Assert.assertArrayEquals(new int[]{1, 2}, array);
    }
}