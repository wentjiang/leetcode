package com.wentjiang.leetcode.q101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/3 2:53 PM
 * 
 * @description
 */
public class Question103 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private List<List<Integer>> result;

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        result = new ArrayList<>();
        viewTree(root, 0);
        List<List<Integer>> newResult = new ArrayList<>();
        boolean reversal = false;
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            if (reversal) {
                List<Integer> temp = new ArrayList<>();
                for (int j = list.size() - 1; j >= 0; j--) {
                    temp.add(list.get(j));
                    result.set(i, temp);
                }
                reversal = false;
            } else {
                reversal = true;
            }
        }
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
}
