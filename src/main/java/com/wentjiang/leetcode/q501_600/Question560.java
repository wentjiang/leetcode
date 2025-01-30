package com.wentjiang.leetcode.q501_600;

public class Question560 {
    /**
     * 前缀和, 双重for循环遍历
     */
    public int subarraySum(int[] nums, int k) {
        int[] preSum = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if (i == 0){
                preSum[i] = nums[i];
            }else{
                preSum[i] = nums[i] + preSum[i-1];
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == j){
                    if (preSum[i] == k){
                        count++;
                    }
                } else{
                    if (preSum[j] - preSum[i] == k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
