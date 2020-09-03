package com.gby.sort;

/**
 * @author shaoping
 * @date 2020/9/3
 */
public class InsertSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int cur = i;
            while (cur > 0 && array[cur] < array[cur-1]) {
                swap(array, cur, cur-1);
                cur--;
            }
        }
    }

    public void sort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int cur = i;
            while (cur > 0 && array[cur-1] > temp) {
                array[cur] = array[cur-1];
                cur--;
            }
            array[cur] = temp;
        }
    }

    public void sort3(int[] array) {
        // TODO
    }
}
