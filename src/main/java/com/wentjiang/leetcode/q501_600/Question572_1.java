package com.wentjiang.leetcode.q501_600;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question572_1 {
    /**
     * 使用深度优先算法
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root, subRoot);
    }

    private boolean dfs(TreeNode root, TreeNode subRoot) {
        boolean checksame = checkSame(root, subRoot);
        boolean leftSame = false, rightSame = false;
        if (root.left != null) {
            leftSame = dfs(root.left, subRoot);
        }
        if (root.right != null) {
            rightSame = dfs(root.right, subRoot);
        }
        return checkSame(root, subRoot) || leftSame || rightSame;
    }

    private boolean checkSame(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 != null && node2 != null && node1.val == node2.val) {
            return checkSame(node1.left, node2.left) && checkSame(node1.right, node2.right);
        } else {
            return false;
        }
    }
}
