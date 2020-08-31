package com.gby.sort;

/**
 * @author shaoping
 * @date 2020/8/31
 */
public class SelectSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                swap(array, maxIndex, i);
            }
        }
    }
}
