package com.wentjiang.leetcode.q601_700;

public class Question639 {
    //todo
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            //判断一位的情况
            if (s.charAt(i - 1) != '0') {
                if (s.charAt(i - 1) != '*') {
                    dp[i] = dp[i - 1];
                }

                if (s.charAt(i - 1) == '*') {
                    // * 的时候 1-9 都可以增加
                    dp[i] = dp[i - 1] * 9;
                }
            }

            //当前这一位和前一位的情况, 分为 **, 数*, *数, 数数
            if (i > 1) {
                //**
                if (s.charAt(i - 2) == '*' && s.charAt(i - 1) == '*') {
                    dp[i] += dp[i - 2] * ((19 - 10) + (26 - 20));
                    //数*
                } else if (s.charAt(i - 2) == '1' && s.charAt(i - 1) == '*') {
                    dp[i] += dp[i - 2] * (19 - 10);
                } else if (s.charAt(i - 2) == '2' && s.charAt(i - 1) == '*') {
                    dp[i] += dp[i - 2] * (26 - 20);
                    //*数
                } else if (s.charAt(i - 2) == '*' && (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '6')) {
                    dp[i] += dp[i - 2] + 1;
                } else if (s.charAt(i - 2) == '*' && (s.charAt(i - 1) >= '7' && s.charAt(i - 1) <= '9')) {
                    dp[i] += dp[i - 2];
                    //数数
                } else if (s.charAt(i - 2) != '*' && s.charAt(i - 1) != '*') {
                    if (s.charAt(i - 2) != '0') {
                        if (Integer.parseInt(String.valueOf(s.charAt(i - 2)) + String.valueOf(s.charAt(i - 1))) <= 26) {
                            dp[i] += dp[i - 2];
                        }
                    }
                }
            }
        }

        return dp[n] % (int) (Math.pow(10, 9) + 7);
    }
}
