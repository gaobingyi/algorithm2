package com.gby.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/check-permutation-lcci/
 */
public class _面试题_01_02_判定是否互为字符重排 {

    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] char1s = s1.toCharArray();
        Arrays.sort(char1s);
        char[] char2s = s2.toCharArray();
        Arrays.sort(char2s);
        for (int i = 0; i < char1s.length; i++) {
            if (char1s[i] != char2s[i]) {
                return false;
            }
        }
        return true;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public boolean CheckPermutation2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> count1 = count(s1);
        Map<Character, Integer> count2 = count(s2);
        return count1.equals(count2);
    }

    private Map<Character, Integer> count(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        return count;
    }

}
