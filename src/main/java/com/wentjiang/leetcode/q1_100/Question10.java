package com.wentjiang.leetcode.q1_100;

public class Question10 {
    //todo 暂时放弃
    /**
     * 参考了答案
     * @param s 原始字符串
     * @param p 正则串
     * @return
     */
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // dp[i][j] 表示 s的前i个字符 与 p的前j个字符 是否能够匹配
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n ; j++) {
                // 当前的行, 如果 前一位是 *, 则匹配任意多个字符.
                if (p.charAt(j -1) == '*'){
                    dp[i][j] = dp[i][j-2];
                    if (matches(s, p, i,j-1)){
                        dp[i][j] = dp[i][j]|| dp[i-1][j];
                    }
                } else {
                    //如果 不是通配符, 并且对应i和j对应位置匹配的话, 使用上一位的结果.
                    if (matches(s,p,i,j)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                }
            }
        }
        //s的 前m个字符是否符合 p的前n个字符
        return dp[m][n];
    }

    public boolean matches(String s, String p, int i, int j){
        // 第一列, 如果s 为空, p不为空的情况 返回 false
        if (i == 0){
            return false;
        }
        // 如果 j 的前一个字符为., 匹配任意, 直接返回true
        if (p.charAt(j-1) == '.'){
            return true;
        }
        //如果 相同位置相等, 返回 true
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
