package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2019/10/11 1:21 PM
 * @description 递归修改
 */
public class Question114_1 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void flatten(TreeNode root) {
        viewTree(root);
    }

    public void viewTree(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.right = left;
            while (left.right != null) {
                left = left.right;
            }
            left.right = right;
            root.left = null;
        }
        viewTree(root.right);
    }
}
