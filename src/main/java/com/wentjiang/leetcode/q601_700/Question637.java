package com.wentjiang.leetcode.q601_700;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question637 {
    /**
     * 先遍历,再计算
     *
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        List<TreeNode> currentLayer = new ArrayList<>();
        if (root == null) {
            return result;
        } else {
            currentLayer.add(root);
            while (!currentLayer.isEmpty()) {
                List<TreeNode> newLayer = new ArrayList<>();
                double sum = 0;
                for (TreeNode node : currentLayer) {
                    sum += node.val;
                    if (node.left != null) {
                        newLayer.add(node.left);
                    }
                    if (node.right != null) {
                        newLayer.add(node.right);
                    }
                }
                result.add(sum / currentLayer.size());
                currentLayer = newLayer;
            }
        }
        return result;
    }
}
