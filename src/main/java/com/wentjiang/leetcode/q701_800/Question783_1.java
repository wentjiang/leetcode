package com.wentjiang.leetcode.q701_800;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question783_1 {

    /**
     * 通过树建立排序数组
     *
     * @param root
     * @return
     */
    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        List<Integer> values = buildList(root);
        for (int i = 0; i < values.size() - 1; i++) {
            min = Math.min(min, values.get(i + 1) - values.get(i));
        }
        return min;
    }

    public List<Integer> buildList(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root.left != null) {
            result.addAll(buildList(root.left));
        }
        result.add(root.val);
        if (root.right != null) {
            result.addAll(buildList(root.right));
        }
        return result;
    }
}
