package com.wentjiang.leetcode.q101_200;

import java.util.*;

/**
 * @author wentao.jiang
 * @date 2019/9/29 5:01 PM
 * @description
 */
public class Question_102 {

    private List<List<Integer>> result;

    public List<List<Integer>> levelOrder(TreeNode root) {
        result = new ArrayList<>();
        viewTree(root, 0);
        return result;
    }

    private void viewTree(TreeNode node, int layer) {
        if (node == null) {
            return;
        }
        if (result.size() <= layer) {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            result.add(list);
        } else {
            result.get(layer).add(node.val);
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
