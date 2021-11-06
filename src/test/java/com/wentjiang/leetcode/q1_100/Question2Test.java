package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.q1_100.Question2;
import com.wentjiang.leetcode.utils.ListNode;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/8/26 9:29 PM
 * 
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
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
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