package com.gby.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 */
public class _剑指_Offer_40_最小的k个数 {
    /**
     * O(nlogn) - fast than 71.94%
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }

    /**
     * fast than 20.78% ???
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers2(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((n1, n2) -> n2 - n1);
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < queue.peek()) {
                queue.poll();
                queue.add(arr[i]);
            }
        }
        int[] results = new int[k];
        int i = 0;
        while (!queue.isEmpty()) {
            results[i++] = queue.poll();
        }
        return results;
    }
}
