package com.wentjiang.leetcode.q701_800;

import java.util.LinkedList;

public class Question705 {
}

class MyHashSet {

    private static final int HASH_MODE_NUM = 997;
    private LinkedList<Integer>[] hashList;

    // 使用链表对hash进行扩展

    public MyHashSet() {
        hashList = new LinkedList[HASH_MODE_NUM];
        for (int i = 0; i < HASH_MODE_NUM; i++) {
            hashList[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int hashKey = key % HASH_MODE_NUM;
        LinkedList<Integer> list = hashList[hashKey];
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        int hashKey = key % HASH_MODE_NUM;
        LinkedList<Integer> list = hashList[hashKey];

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == key) {
                    list.remove(i);
                    break;
                }
            }
        }
    }

    public boolean contains(int key) {
        int hashKey = key % HASH_MODE_NUM;
        LinkedList<Integer> list = hashList[hashKey];
        return list.contains(key);
    }
}