package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.q1_100.Question2;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author wentaojiang
 * @date 2019/8/26 9:29 PM
 * @description
 */
public class Question2Test {

    private Question2 question2;

    @Before
    public void setUp() throws Exception {
        question2 = new Question2();
    }

    @Test
    public void addTwoNumbers() {
        Question2.ListNode l11 = new Question2.ListNode(2);
        Question2.ListNode l12 = new Question2.ListNode(4);
        Question2.ListNode l13 = new Question2.ListNode(3);
        l11.next = l12;
        l12.next = l13;

        Question2.ListNode l21 = new Question2.ListNode(5);
        Question2.ListNode l22 = new Question2.ListNode(6);
        Question2.ListNode l23 = new Question2.ListNode(4);
        l21.next = l22;
        l22.next = l23;

        assertEquals("807", inversion(question2.addTwoNumbers(l11, l21).toString()));
    }

    /**
     * 字符串反转函数
     */
    public static String inversion(String original) {
        char[] chars = original.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        StringBuilder sb = new StringBuilder();
        Stream.of(chars).forEach(sb::append);
        return sb.toString();
    }

}