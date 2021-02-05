package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/zero-matrix-lcci/
 */
public class _面试题_01_08_零矩阵 {
    /**
     * O(n^2) - fast than 100.00%
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        if (rowLength == 0) {
            return;
        }
        int colLength = matrix[0].length;
        boolean[] rows = new boolean[rowLength];
        boolean[] cols = new boolean[colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (matrix[i][j] != 0) {
                    continue;
                }
                rows[i] = true;
                cols[j] = true;
            }
        }
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
