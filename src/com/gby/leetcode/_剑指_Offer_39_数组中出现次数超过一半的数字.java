package com.gby.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 */
public class _剑指_Offer_39_数组中出现次数超过一半的数字 {
    /**
     * O(nlogn) - fast than 35.25%
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
