package com.gby.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/is-unique-lcci/
 */
public class _面试题_01_01_判定字符是否唯一 {
    /**
     * O(n^2) - fast than 100% ???
     *
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            for (int j = i + 1; j < astr.length(); j++) {
                if (astr.charAt(i) == astr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * O(nlogn) - fast than 100% ???
     *
     * @param astr
     * @return
     */
    public boolean isUnique2(String astr) {
        if (astr.length() == 1) {
            return true;
        }
        char[] chars = astr.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                if (chars[i] == chars[i + 1]) {
                    return false;
                }
            } else if (i == chars.length - 1) {
                if (chars[i] == chars[i - 1]) {
                    return false;
                }
            } else {
                if (chars[i] == chars[i - 1] || chars[i] == chars[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isUnique3(String astr) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            if (characterSet.contains(c)) {
                return false;
            } else {
                characterSet.add(c);
            }
        }
        return true;
    }

}
