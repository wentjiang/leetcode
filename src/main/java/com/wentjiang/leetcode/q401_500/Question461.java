package com.wentjiang.leetcode.q401_500;

public class Question461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int sum = 0;
        String binaryString = Integer.toBinaryString(z);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                sum++;
            }
        }
        return sum;
    }

    public int hammingDistance1(int x, int y) {
        int z = x ^ y;
        return Integer.bitCount(z);
    }
}
