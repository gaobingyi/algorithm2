package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/missing-number-lcci/
 */
public class _面试题_17_04_消失的数字 {
    /**
     * O(n) - fast than 100%
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (i - nums[i]);
        }
        return sum + nums.length;
    }
}
