package com.wentjiang.leetcode.q2101_2200;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Question2196 {

    /**
     * [父,子,是否左节点] 遍历的过程中,创建
     */

    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<TreeNode, Boolean> isRoot = new HashMap<>();
        Map<Integer, TreeNode> nodeMap = new HashMap<>();
        for (int[] description : descriptions) {
            int par = description[0];
            int child = description[1];
            boolean isLeft = description[2] == 1;
            TreeNode pNode;
            TreeNode cNode;
            if (nodeMap.containsKey(par)) {
                pNode = nodeMap.get(par);
            } else {
                pNode = new TreeNode(par);
                nodeMap.put(par, pNode);
            }
            if (nodeMap.containsKey(child)) {
                cNode = nodeMap.get(child);
            } else {
                cNode = new TreeNode(child);
                nodeMap.put(child, cNode);
            }
            if (isLeft) {
                pNode.left = cNode;
            } else {
                pNode.right = cNode;
            }
            if (!isRoot.containsKey(pNode)) {
                isRoot.put(pNode, true);
            }
            isRoot.put(cNode, false);
        }

        //找到根节点
        for (Map.Entry<TreeNode, Boolean> entry : isRoot.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return null;
    }
}
