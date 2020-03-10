package com.wentjiang.leetcode.q101_200;

/**
 * 每5个数可以尾数加一个0,每25个数,尾数会多加一个0
 */
public class Question172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
