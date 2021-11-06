package com.wentjiang.leetcode.q1_100;

/**
 * 双指针法,找到中间的数
 */
public class Question4_2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Index = 0;
        int nums2Index = 0;
        if (nums1.length == 0) {
            return nums2.length % 2 == 0 ? (double) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2
                    : nums2[nums2.length / 2];
        }
        if (nums2.length == 0) {
            return nums1.length % 2 == 0 ? (double) (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2
                    : nums1[nums1.length / 2];
        }
        // 分割线右边多一个元素
        for (int i = 0; i < (nums1.length + nums2.length) / 2; i++) {
            if (nums1Index == nums1.length) {
                nums2Index++;
            } else if (nums2Index == nums2.length) {
                nums1Index++;
            } else {
                if (nums1[nums1Index] > nums2[nums2Index]) {
                    nums2Index++;
                } else {
                    nums1Index++;
                }
            }
        }
        // case1 : 两个数的情况
        if ((nums1.length + nums2.length) % 2 == 0) {
            // 第一个在尾,第二个在头
            if (nums1Index == nums1.length && nums2Index == 0) {
                return (double) (nums1[nums1Index - 1] + nums2[nums2Index]) / 2;
                // 第一个在头,第二个在尾
            } else if (nums2Index == nums2.length && nums1Index == 0) {
                return (double) (nums2[nums2Index - 1] + nums1[nums1Index]) / 2;
                // 第一个在尾,第二个在中间
            } else if (nums1Index == nums1.length) {
                return (double) (Math.max(nums1[nums1Index - 1], nums2[nums2Index - 1]) + nums2[nums2Index]) / 2;
                // 第一个在中间,第二个在尾
            } else if (nums2Index == nums2.length) {
                return (double) (Math.max(nums1[nums1Index - 1], nums2[nums2Index - 1]) + nums1[nums1Index]) / 2;
                // 第一个在头,第二个在中间
            } else if (nums1Index == 0) {
                return (double) (nums2[nums2Index - 1] + Math.min(nums1[nums1Index], nums2[nums2Index])) / 2;
                // 第一个在中间,第二个在头
            } else if (nums2Index == 0) {
                return (double) (nums1[nums1Index - 1] + Math.min(nums1[nums1Index], nums2[nums2Index])) / 2;
                // 两个都在中间
            } else {
                return ((double) Math.max(nums1[nums1Index - 1], nums2[nums2Index - 1])
                        + Math.min(nums2[nums2Index], nums1[nums1Index])) / 2;
            }
            // case2 : 一个数的情况
        } else {
            if (nums1Index >= nums1.length) {
                return nums2[nums2Index];
            } else if (nums2Index >= nums2.length) {
                return nums1[nums1Index];
            } else {
                return Math.min(nums1[nums1Index], nums2[nums2Index]);
            }
        }
    }
}
