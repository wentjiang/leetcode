package com.wentjiang.leetcode.q401_500;

public class Question495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        int result = 0;
        int current = Integer.MIN_VALUE;
        for (int num : timeSeries) {
            if (current != Integer.MIN_VALUE) {
                if (current + duration < num) {
                    result += duration;
                } else {
                    result += num - current;
                }
            }
            current = num;
        }
        result += duration;
        return result;
    }
}
