package java.com.wentjiang.leetcode.practice.day1_1;

import com.wentjiang.leetcode.practice.day1_1.CompletePackage;
import com.wentjiang.leetcode.utils.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CompletePackageTest {

    private CompletePackage completePackage = new CompletePackage();

    @Test
    public void case1() {
        Integer[][] array = { { 5, 10 }, { 3, 1 } };
        ArrayList<Integer> result = completePackage.knapsack(6, 2, ArrayUtil.convertArrayToList2(array));
        Assertions.assertArrayEquals(new int[] { 10 }, new int[] { result.get(0) });
    }

    @Test
    public void case2() {
        Integer[][] array = { { 3, 10 }, { 9, 1 }, { 10, 1 } };
        ArrayList<Integer> result = completePackage.knapsack(8, 3, ArrayUtil.convertArrayToList2(array));
        Assertions.assertArrayEquals(new int[] { 20 }, new int[] { result.get(0) });
    }

    @Test
    public void case3() {
        Integer[][] array = { { 13, 189 }, { 17, 360 }, { 19, 870 }, { 14, 184 }, { 6, 298 }, { 16, 242 } };
        ArrayList<Integer> result = completePackage.knapsack(13, 6, ArrayUtil.convertArrayToList2(array));
        Assertions.assertArrayEquals(new int[] { 596 }, new int[] { result.get(0) });
    }

}