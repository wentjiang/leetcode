package com.wentjiang.leetcode.q1_100;

import java.util.*;

/**
 * @author wentaojiang
 * @date 2019/9/2 4:53 PM
 * @description
 */
public class Question22 {
    /**
     * 不完备的方法
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        if (n == 1) {
            return Collections.singletonList("()");
        }
        List<String> result = new ArrayList<>();
        List<String> origin = generateParenthesis(n - 1);
        for (String str : origin) {
            result.add("(" + str + ")");
            result.add("()" + str);
            result.add(str + "()");
        }
        Set<String> set = new HashSet<>(2 * result.size());
        set.addAll(result);
        result = new ArrayList<>(set);
        return result;
    }

    /**
     * 完备的方法
     */
    public List<String> generateParenthesis1(int n) {
        List<String> result = new ArrayList<>();
        getResult(result, "", 0, 0, n);
        return result;
    }

    public void getResult(List<String> result, String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            getResult(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            getResult(result, current + ")", open, close + 1, n);
        }
    }


    public List<String> generateParenthesis2(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur + "(", open + 1, close, max);
        if (close < open)
            backtrack(ans, cur + ")", open, close + 1, max);
    }

}
