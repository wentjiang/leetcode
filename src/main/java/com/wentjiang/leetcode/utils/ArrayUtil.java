package com.wentjiang.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }

    public static <T> ArrayList<ArrayList<T>> convertArrayToList2(T[][] array) {
        ArrayList<ArrayList<T>> nestedList = new ArrayList<>();

        for (T[] innerArray : array) {
            ArrayList<T> innerList = new ArrayList<>();
            for (T element : innerArray) {
                innerList.add(element);
            }
            nestedList.add(innerList);
        }

        return nestedList;
    }

}
