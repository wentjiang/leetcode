package com.wentjiang.leetcode.q2401_2500;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2471 {
    /**
     * 思路1 BFS分层遍历, 每层手动排序,统计需要交换的次数
     * 思路2 BFS分层遍历, 交换次数为所有置换环的次数,单个置换环的置换次数为环内元素数量-1
     *
     * @param root
     * @return
     */
    public int minimumOperations(TreeNode root) {
        int sum = 0;
        List<TreeNode> currentLayer = new ArrayList<>();

        currentLayer.add(root);

        while (!currentLayer.isEmpty()) {
            List<TreeNode> nextLayer = new ArrayList<>();
            List<Integer> currentValues = new ArrayList<>();
            List<Integer> sortedValues = new ArrayList<>();
            //遍历当前层
            for (TreeNode node : currentLayer) {
                currentValues.add(node.val);
                sortedValues.add(node.val);
                if (node.left != null) {
                    nextLayer.add(node.left);
                }
                if (node.right != null) {
                    nextLayer.add(node.right);
                }
            }
            currentLayer = nextLayer;

            sortedValues.sort(Integer::compareTo);
            boolean[] accessed = new boolean[currentValues.size()];
            Map<Integer, Integer> valueAndIndex = new HashMap<>();
            for (int i = 0; i < currentValues.size(); i++) {
                valueAndIndex.put(sortedValues.get(i), i);
            }
            int loop = 0;
            for (int i = 0; i < currentValues.size(); i++) {
                if (!accessed[i]) {
                    int j = i;
                    //每次遍历完一个圈
                    while (!accessed[j]) {
                        int index = valueAndIndex.get(currentValues.get(j));
                        accessed[j] = true;
                        j = index;
                    }
                    loop++;
                }
            }
            sum += sortedValues.size() - loop;
        }
        return sum;
    }
}
