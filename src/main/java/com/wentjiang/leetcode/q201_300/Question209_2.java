package com.wentjiang.leetcode.q201_300;

public class Question209_2 {

    /**
     * 不用队列,直接用左右指针
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, result = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
