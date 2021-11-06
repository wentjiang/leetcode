package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/15 5:07 PM
 * 
 * @description 动态规划,参考题解
 */
public class Question72 {
    public int minDistance(String word1, String word2) {
        int[][] result = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < word1.length() + 1; i++) {
            for (int j = 0; j < word2.length() + 1; j++) {
                if (i == 0 && j == 0) {
                    result[i][j] = 0;
                }
                if (i == 0 && j != 0) {
                    result[i][j] = result[i][j - 1] + 1;
                }
                if (i != 0 && j == 0) {
                    result[i][j] = result[i - 1][j] + 1;
                }
                if (i != 0 && j != 0) {
                    if (word2.length() >= j - 1 && word1.length() >= i - 1
                            && word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        result[i][j] = result[i - 1][j - 1];
                    } else {
                        result[i][j] = Math.min(Math.min(result[i - 1][j], result[i][j - 1]), result[i - 1][j - 1]) + 1;
                    }
                }
            }
        }
        return result[word1.length()][word2.length()];
    }
}
