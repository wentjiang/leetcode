package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2019/11/15 5:08 PM
 * @description
 */
public class Question72Test {

//    给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。
//
//    你可以对一个单词进行如下三种操作：
//
//    插入一个字符
//        删除一个字符
//    替换一个字符
//    示例 1:
//
//    输入: word1 = "horse", word2 = "ros"
//    输出: 3
//    解释:
//    horse -> rorse (将 'h' 替换为 'r')
//    rorse -> rose (删除 'r')
//    rose -> ros (删除 'e')
//    示例 2:
//
//    输入: word1 = "intention", word2 = "execution"
//    输出: 5
//    解释:
//    intention -> inention (删除 't')
//    inention -> enention (将 'i' 替换为 'e')
//    enention -> exention (将 'n' 替换为 'x')
//    exention -> exection (将 'n' 替换为 'c')
//    exection -> execution (插入 'u')

    private Question72 question72;

    @Before
    public void setUp() throws Exception {
        question72 = new Question72();
    }

    @Test
    public void minDistance() {
        Assert.assertEquals(3, question72.minDistance("horse", "ros"));
    }

    @Test
    public void minDistance1() {
        Assert.assertEquals(5, question72.minDistance("intention", "execution"));
    }

    @Test
    public void minDistance2() {
        Assert.assertEquals(6, question72.minDistance("plasma", "altruism"));
    }
}