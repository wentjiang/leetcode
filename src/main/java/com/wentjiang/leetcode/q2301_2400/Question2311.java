package com.wentjiang.leetcode.q2301_2400;

public class Question2311 {

    /**
     * 贪心算法,先找出所有的0,再从后往前找出所有低位的1
     * 位运算需要考虑越界的情况.
     * @param s
     * @param k
     * @return
     */
    public static int longestSubsequence(String s, int k) {
        char[] chs = s.toCharArray();
        boolean greaterThanK = false;
        int length = 0;
        int value = 0;
        for (int i = chs.length - 1; i >= 0; i--) {
            if (chs[i] == '1') {
                if (!greaterThanK) {
                    double currentValue = (Math.pow(2, length) * Integer.parseInt(String.valueOf(chs[i])));
                    if (value + currentValue <= k) {
                        value += (int) currentValue;
                        length++;
                    } else {
                        greaterThanK = true;
                    }
                }
            } else {
                length++;
            }
        }
        return length;
    }

}
