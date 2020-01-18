package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2020/1/18 10:56 AM
 * @description
 */
public class Question124 {

    private int max = Integer.MIN_VALUE;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxPathSum(TreeNode root) {
        currentPath(root);
        return max;
    }

    public int currentPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(currentPath(root.left), 0);

        int rightMax = Math.max(currentPath(root.right), 0);

        int current = root.val + leftMax + rightMax;
        max = Math.max(max, current);
        return root.val + Math.max(leftMax , rightMax);
    }

}
