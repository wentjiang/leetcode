package com.wentjiang.leetcode.q801_900;

public class Question849 {

    public int maxDistToClosest(int[] seats) {
        int currentCount = 0;
        int result = 0;
        boolean isStart = true;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (isStart) {
                    isStart = false;
                    result = Math.max(currentCount, result);
                }
                currentCount = 0;
            } else {
                currentCount++;
                if (seats.length - 1 == i) {
                    result = Math.max(currentCount, result);
                } else {
                    int tempResult;
                    if (currentCount % 2 == 0) {
                        tempResult = currentCount / 2;
                    } else {
                        tempResult = currentCount / 2 + 1;
                    }
                    result = Math.max(result, tempResult);
                }
            }

        }
        return result;
    }

}
