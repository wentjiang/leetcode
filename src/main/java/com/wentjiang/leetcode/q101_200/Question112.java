package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2019/10/3 7:29 PM
 * @description
 */
public class Question112 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private boolean fetch = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return findPath(root, sum, 0);
    }

    private boolean findPath(TreeNode root, int sum, int current) {
        if (root == null){
            return false;
        }
        if (fetch) {
            return true;
        }
        current = root.val + current;
        if (current == sum && root.left == null && root.right == null) {
            fetch = true;
            return true;
        }
        findPath(root.left, sum, current);
        findPath(root.right, sum, current);
        return false;
    }

}
