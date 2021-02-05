package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 */
public class _剑指_Offer_17_打印从1到最大的n位数 {
    /**
     * fast than 100%
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        int[] max = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999};
        int[] nums = new int[max[n - 1] ];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        return nums;
    }
}
