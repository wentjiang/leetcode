package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * 
 * @date 2019/2/24 5:58 PM
 * 
 * @description 题目中要求时间复杂度为O(log ( m + n)),如果直接合并遍历,复杂度为n,不满足要求 先判断是否一个数组比另一个数组所有数都大,如果是,按位计算即可
 *              <p>
 *              归并两个数组,取中间值
 */
public class Question4_1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int firstIndex = 0;
        int secondIndex = 0;
        // 循环归并
        for (int i = 0; i < nums1.length + nums2.length; i++) {
            if (secondIndex == nums2.length || nums2.length == 0 || (nums1.length != firstIndex
                    && nums2.length != secondIndex && nums1[firstIndex] < nums2[secondIndex])) {
                nums[firstIndex + secondIndex] = nums1[firstIndex];
                firstIndex++;
            } else if (firstIndex == nums1.length || nums1.length == 0 || (nums1.length != firstIndex
                    && nums2.length != secondIndex && nums1[firstIndex] >= nums2[secondIndex])) {
                nums[firstIndex + secondIndex] = nums2[secondIndex];
                secondIndex++;
            }
        }
        return nums.length % 2 == 0 ? (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2
                : nums[nums.length / 2];
    }
}
