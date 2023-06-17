package com.wentjiang.leetcode.practice.day2;

/**
 * leetcode 662 @see {@link com.wentjiang.leetcode.q601_700.Question662}
 */
public class Day2Question3 {

    // 支持找到同行的下一个相邻节点
    public class ExtendedTreeNode {
        public Integer value;
        public ExtendedTreeNode leftChild;
        public ExtendedTreeNode rightChild;
        /**
         * 右边相邻的节点
         */
        public ExtendedTreeNode rightBeside;

        public ExtendedTreeNode(Integer value, ExtendedTreeNode leftChild, ExtendedTreeNode rightChild,
                ExtendedTreeNode rightBeside) {
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.rightBeside = rightBeside;
        }
    }

    // 用来查看还原的结果
    public void printTree(ExtendedTreeNode root) {
        ExtendedTreeNode currentHead = root;
        while (currentHead != null) {
            ExtendedTreeNode currentNode = currentHead;
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
    public ExtendedTreeNode getTreeFromArray(Integer[] treeArray) {
        ExtendedTreeNode root = new ExtendedTreeNode(treeArray[0], null, null, null);
        if (treeArray.length == 1) {
            return root;
        } else {
            // 上一行的头node
            ExtendedTreeNode upLineHead = root;
            // 上一行遍历到的当前node
            ExtendedTreeNode upLineCurrentNode = upLineHead;
            // 当前行的头node
            ExtendedTreeNode currentHeadNode = null;
            // 当前行的当前生成的node的前一个node
            ExtendedTreeNode currentPreviousNode = null;
            int currentTreeArrayIndex = 1;

            // 如果上一层没有遍历完,继续遍历
            while (upLineCurrentNode != null) {
                // 如果当前节点为null
                if (upLineCurrentNode.value == null) {
                    upLineCurrentNode.leftChild = new ExtendedTreeNode(null, null, null, null);
                    upLineCurrentNode.rightChild = new ExtendedTreeNode(null, null, null, null);
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
                        upLineCurrentNode.leftChild = new ExtendedTreeNode(treeArray[currentTreeArrayIndex++], null,
                                null, null);
                    }
                    if (currentPreviousNode == null) {
                        currentHeadNode = upLineCurrentNode.leftChild;
                    } else {
                        currentPreviousNode.rightBeside = upLineCurrentNode.leftChild;
                        currentPreviousNode = upLineCurrentNode.leftChild;
                    }
                    currentPreviousNode = upLineCurrentNode.leftChild;
                    if (currentTreeArrayIndex < treeArray.length) {
                        upLineCurrentNode.rightChild = new ExtendedTreeNode(treeArray[currentTreeArrayIndex++], null,
                                null, null);
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
                    ExtendedTreeNode tempNode = upLineCurrentNode;
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
        ExtendedTreeNode root = getTreeFromArray(treeArray);

        ExtendedTreeNode currentHead = root;
        while (currentHead != null) {
            ExtendedTreeNode currentNode = currentHead;
            boolean started = false;
            int tempMax = 0;
            while (currentNode != null) {
                if (!started && currentNode.value != null) {
                    started = true;
                    tempMax++;
                } else if (started) {
                    tempMax++;
                    if (currentNode.value != null) {
                        maxWidth = Math.max(tempMax, maxWidth);
                    }
                }
                currentNode = currentNode.rightBeside;
            }
            currentHead = currentHead.leftChild;
        }

        return maxWidth;
    }

}
