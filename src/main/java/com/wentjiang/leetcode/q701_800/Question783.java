package com.wentjiang.leetcode.q701_800;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question783 {


    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;

        //遍历,排序,求值
        List<Integer> nums = getAllTreeNodeValues(root);
        nums.sort(Comparator.naturalOrder());
        for (int i = 1; i < nums.size(); i++) {
            min = Math.min(min, Math.abs(nums.get(i) - nums.get(i - 1)));
        }
        return min;
    }

    private List<Integer> getAllTreeNodeValues(TreeNode root) {
        if (root != null) {
            List<Integer> leftList = getAllTreeNodeValues(root.left);
            List<Integer> rightList = getAllTreeNodeValues(root.right);
            List<Integer> result = new ArrayList<>();
            result.add(root.val);
            result.addAll(leftList);
            result.addAll(rightList);
            return result;
        } else {
            return new ArrayList<>();
        }
    }
}
