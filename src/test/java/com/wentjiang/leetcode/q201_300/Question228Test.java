package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.q1_100.Question22;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question228Test {

    private Question228 question228 = new Question228();

    @Test
    public void summaryRanges() {
        int[] nums = new int[] { 0, 1, 2, 4, 5, 7 };
        List<String> expectResult = Arrays.asList("0->2", "4->5", "7");
        assertEquals(expectResult, question228.summaryRanges(nums));
    }
}