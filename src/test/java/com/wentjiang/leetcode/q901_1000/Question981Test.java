package com.wentjiang.leetcode.q901_1000;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question981Test {


    @Test
    public void test() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        Assertions.assertEquals("bar", timeMap.get("foo", 1));
        Assertions.assertEquals("bar", timeMap.get("foo", 3));
    }


    @Test
    public void test1() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        timeMap.set("foo", "toilet", 5);
        timeMap.set("foo", "bucket", 10);
        timeMap.set("foo", "bar2", 20);
        Assertions.assertEquals("bucket", timeMap.get("foo", 15));
    }

}