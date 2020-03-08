package com.wentjiang.leetcode.q101_200;

public class Question167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 1;
        int end = numbers.length;
        while (start < end) {
            if (numbers[start - 1] + numbers[end - 1] < target) {
                start++;
            } else if (numbers[start - 1] + numbers[end - 1] > target) {
                end--;
            } else {
                result[0] = start;
                result[1] = end;
                break;
            }
        }
        return result;
    }
}
