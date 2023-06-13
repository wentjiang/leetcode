package com.wentjiang.leetcode.practice.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Day2Question3 {


    public int maxWidth(Integer[] treeArray) {

        List<ExtendTreeNode> extendTreeNodes = new ArrayList<>();
        int maxRealDepth = 0;

        TreeNode root = createTreeFromArray(treeArray);
        ExtendTreeNode extendTreeNodeRoot = new ExtendTreeNode(root, true, 1);
        extendTreeNodes.add(extendTreeNodeRoot);

        Iterator<ExtendTreeNode> iterator = extendTreeNodes.iterator();
        while (iterator.hasNext()) {
            ExtendTreeNode next = iterator.next();
            //如果上一层没有真实的节点,不用继续向下扩展
            if (next.depth > maxRealDepth + 1) {
                break;
            }
            //如果当前节点是真实节点
            if (next.isRealNode) {
                //更新最大真实的深度
                maxRealDepth = Math.max(next.depth, maxRealDepth);
                TreeNode leftTreeNode = next.node.left;
                TreeNode rightTreeNode = next.node.right;
                //左节点不为空的情况
                if (leftTreeNode != null) {
                    extendTreeNodes.add(new ExtendTreeNode(leftTreeNode, true, next.depth + 1));
                } else {
                    //为空使用空节点站位方便后边计算
                    extendTreeNodes.add(new ExtendTreeNode(null, false, next.depth + 1));
                }
                if (rightTreeNode != null) {
                    extendTreeNodes.add(new ExtendTreeNode(rightTreeNode, true, next.depth + 1));
                } else {
                    extendTreeNodes.add(new ExtendTreeNode(null, false, next.depth + 1));
                }
            } else {
                //如果节点是虚拟节点,添加两个空节点站位
                extendTreeNodes.add(new ExtendTreeNode(null, false, next.depth + 1));
                extendTreeNodes.add(new ExtendTreeNode(null, false, next.depth + 1));
            }
        }

        int currentMax = 0;
        int tempMax = 0;
        int currentDepth = 0;
        boolean thisLineStarted = false;
        for (ExtendTreeNode extendTreeNode : extendTreeNodes) {
            //如果深度增加,初始化重新计数
            if (currentDepth != extendTreeNode.depth) {
                currentDepth = extendTreeNode.depth;
                thisLineStarted = false;
                tempMax = 0;
            }
            //如果当前行已经有了有效开始
            if (thisLineStarted) {
                //临时max增加
                tempMax++;
                //如果当前是真实节点,比较最大值
                if (extendTreeNode.isRealNode) {
                    currentMax = Math.max(currentMax, tempMax);
                }
            } else {
                //如果还没有真实开始

                //判断当前是否是真实节点
                if (extendTreeNode.isRealNode) {
                    thisLineStarted = true;
                    tempMax++;
                }
            }
        }

        return currentMax;
    }

    public class ExtendTreeNode {
        private TreeNode node;
        private boolean isRealNode;
        private int depth;

        public ExtendTreeNode(TreeNode node, boolean isRealNode, int depth) {
            this.node = node;
            this.isRealNode = isRealNode;
            this.depth = depth;
        }
    }

    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode createTreeFromArray(Integer[] array) {
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
}
