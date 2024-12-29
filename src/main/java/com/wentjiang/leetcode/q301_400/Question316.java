package com.wentjiang.leetcode.q301_400;

import java.util.*;

public class Question316 {

    /**
     * 单调栈, 贪心算法, 统计当前字符串中所有的字符出现的次数, 将元素一个一个加入到单调栈中 比较当前的字符与栈顶字符比较字典顺序 如果当前的字符的字典顺序小于栈顶字符,并且栈顶字符数量大于1的情况,将栈顶的字符出栈
     * 循环遍历到字符串末尾
     *
     * @param
     * 
     * @return
     */
    public String removeDuplicateLetters(String s) {
        // 统计当前字符串出现次数
        Map<Character, Integer> countMap = new HashMap<>();
        Set<Character> alreadyContainsCharacter = new HashSet<>();
        for (Character ch : s.toCharArray()) {
            countMap.merge(ch, 1, Integer::sum);
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (Character ch : s.toCharArray()) {
            if (!alreadyContainsCharacter.contains(ch) && stack.peek() != null) {
                while (!stack.isEmpty()) {
                    Character topCh = stack.peek();
                    if (ch - topCh <= 0 && countMap.get(topCh) > 1) {
                        stack.pop();
                        countMap.put(topCh, countMap.get(topCh) - 1);
                        alreadyContainsCharacter.remove(topCh);
                    } else {

                        break;
                    }
                }
            }
            if (!alreadyContainsCharacter.contains(ch)) {
                stack.push(ch);
                alreadyContainsCharacter.add(ch);
            } else {
                countMap.put(ch, countMap.get(ch) - 1);
            }

        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }
}
