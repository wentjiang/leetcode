package com.wentjiang.leetcode.q701_800;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode parent = findParent(root, val);
        TreeNode newNode = new TreeNode(val);
        if (val > parent.val) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
        return root;
    }

    private TreeNode findParent(TreeNode root, int val) {
        if (val < root.val) {
            if (root.left == null) {
                return root;
            } else {
                return findParent(root.left, val);
            }
        } else {
            if (root.right == null) {
                return root;
            } else {
                return findParent(root.right, val);
            }
        }
    }
}
