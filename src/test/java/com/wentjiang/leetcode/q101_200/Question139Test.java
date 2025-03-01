package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Question139Test {

    private Question139 question139 = new Question139();

    @Test
    void wordBreak() {
        String[] strs = new String[]{"leet", "code"};
        Assertions.assertTrue(question139.wordBreak("leetcode", Arrays.stream(strs).toList()));
    }

    @Test
    void wordBreak1() {
        String[] strs = new String[]{"apple", "pen"};
        Assertions.assertTrue(question139.wordBreak("applepenapple", Arrays.stream(strs).toList()));
    }

    @Test
    void wordBreak2() {
        String[] strs = new String[]{"cats", "dog", "sand", "and", "cat"};
        Assertions.assertFalse(question139.wordBreak("catsandog", Arrays.stream(strs).toList()));
    }
}