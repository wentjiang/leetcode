package com.wentjiang.leetcode.q1401_1500;

public class Question1423 {
    //每次全部进行计算,性能有问题
    public int maxScore(int[] cardPoints, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= k; i++) {
            int sum = 0;
            int endIndex = k - i;
            for (int start = 0; start < i; start++) {
                sum += cardPoints[start];
            }
            for (int end = 0; end < endIndex; end++) {
                sum += cardPoints[cardPoints.length - 1 - end];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    //使用滑动窗口进行优化
    public int maxScore_1(int[] cardPoints, int k) {
        int current = 0;
        for (int i = 0; i < k; i++) {
            current += cardPoints[i];
        }
        int max = current;
        for (int i = 0; i < k; i++) {
            current -= cardPoints[k - i - 1];
            current += cardPoints[cardPoints.length - 1 - i];
            max = Math.max(current, max);
        }
        return max;
    }
}
