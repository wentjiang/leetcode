package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/4 11:18 AM
 * 
 * @description
 */
public class Question5_2Test {
    private Question5_2 question5 = new Question5_2();

    @Test
    public void longestPalindrome1() {
        assertEquals("bab", question5.longestPalindrome("babad"));
    }

    @Test
    public void longestPalindrome2() {
        assertEquals("bb", question5.longestPalindrome("cbbd"));
    }

    @Test
    public void longestPalindrome3() {
        assertEquals("bb", question5.longestPalindrome("bb"));
    }

    @Test
    public void longestPalindrome4() {
        assertEquals("ccc", question5.longestPalindrome("ccc"));
    }

    @Test
    public void longestPalindrome5() {
        assertEquals("bb", question5.longestPalindrome("abcdbbfcba"));
    }

    @Test
    // @Ignore
    public void longestPalindrome6() {
        assertEquals("khvhk", question5.longestPalindrome("mwwfjysbkebpdjyabcfkgprtxpwvhglddhmvaprcvrnu"
                + "xifcrjpdgnktvmggmguiiquibmtviwjsqwtchkqgxqwljouunurcdtoeygdqmijdympcamawnlzsxucbpqtuwkjfqnzvvvigifyvymfhtpp"
                + "qamlgjozvebygkxawcbwtouaankxsjrteeijpuzbsfsjwxejtfrancoekxgfyangvzjkdskhs"
                + "sdjvkvdskjtiybqgsmpxmghvvicmjxqtxdowkjhmlnfcpbtwvtmjhnzntxyfxyinmqzivxkwigkondghzmbioelmepgfttczskvqfejfii"
                + "bxjcuyevvpawybcvvxtxycrfbcnpvkzryrqujqaqhoagdmofgdcbhvlwgwmsmhomknbanvntspvvhvccedzzngdywuccxrnzbtchisdwsr"
                + "fdqpcwknwqvalczznilujdrlevncdsyuhnpmheukottewtkuzhookcsvctsqwwdvfjxifpfsqxpmpwospndozcdbfhselfdltmpujlnhfz"
                + "jcgnbgprvopxklmlgrlbldzpnkhvhkybpgtzipzotrgzkdrqntnuaqyaplcybqyvidwcfcuxinchretgvfaepmgilbrtxgqoddzyjmmupk"
                + "jqcypdpfhpkhitfegickfszermqhkwmffdizeoprmnlzbjcwfnqyvmhtdekmfhqwaftlyydirjnojbrieutjhymfpflsfemkqsoewbojwlu"
                + "qdckmzixwxufrdpqnwvwpbavosnvjqxqbosctttxvsbmqpnolfmapywtpfaotzmyjwnd"));
    }
}