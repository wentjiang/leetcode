package com.wentjiang.leetcode.q101_200;

import java.util.*;

/**
 * @author wentao.jiang
 * @date 2019/9/29 5:01 PM
 * @description
 */
public class Question_102 {

    private List<List<Integer>> result;

    private Map<Integer, List<Integer>> map = new TreeMap<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        result = new ArrayList<>();
        viewTree(root, 0);
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    private void viewTree(TreeNode node, int layer) {
        if (node == null) {
            return;
        }
        if (map.get(layer) == null) {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            map.put(layer, list);
        } else {
            map.get(layer).add(node.val);
        }
        viewTree(node.left, layer + 1);
        viewTree(node.right, layer + 1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
