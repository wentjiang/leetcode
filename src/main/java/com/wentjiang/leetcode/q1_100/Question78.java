package com.wentjiang.leetcode.q1_100;

import java.util.ArrayList;
import java.util.List;

public class Question78 {
    public List<List<Integer>> subsets(int[] nums) {
        int length = nums.length;
        int max = (int) Math.pow(2, length);
        int current = 0;
        List<List<Integer>> result = new ArrayList<>();
        while (current < max) {
            String binaryString = Integer.toBinaryString(current);
            int addZero = length - binaryString.length();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < addZero; i++) {
                stringBuilder.append('0');
            }
            char[] chars = stringBuilder.append(binaryString).toString().toCharArray();
            List<Integer> oneResult = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1') {
                    oneResult.add(nums[i]);
                }
            }
            result.add(oneResult);
            current += 1;
        }
        return result;
    }
}
