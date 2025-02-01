package com.wentjiang.leetcode.q801_900;

public class Question845_1 {
    public int longestMountain(int[] arr) {
        int max = 0;
        boolean up = false;
        boolean down = false;
        int currentCount = 0;
        for (int i = 1; i < arr.length; i++) {
            if (!up && !down) {
                if (arr[i] > arr[i - 1]) {
                    up = true;
                    currentCount += 2;
                }
            } else if (up && !down) {
                if (arr[i] > arr[i - 1]) {
                    currentCount++;
                } else if (arr[i] < arr[i - 1]) {
                    down = true;
                    currentCount++;
                    max = Math.max(max, currentCount);
                } else {
                    up = false;
                    down = false;
                    currentCount = 0;
                }
            } else if (up && down) {
                if (arr[i] < arr[i - 1]) {
                    currentCount++;
                    max = Math.max(max, currentCount);
                } else if (arr[i] > arr[i - 1]) {
                    up = true;
                    down = false;
                    currentCount = 2;
                } else {
                    up = false;
                    down = false;
                    currentCount = 0;
                }
            } else if (!up && down) {
                //ignore
            }
        }
        return max;
    }
}
