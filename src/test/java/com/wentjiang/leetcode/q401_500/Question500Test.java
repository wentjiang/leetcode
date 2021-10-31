package com.wentjiang.leetcode.q401_500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Question500Test {

    private final Question500 question500 = new Question500();

    @Test
    void findWords() {
        String[] result = question500.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        assertArrayEquals(new String[]{"Alaska","Dad"},result);
    }

    @Test
    void findWords1() {
        String[] result = question500.findWords(new String[]{"omk"});
        assertArrayEquals(new String[]{},result);
    }
    @Test
    void findWords2() {
        String[] result = question500.findWords(new String[]{"adsdf","sfd"});
        assertArrayEquals(new String[]{"adsdf","sfd"},result);
    }
}