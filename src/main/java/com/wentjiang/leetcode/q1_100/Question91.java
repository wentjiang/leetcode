package com.wentjiang.leetcode.q1_100;

public class Question91 {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        char[] chars = s.toCharArray();
        //当前这一位的所有可能性,乘以前一位的 隔一位的前一位的数
        for (int i = 1; i < s.length() + 1; i++) {
            //如果当前位不为0, 则与上一位的总数相同
            if (chars[i - 1] != '0') {
                dp[i] = dp[i - 1];
            }
            //如果当前位前边有数, 并且前边这一位不为0, 并且构成的组合数小于等于26,则当前这一位的值加上前前一位的值
            if (i > 1 && chars[i - 2] != '0') {
                int num = Integer.parseInt(String.valueOf(chars[i - 2]) + String.valueOf(chars[i - 1]));
                if (num <= 26) {
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[s.length()];
    }
}
