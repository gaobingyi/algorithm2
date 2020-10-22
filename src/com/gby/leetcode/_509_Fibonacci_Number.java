package com.gby.leetcode;

/**
 * https://leetcode.com/problems/fibonacci-number/
 *
 * @author shaoping
 * @date 2020/8/25
 */
public class _509_Fibonacci_Number {
    /**
     * 递归：时间复杂度：O(2^N)，空间复杂度：O(N)
     *
     * @param N
     * @return
     */
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }

    // -----------------------------------------------------------------------------------------------------------------

    public int fib3(int N) {
        if (N <= 1) {
            return N;
        }
        int[] array = new int[N + 1];
        array[0] = 0;
        array[1] = 1;
        return fib3(N, array);
    }

    private int fib3(int N, int[] array) {
        if (N > 0 && array[N] == 0) {
            array[N] = fib3(N-1, array) + fib3(N-2, array);
        }
        return array[N];
    }

    // -----------------------------------------------------------------------------------------------------------------

    public int fib4(int N) {
        if (N <= 1) {
            return N;
        }
        int[] array = new int[N + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= N; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[N];
    }

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * 循环：时间复杂度：O(N)，空间复杂度：O(1)
     *
     * @param N
     * @return
     */
    public int fib2(int N) {
        if (N <= 1) {
            return N;
        }
        int first = 0;
        int second = 1;
//        int sum;
        for (int i = 0; i < N - 1; i++) {
//            sum = first + second;
//            first = second;
//            second = sum;
            second += first;
            first = second - first;
        }
        return second;
    }
}
