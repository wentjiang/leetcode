package com.wentjiang.leetcode.q601_700;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question662 {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(new TreeNode(1, root.left, root.right));
        int max = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int startIndex = -1;
            int endIndex = -1;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                endIndex = node.val;
                if (startIndex == -1) {
                    startIndex = node.val;
                }
                if (node.left != null) {
                    queue.add(new TreeNode(node.val * 2, node.left.left, node.left.right));
                }
                if (node.right != null) {
                    queue.add(new TreeNode(node.val * 2 + 1, node.right.left, node.right.right));
                }
            }
            max = Math.max(max, endIndex - startIndex + 1);
        }
        return max;
    }
}
