package com.wentjiang.leetcode.q101_200;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question139 {
    //    public boolean wordBreak(String s, List<String> wordDict) {
//        boolean[] dp = new boolean[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            for (String word : wordDict) {
//                int length = word.length();
//                if (i + length <= s.length()) {
//                    String subString = s.substring(i, i + length);
//                    if (word.equals(subString)) {
//                        for (int j = i; j < i+ length; j++) {
//                            dp[j] = true;
//                        }
//                    }
//                }
//            }
//        }
//        for (boolean b: dp){
//            if (!b){
//                return false;
//            }
//        }
//        return true;
//    }
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        Set<String> wordSet = new HashSet<>(wordDict);
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


}
