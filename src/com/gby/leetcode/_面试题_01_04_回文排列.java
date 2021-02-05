package com.gby.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/palindrome-permutation-lcci/
 */
public class _面试题_01_04_回文排列 {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        int oddCount = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

    public boolean canPermutePalindrome2(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int oddCount = 0;
        int i = 0;
        int j = 1;
        while (i < chars.length) {
            if (i == chars.length - 1) {
                oddCount++;
                i++;
            } else {
                while (j < chars.length && chars[i] == chars[j]) {
                    j++;
                }
                if ((j - i) % 2 != 0) {
                    oddCount++;
                    if (oddCount > 1) {
                        return false;
                    }
                }
                i = j;
                j++;
            }
        }
        return oddCount <= 1;
    }

}
