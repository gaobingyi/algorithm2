package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/string-to-url-lcci/
 */
public class _面试题_01_03_URL化 {
    public String replaceSpaces(String S, int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            builder.append(c != ' ' ? c : "%20");
        }
        return builder.toString();
    }
}
