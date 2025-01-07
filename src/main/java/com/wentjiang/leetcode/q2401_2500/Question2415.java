package com.wentjiang.leetcode.q2401_2500;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question2415 {
    /**
     * BFS 如果是奇数层,将val替换,其他节点关系都不修改
     *
     * @param root
     * @return
     */
    public TreeNode reverseOddLevels(TreeNode root) {
        int layer = 0;
        List<TreeNode> currentLayer = new ArrayList<>();
        currentLayer.add(root);
        while (!currentLayer.isEmpty()) {
            //执行反转
            if (layer % 2 == 1) {
                for (int i = 0; i < currentLayer.size() / 2; i++) {
                    int temp1 = currentLayer.get(i).val;
                    currentLayer.get(i).val = currentLayer.get(currentLayer.size() - 1 - i).val;
                    currentLayer.get(currentLayer.size() - 1 - i).val = temp1;
                }
            }
            List<TreeNode> nextLayer = new ArrayList<>();
            for (TreeNode node : currentLayer) {
                if (node.left != null) {
                    nextLayer.add(node.left);
                }
                if (node.right != null) {
                    nextLayer.add(node.right);
                }
            }
            layer++;
            currentLayer = nextLayer;
        }
        return root;
    }
}
