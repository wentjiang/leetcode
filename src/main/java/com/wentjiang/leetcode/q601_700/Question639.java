package com.wentjiang.leetcode.q601_700;

public class Question639 {
    static final int MOD = 1000000007;
    public int numDecodings(String s) {
        int n = s.length();
        long[] dp = new long[n + 1];
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

            //第一位不能组合, 当前这一位和前一位的情况, 分为 **, 数*, *数, 数数
            if (i > 1) {
                //**
                if (s.charAt(i - 2) == '*' && s.charAt(i - 1) == '*') {
                    // 11~19 21~26
                    dp[i] += dp[i - 2] * ((19 - 10) + (26 - 20));
                    //数*
                    // 如果数是 1的情况 有11~19
                } else if (s.charAt(i - 2) == '1' && s.charAt(i - 1) == '*') {
                    dp[i] += dp[i - 2] * (19 - 10);
                } else if (s.charAt(i - 2) == '2' && s.charAt(i - 1) == '*') {
                    //如果数是 2的情况 有21~26
                    dp[i] += dp[i - 2] * (26 - 20);
                    //*数
                } else if (s.charAt(i - 2) == '*' && (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '6')) {
                    //如果是 *, 并且第二位的数字式0~6, 则生成的总数为之前的数量 X2
                    dp[i] += dp[i - 2] * 2;
                } else if (s.charAt(i - 2) == '*' && (s.charAt(i - 1) >= '7' && s.charAt(i - 1) <= '9')) {
                    //如果是 7~9, 只有*=1时 才有组合,只有一种情况
                    dp[i] += dp[i - 2];
                    //数数
                } else if (s.charAt(i - 2) != '*' && s.charAt(i - 1) != '*') {
                    // 两个数的情况,只有第一位不为0 且生成的结果<=26才有效
                    if (s.charAt(i - 2) != '0') {
                        if (Integer.parseInt(String.valueOf(s.charAt(i - 2)) + String.valueOf(s.charAt(i - 1))) <= 26) {
                            dp[i] += dp[i - 2];
                        }
                    }
                }
            }
            dp[i] = dp[i] % MOD;
        }

        return (int) (dp[n] % MOD);
    }
}
