package com.wentjiang.leetcode.q601_700;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.*;

public class Question671 {
    private Set<Integer> set = new HashSet<>();

    public int findSecondMinimumValue(TreeNode root) {
        lookUpTree(root);
        List<Integer> list = Arrays.asList(set.toArray(new Integer[0]));
        Collections.sort(list);
        if (list.size() >= 2) {
            return list.get(1);
        } else {
            return -1;
        }
    }

    public void lookUpTree(TreeNode node) {
        if (node != null) {
            set.add(node.val);
            lookUpTree(node.left);
            lookUpTree(node.right);
        }
    }
}
