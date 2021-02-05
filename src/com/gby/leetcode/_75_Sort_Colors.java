package com.gby.leetcode;

/**
 * https://leetcode.com/problems/sort-colors/
 */
public class _75_Sort_Colors {
    /**
     * O(n) - fast than 100%
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < counts[0]) {
                nums[i] = 0;
            } else if (i < counts[0] + counts[1]) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }

    /**
     * O(n)
     *
     * @param nums
     */
    public void sortColors2(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i++, l++);
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, r--);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
