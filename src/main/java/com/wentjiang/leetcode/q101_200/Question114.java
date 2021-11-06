package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/11 11:13 AM
 * 
 * @description 普通修改
 */
public class Question114 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left == null) {
                root = root.right;
            } else {
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }

        }
    }
}
