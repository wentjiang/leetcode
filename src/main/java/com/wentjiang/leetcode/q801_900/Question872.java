package com.wentjiang.leetcode.q801_900;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = getLeafList(root1);
        List<Integer> leaves2 = getLeafList(root2);
        if (leaves1.size() != leaves2.size()) {
            return false;
        }
        for (int i = 0; i < leaves1.size(); i++) {
            if (leaves1.get(i).intValue() != leaves2.get(i).intValue()) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getLeafList(TreeNode root) {
        List<Integer> leaves = new ArrayList<>();
        if (root.left != null) {
            leaves.addAll(getLeafList(root.left));
        }
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        }
        if (root.right != null) {
            leaves.addAll(getLeafList(root.right));
        }
        return leaves;
    }
}
