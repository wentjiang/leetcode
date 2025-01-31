package com.wentjiang.leetcode.q1101_1200;

public class Question1109 {
    /**
     * 暴力遍历求解法, 效率比较低
     */
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int[] booking : bookings) {
            int count = booking[2];
            for (int i = booking[0]; i < booking[1] + 1; i++) {
                result[i - 1] += count;
            }
        }
        return result;
    }
}
