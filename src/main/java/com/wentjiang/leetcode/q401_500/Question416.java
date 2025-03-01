package com.wentjiang.leetcode.q401_500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question416 {
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        if (nums[nums.length - 1] > sum / 2) {
            return false;
        }
        int target = sum / 2;
        // 问题可以转换成0-1背包问题, 选取nums里的物品, 所有物品的总重量为 sum/2
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> needAddIndex = new ArrayList<>();
            for (int j = 0; j <= target; j++) {
                if (dp[j] && j + nums[i] <= target) {
                    needAddIndex.add(j + nums[i]);
                }
            }
            for (int index : needAddIndex){
                dp[index] = true;
            }

            if (dp[target]) {
                return true;
            }
        }
        return false;
    }
}
