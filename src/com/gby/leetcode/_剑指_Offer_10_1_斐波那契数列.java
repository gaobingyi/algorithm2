package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
public class _剑指_Offer_10_1_斐波那契数列 {
    /**
     * O(2^n) - timeout
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * O(n) - 100.00%
     *
     * @param n
     * @return
     */
    public int fib2(int n) {
        if (n < 2) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = (first + second) % 1000000007;
            first = second;
            second = sum;
        }
        return second;
    }
}
