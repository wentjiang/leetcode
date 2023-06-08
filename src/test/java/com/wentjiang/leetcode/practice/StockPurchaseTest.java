package com.wentjiang.leetcode.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StockPurchaseTest {

    private StockPurchase stockPurchase = new StockPurchase();

    @Test
    public void case1() {
        int result = stockPurchase.stockPurchase(new int[]{1, 2, 3});
        Assertions.assertEquals(2, result);
    }

    @Test
    public void case2() {
        int result = stockPurchase.stockPurchase(new int[]{3, 2, 1});
        Assertions.assertEquals(0, result);
    }

    @Test
    public void case3() {
        int result = stockPurchase.stockPurchase(new int[]{3, 1, 2});
        Assertions.assertEquals(1, result);
    }

    @Test
    public void case4() {
        int result = stockPurchase.stockPurchase(new int[]{3, 1, 2, 4, 1, 2});
        Assertions.assertEquals(4, result);
    }

}
