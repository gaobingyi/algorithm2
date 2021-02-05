package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 */
public class _剑指_Offer_29_顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        int rowMin = 0;
        int rowMax = matrix.length;
        if (rowMax == 0) {
            return new int[0];
        }
        int colMin = 0;
        int colMax = matrix[0].length;
        int[] results = new int[rowMax * colMax];
        int rowMid = rowMax / 2;
        int colMid = colMax / 2;
        int row = 0;
        int col = 0;
        int index = 0;
        while (row != rowMid || col != colMid) {
            while (col < colMax) {
                results[index++] = matrix[row][col++];
            }
            col--;
            if (row == rowMid && col == colMid) {
                return results;
            }
            row++;
            rowMin++;
            while (row < rowMax) {
                results[index++] = matrix[row++][col];
            }
            row--;
            if (row == rowMid && col == colMid) {
                return results;
            }
            col--;
            colMax--;
            while (col >= colMin) {
                results[index++] = matrix[row][col--];
            }
            col++;
            if (row == rowMid && col == colMid) {
                return results;
            }
            row++;
            rowMax--;
            while (row >= rowMin) {
                results[index++] = matrix[row--][col];
            }
            row++;
            if (row == rowMid && col == colMid) {
                return results;
            }
            col++;
            colMid++;
        }
        return results;
    }
}
