package com.wentjiang.leetcode.q201_300;

public class Question264_2 {
    /**
     * 使用动态规划的方式
     *
     * @param n
     * 
     * @return
     */
    public int nthUglyNumber(int n) {
        int p2 = 0, p3 = 0, p5 = 0;
        int[] dps = new int[n];
        dps[0] = 1;
        for (int i = 0; i < n - 1; i++) {
            int p2Value = dps[p2] * 2;
            int p3Value = dps[p3] * 3;
            int p5Value = dps[p5] * 5;
            int minValue = Math.min(p2Value, Math.min(p3Value, p5Value));
            if (p2Value == minValue) {
                p2++;
            }
            if (p3Value == minValue) {
                p3++;
            }
            if (p5Value == minValue) {
                p5++;
            }

            dps[i + 1] = minValue;
        }
        return dps[n - 1];
    }
}
