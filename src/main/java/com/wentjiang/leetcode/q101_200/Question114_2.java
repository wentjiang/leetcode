package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question114_2 {
    /**
     * 使用递归方法
     */

    public void flatten(TreeNode root) {
        //终止条件
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        //重复的处理方法
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = temp;
    }
}
