package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class _剑指_Offer_03_数组中重复的数字 {
    /**
     * fast than 84.69%
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int length = nums.length;
        int[] counts = new int[length];
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            int count = counts[num];
            if (count != 0) {
                return num;
            }
            counts[num] = 1;
        }
        return -1;
    }
}
