package com.wentjiang.leetcode.q601_700;

public class Question698 {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) {
            return false;
        }
        int target = sum / k;
        int[] buckets = new int[k];
        return backtrack(buckets, 0, nums, target);
    }

    private boolean backtrack(int[] buckets, int index, int[] nums, int target) {
        if (index == nums.length) {
            for (int bucket : buckets) {
                if (bucket != target) {
                    return false;
                }
            }
            return true;
        }

        for (int i = 0; i < buckets.length; i++) {
            // 超过target的时候跳过
            if (nums[index] + buckets[i] > target) {
                continue;
            }
            // 当前桶子里的值和上一个桶子里的值相同时跳过,因为放在当前和上一个是一样的
            if (i > 0 && buckets[i] == buckets[i - 1]) {
                continue;
            }

            // 给当前的桶子增加当前的值
            buckets[i] = buckets[i] + nums[index];
            if (backtrack(buckets, index + 1, nums, target)) {
                return true;
            }
            // 回溯,给当前的桶子减去当前index的值
            buckets[i] = buckets[i] - nums[index];
        }

        return false;
    }

}
