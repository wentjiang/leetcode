package com.wentjiang.leetcode.q901_1000;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question937Test {

    private Question937 question937 = new Question937();

    @Test
    void reorderLogFiles() {
        Assertions.assertArrayEquals(
                new String[] { "let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6" },
                question937.reorderLogFiles(new String[] { "dig1 8 1 5 1", "let1 art can", "dig2 3 6",
                        "let2 own kit dig", "let3 art zero" }));
    }

    @Test
    void reorderLogFiles1() {
        Assertions.assertArrayEquals(
                new String[] { "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7" },
                question937.reorderLogFiles(
                        new String[] { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo" }));
    }

}