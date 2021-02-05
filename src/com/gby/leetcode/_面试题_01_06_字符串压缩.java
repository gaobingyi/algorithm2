package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/compress-string-lcci/
 */
public class _面试题_01_06_字符串压缩 {
    /**
     * O(n) - fast than 98.25%
     *
     * @param S
     * @return
     */
    public String compressString(String S) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        int j = 1;
        int length = S.length();
        while (j <= length) {
            char c = S.charAt(i);
            while (j < length && c == S.charAt(j)) {
                j++;
            }
            builder.append(c).append(j - i);
            i = j;
            j++;
        }
        String s = builder.toString();
        return s.length() < length ? s : S;
    }
}
