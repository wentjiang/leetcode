package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2019/10/9 12:39 PM
 * @description
 */
public class Question111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        viewTree(root, 1);
        return min;
    }

    private void viewTree(TreeNode root, int depth) {
        if (root == null || depth >= min) {
            return;
        }
        if (root.left == null && root.right == null && depth < min) {
            min = depth;
            return;
        }
        viewTree(root.left, depth + 1);
        viewTree(root.right, depth + 1);
    }
}
