package com.wentjiang.leetcode.q701_800;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Question706Test {

    @Test
    public void testHashMap() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // myHashMap 现在为 [[1,1]]
        myHashMap.put(2, 2); // myHashMap 现在为 [[1,1], [2,2]]
        myHashMap.get(1);    // 返回 1 ，myHashMap 现在为 [[1,1], [2,2]]
        myHashMap.get(3);    // 返回 -1（未找到），myHashMap 现在为 [[1,1], [2,2]]
        myHashMap.put(2, 1); // myHashMap 现在为 [[1,1], [2,1]]（更新已有的值）
        myHashMap.get(2);    // 返回 1 ，myHashMap 现在为 [[1,1], [2,1]]
        myHashMap.remove(2); // 删除键为 2 的数据，myHashMap 现在为 [[1,1]]
        myHashMap.get(2);    // 返回 -1（未找到），myHashMap 现在为 [[1,1]]
    }

    @Test
    public void testHashMap2() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        Assertions.assertEquals(1, myHashMap.get(1));
        Assertions.assertEquals(-1, myHashMap.get(3));
        myHashMap.put(2, 1);
        Assertions.assertEquals(1, myHashMap.get(2));
        myHashMap.remove(2);
        Assertions.assertEquals(-1, myHashMap.get(2));
    }

    @Test
    public void testHashMap3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MyHashMap myHashMap = new MyHashMap();
        String[] operations = {"MyHashMap", "put", "put", "remove", "get", "put", "put", "put", "remove", "put", "put", "put", "put", "remove", "put", "get", "put", "remove", "remove", "put", "put", "get", "put", "remove", "put", "put", "put", "remove", "put", "remove", "put", "put", "put", "put", "remove", "put", "remove", "put", "put", "put", "put", "put", "put", "put", "put", "get", "put", "put", "put", "get", "put", "put", "put", "put", "put", "get", "put", "put", "remove", "put", "put", "put", "put", "put", "put", "put", "remove", "put", "get", "get", "put", "put", "get", "put", "put", "put", "put", "put", "remove", "remove", "put", "get", "put", "put", "put", "remove", "put", "put", "put", "put", "put", "put", "put", "put", "put", "remove", "put", "put", "remove", "put", "remove"};
        int[][] params =
                {{}, {4, 30}, {41, 24}, {12}, {4}, {82, 59}, {92, 22}, {34, 41}, {98}, {59, 59}, {20, 35}, {24, 74}, {95, 10}, {59}, {66, 1}, {20}, {
                        20, 46}, {59}, {2}, {28, 13}, {45, 16}, {41}, {12, 8}, {24}, {27, 61}, {43, 57}, {72, 24}, {20}, {95, 75}, {20}, {64, 8}, {
                        36, 61}, {95, 53}, {76, 34}, {24}, {55, 68}, {21}, {75, 71}, {43, 36}, {50, 3}, {4, 97}, {44, 57}, {20, 1}, {4, 66}, {8, 71}, {
                        14}, {34, 41}, {75, 64}, {98, 47}, {35}, {12, 45}, {93, 69}, {93, 10}, {64, 66}, {72, 99}, {53}, {50, 97}, {48, 65}, {80}, {
                        46, 13}, {60, 15}, {42, 3}, {29, 18}, {95, 70}, {0, 80}, {6, 15}, {73}, {26, 45}, {58}, {46}, {60, 91}, {13, 32}, {75}, {
                        99, 67}, {85, 95}, {82, 37}, {7, 62}, {1, 97}, {66}, {13}, {63, 35}, {65}, {25, 12}, {38, 69}, {44, 3}, {6}, {86, 62}, {76, 8}, {
                        22, 79}, {55, 86}, {37, 79}, {63, 26}, {51, 23}, {48, 50}, {77, 72}, {65}, {14, 18}, {63, 90}, {37}, {88, 6}, {61}};
        Integer[] expectResults =
                {null, null, null, null, 30, null, null, null, null, null, null, null, null, null, null, 35, null, null, null, null, null, 24, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null, null, null, -1, null, null, null, null, null, -1, null, null, null, null, null, null, null, null, null, null, null, null, -1, 13, null, null, 64, null, null, null, null, null, null, null, null, -1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        Class clazz = myHashMap.getClass();
        Method putMethod = clazz.getDeclaredMethod("put", int.class, int.class);
        Method getMethod = clazz.getDeclaredMethod("get", int.class);
        Method removeMethod = clazz.getDeclaredMethod("remove", int.class);
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "put": {
                    putMethod.invoke(myHashMap, params[i][0], params[i][1]);
                    break;
                }
                case "remove": {
                    removeMethod.invoke(myHashMap, params[i][0]);
                    break;
                }
                case "get": {
                    System.out.println("index i : " + i + "  params : " + params[i][0]);
                    Assertions.assertEquals(expectResults[i], getMethod.invoke(myHashMap, params[i][0]));
                    break;
                }
                default:
                    break;
            }

        }


    }
}