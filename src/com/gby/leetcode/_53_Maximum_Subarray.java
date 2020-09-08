package com.gby.leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray/
 *
 * @author shaoping
 * @date 2020/9/6
 */
public class _53_Maximum_Subarray {
    /**
     * 暴力法：O(n^2)
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int begin = 0; begin < nums.length; begin++) {
            int sum = 0;
            for (int end = begin; end < nums.length; end++) {
                sum += nums[end];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * 分治法：O(nlogn)
     *
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        return maxSubArray2(nums, 0, nums.length);
    }

    /**
     * 求区间[begin, end)上的最大和
     *
     * @param nums
     * @param begin
     * @param end
     * @return
     */
    private int maxSubArray2(int[] nums, int begin, int end) {
        if (begin == end - 1) {
            return nums[begin];
        }

        int mid = (begin + end) >> 1;
        int max = Math.max(maxSubArray2(nums, begin, mid), maxSubArray2(nums, mid, end));

        int leftMax = Integer.MIN_VALUE;
        int leftSum = 0;
        for (int i = mid - 1; i >= begin; i--) {
            leftSum += nums[i];
            if (leftSum > leftMax) {
                leftMax = leftSum;
            }
        }
        int rightMax = Integer.MIN_VALUE;
        int rightSum = 0;
        for (int i = mid; i < end; i++) {
            rightSum += nums[i];
            if (rightSum > rightMax) {
                rightMax = rightSum;
            }
        }

        return Math.max(max, leftMax + rightMax);
    }

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * 动态规划：O(n)
     *
     * @param nums
     * @return
     */
    public int maxSubArray3(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1] > 0) {
                dp[i] = dp[i-1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

    /**
     * 动态规划：O(n)（空间压缩）
     *
     * @param nums
     * @return
     */
    public int maxSubArray4(int[] nums) {
        int dp = nums[0];
        int max = dp;
        for (int i = 1; i < nums.length; i++) {
            if (dp > 0) {
                dp = dp + nums[i];
            } else {
                dp = nums[i];
            }
            if (dp > max) {
                max = dp;
            }
        }
        return max;
    }
}
