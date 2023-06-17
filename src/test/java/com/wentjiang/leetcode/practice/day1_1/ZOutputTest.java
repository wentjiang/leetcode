package java.com.wentjiang.leetcode.practice.day1_1;

import com.wentjiang.leetcode.practice.day1_1.ZOutput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZOutputTest {

    private ZOutput zOutput = new ZOutput();

    @Test
    public void case1() {
        String result = zOutput.zconvert("nowcoder", 3);
        Assertions.assertEquals("noocdrwe", result);
    }

    @Test
    public void case2() {
        String result = zOutput.zconvert("nowcoder", 4);
        Assertions.assertEquals("neodrwoc", result);
    }

    @Test
    public void case3() {
        String result = zOutput.zconvert("n", 4);
        Assertions.assertEquals("n", result);
    }

    @Test
    public void case4() {
        String result = zOutput.zconvert("no", 4);
        Assertions.assertEquals("no", result);
    }
}