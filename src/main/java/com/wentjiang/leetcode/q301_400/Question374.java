package com.wentjiang.leetcode.q301_400;

public class Question374 {

    private final int guessNum;

    public Question374(int guessNum) {
        this.guessNum = guessNum;
    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid);
            if (result <= 0) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int guessNumber1(int n) {
        int left = 1, right = n;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2; // 防止计算时溢出
            if (guess(mid) <= 0) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }

    public int guess(int num) {
        return -Integer.compare(num, guessNum);
    }
}
