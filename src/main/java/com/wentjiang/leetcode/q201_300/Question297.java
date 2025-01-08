package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class Question297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return doSerialize(root, "");
    }

    private String doSerialize(TreeNode root, String s) {
        if (root == null) {
            return s + "None,";
        } else {
            String str = s + root.val + ",";
            str = doSerialize(root.left, str);
            str = doSerialize(root.right, str);
            return str;
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        java.util.List<String> arrays = new LinkedList<>(Arrays.asList(data.split(",")));
        if (arrays.isEmpty()) {
            return null;
        }
        return doDeserialize(arrays);
    }

    private TreeNode doDeserialize(List<String> arrays) {
        String str = arrays.get(0);
        if ("None".equals(str) || str == null || str.isEmpty()) {
            arrays.remove(0);
            return null;
        } else {
            TreeNode root = new TreeNode(Integer.parseInt(str));
            arrays.remove(0);
            TreeNode leftTree = doDeserialize(arrays);
            TreeNode rightTree = doDeserialize(arrays);
            root.left = leftTree;
            root.right = rightTree;
            return root;
        }
    }
}
