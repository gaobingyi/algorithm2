package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */
public class _剑指_Offer_57_和为s的两个数字 {
    /**
     * O(n^2) - timeout
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        return new int[] {-1, -1};
    }

    /**
     * O(n) - fast than 95.37%
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[] {nums[l], nums[r]};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[] {-1, -1};
    }
}
