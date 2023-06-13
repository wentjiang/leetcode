package com.wentjiang.leetcode.practice.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Day2Question3 {

    // 支持找到同行的下一个相邻节点
    public class TreeNode {
        public Integer value;
        public TreeNode leftChild;
        public TreeNode rightChild;
        /**
         * 右边相邻的节点
         */
        public TreeNode rightBeside;

        public TreeNode(Integer value, TreeNode leftChild, TreeNode rightChild, TreeNode rightBeside) {
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.rightBeside = rightBeside;
        }
    }

    public void printTree(TreeNode root) {
        TreeNode currentHead = root;
        while (currentHead != null) {
            TreeNode currentNode = currentHead;
            StringBuilder sb = new StringBuilder();
            while (currentNode != null) {
                sb.append(currentNode.value).append(",");
                currentNode = currentNode.rightBeside;
            }
            System.out.println(sb.toString());
            currentHead = currentHead.leftChild;
        }
    }

    // 将满二叉树数组还原为二叉树
    public TreeNode getTreeFromArray(Integer[] treeArray) {
        TreeNode root = new TreeNode(treeArray[0], null, null, null);
        if (treeArray.length == 1) {
            return root;
        } else {
            // 上一行的头node
            TreeNode upLineHead = root;
            // 上一行遍历到的当前node
            TreeNode upLineCurrentNode = upLineHead;
            // 当前行的头node
            TreeNode currentHeadNode = null;
            // 当前行的当前生成的node的前一个node
            TreeNode currentPreviousNode = null;
            int currentTreeArrayIndex = 1;

            // 如果上一层没有遍历完,继续遍历
            while (upLineCurrentNode != null) {
                // 如果当前节点为null
                if (upLineCurrentNode.value == null) {
                    upLineCurrentNode.leftChild = new TreeNode(null, null, null, null);
                    upLineCurrentNode.rightChild = new TreeNode(null, null, null, null);
                    // 头结点的情况
                    if (currentPreviousNode == null) {
                        currentHeadNode = upLineCurrentNode.leftChild;
                    } else {
                        // 否则使用当前的currentPreviousNode rightBeside指向左孩子
                        currentPreviousNode.rightBeside = upLineCurrentNode.leftChild;
                    }
                    currentPreviousNode = upLineCurrentNode.leftChild;
                    currentPreviousNode.rightBeside = upLineCurrentNode.rightChild;
                    currentPreviousNode = upLineCurrentNode.rightChild;
                } else {
                    // 如果当前节点不为null,需要消耗数组中的元素
                    if (currentTreeArrayIndex < treeArray.length) {
                        upLineCurrentNode.leftChild = new TreeNode(treeArray[currentTreeArrayIndex++], null, null,
                                null);
                    }
                    if (currentPreviousNode == null) {
                        currentHeadNode = upLineCurrentNode.leftChild;
                    } else {
                        currentPreviousNode.rightBeside = upLineCurrentNode.leftChild;
                        currentPreviousNode = upLineCurrentNode.leftChild;
                    }
                    currentPreviousNode = upLineCurrentNode.leftChild;
                    if (currentTreeArrayIndex < treeArray.length) {
                        upLineCurrentNode.rightChild = new TreeNode(treeArray[currentTreeArrayIndex++], null, null,
                                null);
                        currentPreviousNode.rightBeside = upLineCurrentNode.rightChild;
                        currentPreviousNode = upLineCurrentNode.rightChild;
                    }
                }

                upLineCurrentNode = upLineCurrentNode.rightBeside;

                // 如果上一行已经遍历完了,上一行的头结点还有左孩子,继续遍历下一行
                if (upLineCurrentNode == null && upLineHead.leftChild != null) {
                    // 移动至下一行
                    upLineCurrentNode = upLineHead.leftChild;
                    // 如果新的一行所有的数据都为null,或只有一个数据不为null,跳出构建
                    TreeNode tempNode = upLineCurrentNode;
                    int tempCount = 0;
                    while (tempNode != null) {
                        if (tempNode.value != null) {
                            tempCount++;
                        }
                        tempNode = tempNode.rightBeside;
                    }
                    if (tempCount < 1) {
                        break;
                    }

                    // 重置相关的变量
                    upLineHead = currentHeadNode;
                    upLineCurrentNode = currentHeadNode;
                    currentHeadNode = null;
                    currentPreviousNode = null;
                }
            }
        }

        return root;
    }

    public int maxWidth(Integer[] treeArray) {
        int maxWidth = 0;
        TreeNode root = getTreeFromArray(treeArray);

        TreeNode currentHead = root;
        while (currentHead != null) {
            TreeNode currentNode = currentHead;
            boolean started = false;
            int tempMax = 0;
            while (currentNode != null) {
                if (!started && currentNode.value != null) {
                    started = true;
                }
                if (started) {
                    tempMax++;
                    maxWidth = Math.max(tempMax, maxWidth);
                }
                currentNode = currentNode.rightBeside;
            }
            currentHead = currentHead.leftChild;
        }

        return maxWidth;
    }

}
