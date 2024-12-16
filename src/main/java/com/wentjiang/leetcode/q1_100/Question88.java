package com.wentjiang.leetcode.q1_100;

public class Question88 {
    /**
     * 倒序将两个数组的内容放在nums1的结尾
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m;
        int l2 = n;

        while (l1 != 0 || l2 != 0) {
            if (l1 > 0 && l2 > 0) {
                int t1 = nums1[l1 - 1];
                int t2 = nums2[l2 - 1];
                if (t1 > t2) {
                    nums1[l1 + l2 - 1] = t1;
                    l1--;
                } else {
                    nums1[l1 + l2 - 1] = t2;
                    l2--;
                }
            }else if (l1 == 0 && l2 >= 1) {
                nums1[l2 - 1] = nums2[l2 - 1];
                l2--;
            }else if (l1 >= 1 && l2 == 0) {
//                nums1[l1-1] = nums1[l1-1];
                l1--;
            }
        }
    }
}
