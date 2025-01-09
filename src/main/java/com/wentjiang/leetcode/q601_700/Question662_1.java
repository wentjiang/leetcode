package com.wentjiang.leetcode.q601_700;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.*;

public class Question662_1 {
    /**
     * 广度优先遍历,左边子节点的index是当前index的二倍,右节点为2倍+1
     *
     * @param root
     * @return
     */
    public int widthOfBinaryTree(TreeNode root) {
        int max = 1;
        List<Map.Entry<TreeNode, Integer>> list = new ArrayList<>();
        Map.Entry<TreeNode, Integer> entry = new AbstractMap.SimpleEntry<>(root, 1);
        list.add(entry);
        while (!list.isEmpty()) {
            List<Map.Entry<TreeNode, Integer>> tmp = new ArrayList<>();
            for (Map.Entry<TreeNode, Integer> e : list) {
                TreeNode tree = e.getKey();
                int index = e.getValue();
                if (tree.left != null) {
                    tmp.add(new AbstractMap.SimpleEntry<>(tree.left, index * 2));
                }
                if (tree.right != null) {
                    tmp.add(new AbstractMap.SimpleEntry<>(tree.right, index * 2 + 1));
                }
            }
            if (!tmp.isEmpty()) {
                max = Math.max(max, tmp.getLast().getValue() - tmp.getFirst().getValue() + 1);
            }
            list = tmp;
        }
        return max;
    }
}
