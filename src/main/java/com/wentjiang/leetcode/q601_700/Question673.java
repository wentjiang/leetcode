package com.wentjiang.leetcode.q601_700;

public class Question673 {
    public int findNumberOfLIS(int[] nums) {
        //记录当前位置最长的子串长度
        int[] dp = new int[nums.length];
        //cnt[i] 表示以 nums[i] 结尾的最长上升子序列的个数
        int[] count = new int[nums.length];
        int maxLen = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            count[i] = 1;
            for (int j = 0; j < i; j++) {
                // 大于的时候,需要增加长度
                if (nums[i] > nums[j]) {

                    if (dp[j] + 1 > dp[i]) {
                        //如果 j 的子串长度 等于或者大于 dp[i], 那么 count[i] 与 count[j] 相同
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        //如果 j的长度 和 i的长度相等的话, count i, 当前的j有多少种,需要给i增加多少种
                        count[i] += count[j];
                    }
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                ans = count[i];
            } else if (dp[i] == maxLen) {
                ans += count[i];
            }

        }
        return ans;
    }
}
