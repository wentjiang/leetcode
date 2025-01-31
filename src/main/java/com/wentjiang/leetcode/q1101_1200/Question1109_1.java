package com.wentjiang.leetcode.q1101_1200;

public class Question1109_1 {
    /**
     * 前缀和 和 差分数组
     */
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int[] booking : bookings) {
            result[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                result[booking[1] - 1] -= booking[2];
            }
        }
        for (int i = 1; i < n; i++) {
            result[i] = result[i] + result[i - 1];
        }
        return result;
    }
}
