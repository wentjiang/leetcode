package com.wentjiang.leetcode.q1501_1600;

public class Question1524 {
    //138 / 151  超时
    public int numOfSubarrays(int[] arr) {
        int[] preSum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                preSum[i] = arr[0];
            } else {
                preSum[i] = preSum[i - 1] + arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == j && preSum[i] % 2 == 1) {
                    count++;
                } else if ((preSum[j] - preSum[i]) % 2 == 1) {
                    count++;
                }
            }
        }
        return count % (1000000000 + 7);
    }

}
