package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/8/28 2:28 PM
 * @description
 */
public class Question15Test {

    private Question15 question15;

    @Before
    public void setUp() throws Exception {
        question15 = new Question15();
    }

    @Test
    public void threeSum() {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        Assert.assertEquals("[" +
            "[-1, 0, 1]," +
            "[-1, -1, 2]" +
            "]",question15.threeSum(arr).toString());
    }

}