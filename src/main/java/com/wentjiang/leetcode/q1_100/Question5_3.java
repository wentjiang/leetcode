package com.wentjiang.leetcode.q1_100;

public class Question5_3 {
    //动态规划
    //dp[i][j] 表示i~j是否是回文字符串
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = chars.length;
        boolean[][] dp = new boolean[l][l];
        //对角线都相等,所以为true
        for (int i = 0; i < l; i++) {
            dp[i][i] = true;
        }

        int maxLength = 1;
        int startIndex = 0;
        for (int j = 1; j < l; j++) {
            for (int i = 0; i < l && j > i; i++) {
                if (chars[i] != chars[j]) {
                    dp[i][j] = false;
                } else {
                    // i 和 j 位置上的字符相同
                    if (j - i < 3) {
                        // 相减值为1的话,两个字符挨着, 类似aa这种情况
                        // 相减值为2的话,两个字符中间间隔了个字符, 类似aba这种
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j]) {
                    if (j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        startIndex = i;
                    }
                }
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }
}
