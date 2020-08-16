package com.wentjiang.leetcode.q701_800;

import com.wentjiang.leetcode.q1_100.Question1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question733Test {
    private Question733 question733;

    @Before
    public void before() {
        question733 = new Question733();
    }

    @Test
    public void floodFill1() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        question733.floodFill(image, 1, 1, 2);
    }

    @Test
    public void floodFill2() {
        int[][] image = {{0, 0, 0}, {0, 1, 1}};
        question733.floodFill(image, 1, 1, 1);
    }
}
