package com.wentjiang.leetcode.q901_1000;

public class Question990_1 {
    /**
     * 使用并查集求解, 先初始化并查集,然后将等式转换为并查集的联通关系,再用不等式判断之间的关系是否不成立
     */
    public boolean equationsPossible(String[] equations) {
        //初始化联通图
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        //使用等式关系构建联通图
        for (int i = 0; i < equations.length; i++) {
            String str = equations[i];
            if ((str.charAt(1) == '=')) {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                union(parent, index1, index2);
            }
        }

        //使用不等式关系判断联通
        for (int i = 0; i < equations.length; i++) {
            String str = equations[i];
            if (str.charAt(1) == '!') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                if (find(parent, index1) == find(parent, index2)) {
                    return false;
                }
            }
        }

        //都满足返回true
        return true;
    }

    /**
     * 将两个点联通起来
     */
    private void union(int[] parent, int index1, int index2) {
        //index1的根节点等于 index2的根节点;
        parent[find(parent, index1)] = find(parent, index2);
    }

    /**
     * 查找根节点
     */
    private int find(int[] parent, int index) {
        //如果当前的节点不是根节点
        while (parent[index] != index) {
            //查找当前节点的上一个节点
            parent[index] = parent[parent[index]];
            //上一个节点的index
            index = parent[index];
        }
        //返回根节点的index
        return index;
    }
}
