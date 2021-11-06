package com.wentjiang.leetcode.q101_200;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/27 9:59 AM
 * 
 * @description
 */
public class Question146Test {

    private Question146.LRUCache cache;

    @Before
    public void setUp() throws Exception {
        cache = new Question146.LRUCache(2);
    }

    @Test
    public void test() {
        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(1, cache.get(1)); // 返回 1
        cache.put(3, 3); // 该操作会使得密钥 2 作废
        Assert.assertEquals(-1, cache.get(2));// 返回 -1 (未找到)
        cache.put(4, 4); // 该操作会使得密钥 1 作废
        Assert.assertEquals(-1, cache.get(1));// 返回 -1 (未找到)
        Assert.assertEquals(3, cache.get(3));// 返回 3
        Assert.assertEquals(4, cache.get(4));
    }
}