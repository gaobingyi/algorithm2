package com.gby.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 *
 * @author shaoping
 * @date 2020/9/8
 */
public class _300_Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // dp[i]：以nums[i]结尾的递增子序列的最大长度
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j ++) {
                if (nums[j] >= nums[i]) {
                    continue;
                }
                if (dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
}
