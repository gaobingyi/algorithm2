package com.gby.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class _88_Merge_Sorted_Array {
    /**
     * O(nlogn) - fast than 100%
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, nums2.length);
        Arrays.sort(nums1);
    }

    /**
     * O(n)
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1;
        int i2 = n - 1;
        int k = nums1.length - 1;
        while (i2 >= 0) {
            if (i1 >= 0 && nums1[i1] > nums2[i2]) {
                nums1[k--] = nums1[i1--];
            } else {
                nums1[k--] = nums2[i2--];
            }
        }
    }
}
