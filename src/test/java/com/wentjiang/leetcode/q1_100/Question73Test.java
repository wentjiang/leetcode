package com.wentjiang.leetcode.q1_100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2020/2/2 9:17 PM
 * @description
 */
public class Question73Test {

    @Test
    public void setZeroes() {
        Question73 question73 = new Question73();
        question73.setZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
    }
}