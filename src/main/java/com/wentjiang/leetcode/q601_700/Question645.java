package com.wentjiang.leetcode.q601_700;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question645 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        //前一个数
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前数
            int curr = nums[i];
            //当前数与前一个数重复,则为重复的数
            if (curr == prev) {
                result[0] = prev;
                //当前数-前一个数>1 则缺少前一个数+1
            } else if (curr - prev > 1) {
                result[1] = prev + 1;
            }
            prev = curr;
        }
        if (nums[nums.length - 1] != nums.length) {
            result[1] = nums.length;
        }
        return result;
    }

    public int[] findErrorNums1(int[] nums) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result[0] = num;
            } else {
                set.add(num);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }
}
