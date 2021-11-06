package com.wentjiang.leetcode.q301_400;

import com.wentjiang.leetcode.common.NestedInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question341 {

}

/**
 * 1.先将嵌套结构转换为一维结构,树转链表 2.使用list的迭代器
 */
class NestedIterator implements Iterator<Integer> {

    List<Integer> list;
    Iterator<Integer> iterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        // 放在一个list中
        this.list = addAllNumbers(nestedList);
        iterator = list.listIterator();
    }

    private List<Integer> addAllNumbers(List<NestedInteger> nestedList) {
        List<Integer> result = new ArrayList<>();
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                result.add(nestedInteger.getInteger());
            } else {
                result.addAll(addAllNumbers(nestedInteger.getList()));
            }
        }
        return result;
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
