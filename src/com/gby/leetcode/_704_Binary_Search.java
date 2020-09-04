package com.gby.leetcode;

/**
 * @author shaoping
 * @date 2020/9/4
 */
public class _704_Binary_Search {
    public int search(int[] nums, int target) {
        // 区间（左闭右开）：[begin, end)
        int begin = 0;
        int end = nums.length;
        while (begin < end) {
            int mid = ((end - begin) >> 1) + begin;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                begin = mid + 1;
            }
        }
        return -1;
    }
}
