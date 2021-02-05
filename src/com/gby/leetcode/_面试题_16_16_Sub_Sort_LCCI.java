package com.gby.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/sub-sort-lcci/
 */
public class _面试题_16_16_Sub_Sort_LCCI {
    /**
     * O(nlogn)
     *
     * @param array
     * @return
     */
    public int[] subSort(int[] array) {
        int[] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2);
        int l = -1;
        int r = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                l = i;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != array2[i]) {
                r = i;
                break;
            }
        }
        return new int[] {l, r};
    }

    /**
     * O(n^2) - timeout
     *
     * @param array
     * @return
     */
    public int[] subSort2(int[] array) {
        int l = -1;
        int r = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    if (l == -1) {
                        l = i;
                    }
                    if (j > r) {
                        r = j;
                    }
                }
            }
        }
        return new int[] {l, r};
    }
}

