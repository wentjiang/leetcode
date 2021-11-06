package com.wentjiang.leetcode.q401_500;

import java.util.HashMap;
import java.util.Map;

public class Question477 {

    private final Map<Integer, String> cacheMap = new HashMap<>();

    public int totalHammingDistance(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                sum += hammingDistance(nums[i], nums[j]);
            }
        }
        return sum;
    }

    private int hammingDistance(int num1, int num2) {
        return Integer.bitCount(num1 ^ num2);
    }

    public int totalHammingDistance1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            int count = 0;
            for (int num : nums) {
                count += (num >> i) & 1;
            }
            sum += count * (nums.length - count);
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = Integer.toBinaryString(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(str);
        System.out.println(str.length());
    }
}
