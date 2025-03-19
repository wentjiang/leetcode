package com.wentjiang.leetcode.q101_200;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question139_1 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int l = s.length();
        boolean[] dp = new boolean[l + 1];
        dp[0] = true;
        Set<String> wordSet = new HashSet<>(wordDict);
        for (int i = 1; i <= l; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[l];
    }
}
