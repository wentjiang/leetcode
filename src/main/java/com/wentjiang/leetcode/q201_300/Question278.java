package com.wentjiang.leetcode.q201_300;

public class Question278 {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (end - start > 0) {
            int mid = start + (end - start) / 2;
            //正确的情况向前移动
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                //错误的情况向后移动
                start = mid + 1;
            }
        }
        return start;
    }

    public boolean isBadVersion(int version) {
        return true;
    }
}



