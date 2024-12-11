package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/30 10:06 AM
 * 
 * @description
 */
public class Question151Test {

    private Question151 question151 = new Question151();

    @Test
    public void reverseWords() {
        assertEquals("blue is sky the", question151.reverseWords("the sky is blue"));
    }

    @Test
    public void reverseWords1() {
        assertEquals("world! hello", question151.reverseWords("  hello world!  "));
    }

    @Test
    public void reverseWords2() {
        assertEquals("example good a", question151.reverseWords("a good   example"));
    }
}