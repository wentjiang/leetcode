package com.wentjiang.leetcode.q401_500;

public class Question496 {
    /**
     * 常规思路,直接遍历nums1, 在nums2中找到对应符合要求的值
     * 
     * @param nums1
     * @param nums2
     * 
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int index = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == num) {
                    index = j;
                    break;
                }
            }
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > num) {
                    nums1[i] = nums2[j];
                    break;
                }
            }
            if (nums1[i] == num) {
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
