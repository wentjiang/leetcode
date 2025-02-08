package com.wentjiang.leetcode.q101_200;

public class Question191_1 {
    //使用递归方法求解
    public int hammingWeight(int n) {
        if (n <= 1) {
            return n;
        } else {
            int temp = (int) Math.floor(Math.log(n) / Math.log(2));
            return 1 + hammingWeight(n - (int) Math.pow(2, temp));
        }
    }
}
