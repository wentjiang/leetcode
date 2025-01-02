package com.wentjiang.leetcode.q901_1000;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question965 {
    public boolean isUnivalTree(TreeNode root) {
        int currentVal = root.val;
        boolean left;
        boolean right;
        boolean leftEq;
        boolean rightEq;
        if (root.left != null) {
            leftEq = root.left.val == currentVal;
            if (!leftEq) {
                return false;
            }
            left = isUnivalTree(root.left);
            if (!left) {
                return false;
            }
        }

        if (root.right != null) {
            rightEq = root.right.val == currentVal;
            if (!rightEq) {
                return false;
            }
            right = isUnivalTree(root.right);
            if (!right) {
                return false;
            }
        }
        return true;
    }
}
