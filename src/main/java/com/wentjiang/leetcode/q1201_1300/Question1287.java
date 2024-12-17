package com.wentjiang.leetcode.q1201_1300;

public class Question1287 {
    public int findSpecialInteger(int[] arr) {
        int count = 0;
        int currentValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == currentValue) {
                count++;
            } else {
                currentValue = arr[i];
                count = 1;
            }
            if ((double) count / arr.length > 0.25) {
                return currentValue;
            }
        }
        return currentValue;
    }
}
