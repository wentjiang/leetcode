package com.wentjiang.leetcode.practice.day2;

import java.util.HashMap;
import java.util.Map;

public class Day2Question1 {

    /**
     * option 1: 直接使用linkedHashMap
     * option 2: 使用hashmap + 双向链表 组合方式实现
     */
    public static class LRUCache {
        private int capacity;
        private Map<Integer, Node> cache;
        private Node head;
        private Node tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new HashMap<>(capacity * 2);
        }

        public class Node {
            private Integer key;
            private Integer value;
            private Node previousNode;
            private Node nextNode;
        }

        public int get(int key) {
            Node node = cache.get(key);
            //没有找到直接返回-1
            if (node == null) {
                return -1;
            } else {
                //当前已经在末尾的情况
                if (tail == node) {
                    return node.value;
                }
                if (head == node) {
                    //如果是head,不是tail
                    head = head.nextNode;
                } else {
                    //中间位置的情况
                    Node currentPreviousNode = node.previousNode;
                    Node currentNextNode = node.nextNode;
                    currentPreviousNode.nextNode = currentNextNode;
                    currentNextNode.previousNode = currentPreviousNode;
                }
                //将当前node放置在队尾,并返回结果值
                tail.nextNode = node;
                node.previousNode = tail;
                node.nextNode = null;
                tail = node;
                return node.value;
            }
        }

        public void put(int key, int value) {
            if (!cache.containsKey(key)) {
                //不存在新建node
                Node newNode = new Node();
                newNode.key = key;
                newNode.value = value;
                //空队列的情况
                if (cache.size() == 0) {
                    head = newNode;
                } else {
                    //去除头结点
                    if (cache.size() == capacity) {
                        cache.remove(head.key);
                        head = head.nextNode;
                    }
                    //添加到队末
                    tail.nextNode = newNode;
                    newNode.previousNode = tail;
                }
                tail = newNode;
                cache.put(key, newNode);
            } else {
                //存在直接更新
                cache.get(key).value = value;
            }
        }
    }

}
