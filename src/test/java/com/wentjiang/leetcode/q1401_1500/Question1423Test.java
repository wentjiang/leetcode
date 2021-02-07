package com.wentjiang.leetcode.q1401_1500;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question1423Test {

    private Question1423 question1423 = new Question1423();

    @Test
    public void maxScore1() {
        int[] cardPoints = new int[]{1, 2, 3, 4, 5, 6, 1};
        Assertions.assertEquals(12, question1423.maxScore(cardPoints, 3));
        Assertions.assertEquals(12, question1423.maxScore_1(cardPoints, 3));
    }

    @Test
    public void maxScore2() {
        int[] cardPoints = new int[]{2, 2, 2};
        Assertions.assertEquals(4, question1423.maxScore(cardPoints, 2));
        Assertions.assertEquals(4, question1423.maxScore_1(cardPoints, 2));
    }

    @Test
    public void maxScore3() {
        int[] cardPoints = new int[]{9, 7, 7, 9, 7, 7, 9};
        Assertions.assertEquals(55, question1423.maxScore(cardPoints, 7));
        Assertions.assertEquals(55, question1423.maxScore_1(cardPoints, 7));
    }

    @Test
    public void maxScore4() {
        int[] cardPoints = new int[]{1, 1000, 1};
        Assertions.assertEquals(1, question1423.maxScore(cardPoints, 1));
        Assertions.assertEquals(1, question1423.maxScore_1(cardPoints, 1));
    }

    @Test
    public void maxScore5() {
        int[] cardPoints = new int[]{96, 90, 41, 82, 39, 74, 64, 50, 30};
        Assertions.assertEquals(536, question1423.maxScore(cardPoints, 8));
        Assertions.assertEquals(536, question1423.maxScore_1(cardPoints, 8));
    }

    @Test
    public void maxScore6() {
        int[] cardPoints = new int[]{1, 79, 80, 1, 1, 1, 200, 1};
        Assertions.assertEquals(202, question1423.maxScore_1(cardPoints, 3));
    }
}