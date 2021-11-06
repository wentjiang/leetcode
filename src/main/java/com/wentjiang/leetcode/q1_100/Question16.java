package com.wentjiang.leetcode.q1_100;

import java.util.Arrays;

/**
 * @author wentaojiang
 * 
 * @date 2019/8/30 8:32 AM
 * 
 * @description
 */
public class Question16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
                if (target > sum) {
                    start++;
                } else if (sum > target) {
                    end--;
                } else {
                    return result;
                }
            }
        }
        return result;
    }
}
