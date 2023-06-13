package com.wentjiang.leetcode.q2101_2200;

public class Question2139 {
    public int minMoves(int target, int maxDoubles) {
        int moveCount = 0;
        while (target != 1) {
            // 先考虑使用所有次数的double
            if (target % 2 != 0) {
                target--;
            } else {
                if (maxDoubles != 0) {
                    target = target / 2;
                    maxDoubles--;
                } else {
                    moveCount += target - 1;
                    break;
                }
            }
            moveCount++;
        }
        return moveCount;
    }
}
