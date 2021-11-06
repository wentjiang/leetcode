package com.wentjiang.leetcode.q801_900;

/**
 * 双指针法,从尾到头逐个遍历
 */
public class Question844_3 {
    public boolean backspaceCompare(String S, String T) {
        char backspace = '#';
        int indexS = S.length() - 1;
        int indexT = T.length() - 1;

        // 两个指针都从末尾向前移动
        while (indexS >= 0 || indexT >= 0) {
            int skipS = 0, skipT = 0;

            while (indexS >= 0) {
                // 如果遇到退格就缩减
                if (S.charAt(indexS) == backspace) {
                    indexS--;
                    skipS++;

                } else if (skipS > 0) {
                    // 遇到非退格就减1
                    indexS--;
                    skipS--;
                } else {
                    break;
                }
            }

            while (indexT >= 0) {
                if (T.charAt(indexT) == backspace) {
                    indexT--;
                    skipT++;
                } else if (skipT > 0) {
                    indexT--;
                    skipT--;
                } else {
                    break;
                }
            }

            if (indexS < 0 && indexT < 0) {
                return true;
            }
            // 如果长度都大于0的情况,进行比较
            if (indexS >= 0 && indexT >= 0) {
                if (S.charAt(indexS) != T.charAt(indexT)) {
                    return false;
                }
            } else {
                if (indexS >= 0 || indexT >= 0) {
                    return false;
                }
            }
            indexS--;
            indexT--;
        }
        return true;
    }
}
