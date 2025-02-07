package com.wentjiang.leetcode.q801_900;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question814 {
    /**
     * 深度遍历,如果没有子节点,且当前值为0的节点
     */
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        } else {
            return root;
        }
    }
}
