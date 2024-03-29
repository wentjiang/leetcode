package com.wentjiang.leetcode.q1_100;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/4 11:18 AM
 * 
 * @description
 */
public class Question5_2Test {
    private Question5_2 question5;

    @Before
    public void setUp() throws Exception {
        question5 = new Question5_2();
    }

    @Test
    public void longestPalindrome1() {
        Assert.assertEquals("bab", question5.longestPalindrome("babad"));
    }

    @Test
    public void longestPalindrome2() {
        Assert.assertEquals("bb", question5.longestPalindrome("cbbd"));
    }

    @Test
    public void longestPalindrome3() {
        Assert.assertEquals("bb", question5.longestPalindrome("bb"));
    }

    @Test
    public void longestPalindrome4() {
        Assert.assertEquals("ccc", question5.longestPalindrome("ccc"));
    }

    @Test
    public void longestPalindrome5() {
        Assert.assertEquals("bb", question5.longestPalindrome("abcdbbfcba"));
    }

    @Test
    // @Ignore
    public void longestPalindrome6() {
        Assert.assertEquals("khvhk", question5.longestPalindrome("mwwfjysbkebpdjyabcfkgprtxpwvhglddhmvaprcvrnu"
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