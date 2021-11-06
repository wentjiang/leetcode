package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wentao.jiang
 * 
 * @date 2019/9/19 11:48 AM
 * 
 * @description
 */
public class Question43Test {

    private Question43 question43;

    @Before
    public void setUp() throws Exception {
        question43 = new Question43();
    }

    @Test
    public void multiply() {
        Assert.assertEquals("6", question43.multiply("2", "3"));
    }

    @Test
    public void multiply1() {
        Assert.assertEquals("56088", question43.multiply("123", "456"));
    }

    @Test
    public void multiply3() {
        Assert.assertEquals("81", question43.multiply("9", "9"));
    }

    @Test
    public void multiply4() {
        Assert.assertEquals("121932631112635269", question43.multiply("123456789", "987654321"));
    }

    @Test
    public void multiply5() {
        Assert.assertEquals("7901234568", question43.multiply("8", "987654321"));
    }

    @Test
    public void add() {
        Assert.assertEquals("10821521012635269", question43.addSum("9876543120000000", "944977892635269"));
    }
    // 10821521012635269
    // 108215201012635269
}