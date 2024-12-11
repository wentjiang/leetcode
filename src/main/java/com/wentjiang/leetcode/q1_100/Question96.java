package com.wentjiang.leetcode.q1_100;

import java.util.HashMap;
import java.util.Map;

public class Question96 {
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        // 超过两个节点的情况下遍历
        for (int i = 2; i <= n; ++i) {
            // 以当前j为根节点,分成左右的树,所有的可能性为左子树*右子树
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
