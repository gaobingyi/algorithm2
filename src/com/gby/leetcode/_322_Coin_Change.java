package com.gby.leetcode;

/**
 * https://leetcode.com/problems/coin-change/
 *
 * @author shaoping
 * @date 2020/9/7
 */
public class _322_Coin_Change {
    /**
     * 暴力递归（自顶向下）
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, amount - coin);
            if (res < min && res >= 0) {
                min = res;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min + 1;
    }

    /**
     * 记忆化搜索（自顶向下）
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange2(int[] coins, int amount) {
        int[] counts = new int[amount + 1];
        return coinChange2(coins, amount, counts);
    }

    private int coinChange2(int[] coins, int amount, int[] counts) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        if (counts[amount] != 0) {
            return counts[amount];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange2(coins, amount - coin, counts);
            if (res < min && res >= 0) {
                min = res;
            }
        }
        counts[amount] = (min == Integer.MAX_VALUE) ? -1 : min + 1;
        return counts[amount];
    }

    /**
     * 动态规划（自底向上）
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange3(int[] coins, int amount) {
        // TODO

        return -1;
    }
}
