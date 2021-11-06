package com.wentjiang.leetcode.q701_800;

public class Question706 {

}

/**
 * 数组长度需要超过两倍的当前存储长度
 */
class MyHashMap {

    private int capacity = 12;
    private Entry[] entries;
    private int currentUsedCapacity = 0;
    private double storageFactor = 0.5;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        entries = new Entry[capacity];
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        // 容量不够进行扩容的情况
        if (currentUsedCapacity / storageFactor >= capacity) {
            extendCapacity();
        }

        // 正常添加的情况
        int index = getHashIndex(key, capacity);
        if (entries[index] != null && entries[index].getKey() == key) {
            entries[index] = new Entry(key, value);
        }
        while (entries[index] != null && entries[index].getKey() != key) {
            if (index == capacity - 1) {
                index = 0;
            } else {
                index++;
            }
        }
        entries[index] = new Entry(key, value);
        currentUsedCapacity++;
    }

    private int getHashIndex(int key, int capacity) {
        return key * 2 % capacity;
    }

    private void extendCapacity() {
        int extendCapacity = capacity * 2;
        Entry[] newEntries = new Entry[extendCapacity];
        for (Entry entry : entries) {
            if (entry != null) {
                int index = getHashIndex(entry.getKey(), extendCapacity);
                while (newEntries[index] != null) {
                    if (index == extendCapacity - 1) {
                        index = 0;
                    } else {
                        index++;
                    }
                }
                newEntries[index] = entry;
            }
        }
        entries = newEntries;
        capacity = extendCapacity;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int hashIndex = getHashIndex(key, capacity);
        for (int i = hashIndex; i < capacity; i++) {
            if (entries[i] != null && entries[i].getKey() == key) {
                return entries[i].getValue();
            }
        }
        for (int i = 0; i < capacity; i++) {
            if (entries[i] != null && entries[i].getKey() == key) {
                return entries[i].getValue();
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int hashIndex = getHashIndex(key, capacity);
        boolean removed = false;
        for (int i = hashIndex; i < capacity; i++) {
            if (entries[i] != null && entries[i].getKey() == key) {
                entries[i] = null;
                removed = true;
            }
        }
        if (!removed) {
            for (int i = 0; i < capacity; i++) {
                if (entries[i] != null && entries[i].getKey() == key) {
                    entries[i] = null;
                    removed = true;
                }
            }
        }
        currentUsedCapacity--;
    }
}

class Entry {
    private final int key;
    private final int value;

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}