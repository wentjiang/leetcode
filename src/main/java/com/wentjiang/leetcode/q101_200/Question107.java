package com.wentjiang.leetcode.q101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentao.jiang
 * @date 2019/10/2 10:37 AM
 * @description
 */
public class Question107 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        result = new ArrayList<>();
        viewTree(root, 0);
        List<List<Integer>> newResult = new ArrayList<>();
        for (int i = result.size()-1; i >= 0; i--) {
            newResult.add(result.get(i));
        }
        return newResult;
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

}
