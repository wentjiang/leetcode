package com.wentjiang.leetcode.utils;

/**
 * @author wentao.jiang
 * @date 2020/1/27 8:28 AM
 * @description 公共使用的treenode
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    /**
     * index + 1 的二进制的倒序为当前元素所放置的位置
     *
     * @param array
     * @return
     */
    public static TreeNode createTreeFromArray(Integer[] array) {
        TreeNode root = new TreeNode(array[0]);

        for (int i = 1; i < array.length; i++) {
            String binaryString = Integer.toBinaryString(i + 1);
            char[] chars = binaryString.toCharArray();
            TreeNode parentNode = root;

            for (int j = 1; j < chars.length - 1; j++) {
                if (parentNode == null) {
                    break;
                }
                if (chars[j] == '1') {
                    parentNode = parentNode.left;
                }
                if (chars[j] == '0') {
                    parentNode = parentNode.right;
                }
            }

            if (array[i] != null && parentNode != null) {
                if (chars[chars.length - 1] == '1') {
                    parentNode.right = new TreeNode(array[i]);
                } else {
                    parentNode.left = new TreeNode(array[i]);
                }
            }
        }
        return root;
    }

    @Override
    public String toString() {
        String leftString, rightString;
        leftString = left == null ? "null" : left.toString().substring(1, left.toString().length() - 1);
        rightString = right == null ? "null" : right.toString().substring(1, right.toString().length() - 1);
        return "[" + val + "," + leftString + "," + rightString + "]";
    }

}
