package com.gby.leetcode;

/**
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class _剑指_Offer_04_二维数组中的查找 {
    /**
     * O(nm) - fast than 100.00% ???
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rowLength = matrix.length;
        if (rowLength == 0) {
            return false;
        }
        int colLength = matrix[0].length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * O(n+m) - fast than 100.00%
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int rowLength = matrix.length;
        if (rowLength == 0) {
            return false;
        }
        int colLength = matrix[0].length;
        int row = 0;
        int col = colLength - 1;
        while (row < rowLength && col>= 0) {
            int curVal = matrix[row][col];
            if (curVal == target) {
                return true;
            } else if (curVal > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
