package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2019/10/6 8:38 AM
 * @description
 */
public class Question_110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private boolean balanced;

    public boolean isBalanced(TreeNode root) {
        balanced = true;
        getHeight(root, 0);
        return balanced;
    }

    public int getHeight(TreeNode root, int height) {
        if (!balanced) {
            return 0;
        }
        if (root == null) {
            return height;
        }
        int leftHeight = getHeight(root.left, height + 1);
        int rightHeight = getHeight(root.right, height + 1);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            balanced = false;
        }
        return Math.max(leftHeight, rightHeight);
    }

}
