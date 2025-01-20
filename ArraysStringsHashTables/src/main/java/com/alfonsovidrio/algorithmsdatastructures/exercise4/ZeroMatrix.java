package com.alfonsovidrio.algorithmsdatastructures.exercise4;

/*
 * Given a matrix, write an algorithm to set zeros in row R and column C if there is a 0 in cell R:C.
 *
 * Example:
 *   Input:  2 1 3 0 2
 *              7 4 1 3 8
 *              4 0 1 2 1
 *              9 3 4 1 9
 *
 *   Output: 0 0 0 0 0
 *               7 0 1 0 8
 *               0 0 0 0 0
 *               9 0 4 0 9
 */

public class ZeroMatrix {

    public static void zeroMatrix(int[][] matrix) {
        boolean firstRowHasZero = hasFirstRowAnyZero(matrix);
        boolean firstColHasZero = hasFirstColAnyZero(matrix);

        checkForZeroes(matrix);

        processRows(matrix);
        processColums(matrix);

        if (firstRowHasZero) {
            setRowToZero(matrix, 0);
        }

        if (firstColHasZero) {
            setColToZero(matrix, 0);
        }
    }

    private static boolean hasFirstRowAnyZero(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) return true;
        }
        return false;
    }

    private static boolean hasFirstColAnyZero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) return true;
        }
        return false;
    }

    private static void checkForZeroes(int[][] matrix) {
        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
    }

    private static void processRows(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                setRowToZero(matrix, row);
            }
        }
    }

    private static void setRowToZero(int[][] matrix, int row) {
        for (int col = 0; col < matrix[0].length; col++) {
            matrix[row][col] = 0;
        }
    }

    private static void processColums(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                setColToZero(matrix, col);
            }
        }
    }

    private static void setColToZero(int[][] matrix, int col) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][col] = 0;
        }
    }

}
