package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/string-rotation-lcci/
 */
public class _面试题_01_09_字符串轮转 {
    /**
     * fast than 7.18% !!!
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s2.equals(s1.substring(i + 1) + s1.substring(0, i + 1))) {
                return true;
            }
        }
        return false;
    }

    /**
     * fast than 31.53% !!!
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean isFlipedString2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        String s = s1 + s1;
        int length = s1.length();
        for (int i = 1; i < length; i++) {
            if (s.charAt(i) != s2.charAt(0)) {
                continue;
            }
            if (s2.equals(s.substring(i, i + length))) {
                return true;
            }
        }
        return false;
    }
}
