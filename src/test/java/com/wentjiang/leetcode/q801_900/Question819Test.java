package com.wentjiang.leetcode.q801_900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question819Test {
    private Question819 question819 = new Question819();

    @Test
    public void test1() {
        Assertions.assertEquals("ball", question819
                .mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] { "hit" }));
    }

}