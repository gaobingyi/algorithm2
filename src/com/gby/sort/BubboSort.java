package com.gby.sort;

/**
 * @author shaoping
 * @date 2020/8/28
 */
public class BubboSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }
}
