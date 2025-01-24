package com.wentjiang.leetcode.q1001_1100;

public class Question1061 {


    /**
     * 使用并查集, 将s1和s2的联通关系存储在数组中,index小的为父节点,更新时,如果遇到更小的index,需要将关联的所有的值都修改为更小的值, 对baseStr使用并查集转换为最小的字符串
     */
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent = new int[26];
        //初始化并查集
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        //构建并查集
        for (int i = 0; i < chars1.length; i++) {
            char c1 = chars1[i];
            char c2 = chars2[i];
            int i1 = c1 - 'a';
            int i2 = c2 - 'a';
            union(parent, i1, i2);
        }

        //转换baseStr
        char[] chars3 = baseStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars3) {
            char t = (char) ((find(parent, c - 'a') + 'a'));
            sb.append(t);
        }
        return sb.toString();
    }

    private void union(int[] parent, int num1, int num2) {
        int n1Parent = find(parent, num1);
        int n2Parent = find(parent, num2);
        if (n1Parent != n2Parent) {
            if (n1Parent < n2Parent) {
                parent[n2Parent] = n1Parent;
            } else {
                parent[n1Parent] = n2Parent;
            }
        }

    }

    private int find(int[] parent, int index1) {
        while (parent[index1] != index1) {
            parent[index1] = parent[parent[index1]];
            index1 = parent[index1];
        }
        return index1;
    }
}
