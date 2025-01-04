package com.wentjiang.leetcode.q501_600;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question563 {
    public int findTilt(TreeNode root) {
        return findTiltValue(root)[1];
    }

    /**
     * {value的总和, 当前的坡度总和}
     *
     * @param root
     * @return
     */
    public int[] findTiltValue(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = new int[]{0, 0}, right = new int[]{0, 0};
        if (root.left != null) {
            left = findTiltValue(root.left);
        }
        if (root.right != null) {
            right = findTiltValue(root.right);
        }
        int sumValue = root.val + left[0] + right[0];
        int sumTilt = Math.abs(left[0] - right[0]) + left[1] + right[1];
        return new int[]{sumValue, sumTilt};
    }
}
