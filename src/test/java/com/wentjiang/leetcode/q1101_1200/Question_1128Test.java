package com.wentjiang.leetcode.q1101_1200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Question_1128Test {
    private Question_1128 question = new Question_1128();

    @Test
    public void numEquivDominoPairs() {
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        assertEquals(1, question.numEquivDominoPairs(dominoes));
        assertEquals(1, question.numEquivDominoPairs1(dominoes));
        assertEquals(1, question.numEquivDominoPairs3(dominoes));
    }

    @Test
    public void testCase2() {
        int[][] dominoes = {{1, 1}, {2, 2}, {1, 1}, {1, 2}, {1, 2}, {1, 1}};
        assertEquals(4, question.numEquivDominoPairs(dominoes));
        assertEquals(4, question.numEquivDominoPairs1(dominoes));
        assertEquals(4, question.numEquivDominoPairs3(dominoes));
    }
}